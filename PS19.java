import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a line of integers separated by spaces: ");
String inputLine = scanner.nextLine();
StringTokenizer tokenizer = new StringTokenizer(inputLine);
int sum = 0; 
System.out.println("Integers and their sum:");
while (tokenizer.hasMoreTokens()) {
String token = tokenizer.nextToken(); 
int number = Integer.parseInt(token); 
System.out.println(number); 
sum += number;
}
System.out.println("Sum of all integers: " + sum);
}
}