package FactoryDesignPattern;

public class WebDeveloper implements Employee {


    static {
        EmployeeFactory.register("WebDeveloper", WebDeveloper::new);
        System.out.println(EmployeeFactory.employeeMap);
    }

    @Override
    public int salary() {
        return 1000;
    }
}
