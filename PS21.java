public class Main {
public static void main(String[] args) {
try {
int[] numbers = { 1, 2, 3 };
System.out.println(numbers[5]); 
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array index out of bounds!");
}
try {
String str = null;
System.out.println(str.length());
} catch (NullPointerException e) {
System.out.println("NullPointerException occurred!");
}
try {
int result = 10 / 0;
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.out.println("ArithmeticException occurred!");
} finally {
System.out.println("Finally block executed.");
}
System.out.println("Program completed.");
}
}