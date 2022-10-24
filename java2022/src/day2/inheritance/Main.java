package day2.inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        //inherit edilen alanlar
        customer.id = 1;
        employee.id = 2;

        customer.age = 20;
        employee.age = 32;

        // kendi classlarindaki alanlar
        customer.email = "email";
        employee.salary = 1111;

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        //inherit edilen metotlar
        customerManager.add();
        employeeManager.add();

        // kendi classlarindaki metotlar
        customerManager.updateInfo();
        employeeManager.getBestEmployee();
    }
}
