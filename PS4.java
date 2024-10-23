
import java.util.Scanner;

class Employee {
String name;
int age;
double salary;

public void inputDetails() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter employee name: ");
name = scanner.nextLine();
System.out.print("Enter employee age: ");
age = scanner.nextInt();
System.out.print("Enter employee salary: ");
salary = scanner.nextDouble();
}

public void displayDetails() {
System.out.println("\nEmployee Details:");
System.out.println("Name: " + name);
System.out.println("Age: " + age); 
System.out.println("Salary: " + salary);
}
}
public class Main {
public static void main(String[] args) {
  Employee employee = new Employee();
employee.inputDetails();
employee.displayDetails();
}
}