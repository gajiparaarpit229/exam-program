class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}
public Member(String name,int age,String phone_number,String address,double salary){
    this.name=name;
    this.age=age;
    this.phone_number=phone_number;
    this.address=address;
    this.salary=salary;

class Employee extends Member {
    String specialization;
    public employee(String name,int age,String phone_Number,String address,double salary,String specialization){
    super(String name,int age,String phone_Number,String address,double salary);
    this.specialization=specialization;
}
}

class Manager extends Member {
    String department;
    public department(String name,int age,String phone_Number,String address,double salary,String department){
    super(String name,int age,String phone_Number,String address,double salary);
    this.department=department;
}
}
public class CompanyDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Arpit Gajipara";
        emp.age = 19;
        emp.phoneNumber = "9879638594";
        emp.address = "Goverdhan chowk,150 feet ring road";
        emp.salary = 100000.0;
        emp.specialization = "Hacking";

        Manager manager = new Manager();
        manager.name = "Bharatbhai Gajipara";
        manager.age = 40;
        manager.phoneNumber = "9879631594";
        manager.address = "Goverdhan chowk 150 feet ring road";
        manager.salary = 120000.0;
        manager.department = "Engineering Experties";

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
