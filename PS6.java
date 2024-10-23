import java.util.Scanner;
public class Main {
public static int recursiveFibonacci(int n) {
if (n <= 1) {
return n;
}
return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
}
public static int nonRecursiveFibonacci(int n) {
if (n <= 1) {
return n;
}
int prev1 = 1;
int prev2 = 1; 
int fib = 0;
for (int i = 2; i < n; i++) {
fib = prev1 + prev2; 
prev1 = prev2; 
prev2 = fib;
}
return fib;
}
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = scanner.nextInt();
if (n <= 0) {
System.out.println("Please enter a positive integer."); 
return;
}
int recursiveResult = recursiveFibonacci(n);
int nonRecursiveResult = nonRecursiveFibonacci(n);
System.out.println("Using Recursive Function:"); 
System.out.println("Fibonacci(" + n + ") = " + recursiveResult);
System.out.println("\nUsing Non-Recursive Function:"); 
System.out.println("Fibonacci(" + n + ") = " + nonRecursiveResult);
}
}