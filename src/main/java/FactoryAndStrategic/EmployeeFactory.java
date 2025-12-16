package FactoryAndStrategic;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static Map<String,Class<? extends Employee>> employeeMap = new HashMap<>();



    public static void register(String employeeType, Class<? extends Employee> employee) {
        employeeMap.put(employeeType, employee);
    }

    public static Employee getEmployee(String type) {
        Class<? extends Employee> clazz = employeeMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("Invalid employee type: " + type);
        }

        try {
            // Instantiate using default constructor
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot create instance of " + type, e);
        }
    }


}
