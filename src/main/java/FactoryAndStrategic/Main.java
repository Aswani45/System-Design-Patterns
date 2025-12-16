package FactoryAndStrategic;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory.register("WebDeveloper",WebDeveloper.class);
        EmployeeFactory.register("AndroidDeveloper",AndroidDeveloper.class);
        Employee webDeveloper = EmployeeFactory.getEmployee("WebDeveloper");
        Employee androidDeveloper = EmployeeFactory.getEmployee("AndroidDeveloper");
        System.out.println(webDeveloper.salary());
        System.out.println(androidDeveloper.salary());
    }
}
