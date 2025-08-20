import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main {
    public static void main(String[] args) throws Exception {

        // Employee employee = new Employee();
        // Manager manager = new Manager();
        // manager do tipo de Employee.

        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        System.out.println(employee.getClass().getCanonicalName());
        // esse switch só funciona sem o default por causa da classe SEALE

        switch (employee) {
            case Manager manager -> {
                employee.setCode("123");
                employee.setName("Vitor");
                employee.setSalary(12333);
                manager.setLogin("Vitro");
                manager.setPassword("2131");
                manager.setCommission(1200);

                System.out.println(employee.getCode());
                System.out.println(employee.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
            }
            case Salesman salesman -> {
                salesman.setCode("124");
                salesman.setName("Pedro");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);
                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary(800));

        System.out.println("Salario = " + employee.getFullSalary());

    }
}
