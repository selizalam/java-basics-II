public class Employee extends Person {
    private int salary;
    public Employee(){

    }

    public String speak(){
        Person employee = new Person("Sarah", "Lam", (byte) 22, 2463781);
        return "This employee is " + employee.getFirstName();
    }
    public int getSalary(int salary){
        return this.salary = salary;
    }
    public static void main(String[] args) {
        Employee worker = new Employee();
        System.out.println(worker.speak() + " and her salary is " + worker.getSalary(800000) + ".");
        
    }
}
