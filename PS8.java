import java.util.Scanner;
public class Main {
public static void main(String[] args) {
  
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of rows in the first matrix: ");
int rowsA = scanner.nextInt();
System.out.print("Enter the number of columns in the first matrix: ");
int colsA = scanner.nextInt();
System.out.print("Enter the number of rows in the second matrix: "); 
int rowsB = scanner.nextInt();
System.out.print("Enter the number of columns in the second matrix: "); 
int colsB = scanner.nextInt();

if (colsA != rowsB) {
System.out.println("Matrix multiplication is not possible.");
return;
}
int[][] matrixA = new int[rowsA][colsA];
int[][] matrixB = new int[rowsB][colsB];
System.out.println("Enter elements of the first matrix:");
for (int i = 0; i < rowsA; i++) {
for (int j = 0; j < colsA; j++) { 
  matrixA[i][j] = scanner.nextInt();
}
}
System.out.println("Enter elements of the second matrix:"); 
for (int i = 0; i < rowsB; i++) {
for (int j = 0; j < colsB; j++) { 
  matrixB[i][j] = scanner.nextInt();
}
}
int[][] resultMatrix = multiplyMatrices(matrixA, matrixB, rowsA, colsA, colsB);
System.out.println("Resultant matrix after multiplication:"); 
for (int i = 0; i < rowsA; i++) {
for (int j = 0; j < colsB; j++) { 
  System.out.print(resultMatrix[i][j] + " ");
}
System.out.println();
}
}
public static int[][] multiplyMatrices(int[][] A, int[][] B, int rowsA, int colsA, int colsB) {
  int[][] result = new int[rowsA][colsB];
for (int i = 0; i < rowsA; i++) { 
  for (int j = 0; j < colsB; j++) {
result[i][j] = 0;
for (int k = 0; k < colsA; k++) {
  result[i][j] += A[i][k] * B[k][j];
}
}
}
return result;
}
}