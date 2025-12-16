package FactoryDesignPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EmployeeFactory {


//    public static Employee getEmployee(String employeeType) {

//        if (employeeType.equals("WebDeveloper")) {
//            return new WebDeveloper();
//        } else if (employeeType.equals("AndroidDeveloper")) {
//            return new AndroidDeveloper();
//        }
//        throw new IllegalArgumentException("Invalid employee type");

        //In Above example , what if we want to add new employee type ?
        //We need to modify this class , which is not good for future proofing
        //We can use Map or some other design pattern to make it future proof

        //registry design pattern
//    }


    static Map<String, Supplier<Employee>> employeeMap = new HashMap<>();


    static void register(String employeeType, Supplier<Employee> employee) {
        employeeMap.put(employeeType, employee);
    }

    static Employee createEmployee(String employeeType) {
        Supplier<Employee> supplier = employeeMap.get(employeeType);
        if (supplier == null) {
            throw new IllegalArgumentException("Invalid employee type");
        }
        return supplier.get(); // create instance
    }
}
