public class ClassMain {
    public static void main(String[] args) {
        Company comp = new Company("TechVision Ltd.", 3);

        comp.addEmployee(new Employee("Mark", new Position("Manager", 75000)));
        comp.addEmployee(new Employee("Zukerberg", new Position("Developer", 55000)));
        comp.addEmployee(new Employee("Rober", new Position("Designer", 50000)));

        comp.showEmployees();
    }
}
