package FactoryDesignPattern;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        instead of doing new AndroidDeveloper() or new WebDeveloper() , things
//        can be done using factory method with loosed coupling  where
//        we don't need to directly create objects

        Class.forName("FactoryDesignPattern.WebDeveloper");
        Class.forName("FactoryDesignPattern.AndroidDeveloper");
        Employee webDeveloper = EmployeeFactory.createEmployee("WebDeveloper");
        Employee androidDeveloper = EmployeeFactory.createEmployee("AndroidDeveloper");
        System.out.println(webDeveloper.salary());
        System.out.println(androidDeveloper.salary());
    }
}
