public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee salesman = new Salesman();
        Manager manager = new Manager();

        System.out.println(employee instanceof Salesman);

    }
}
