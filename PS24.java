import java.util.Random;
class RandomNumberGenerator implements Runnable {
@Override
public void run() {
Random random = new Random();
while (true) {
int number = random.nextInt(100); 
System.out.println("Generated: " + number);
if (number % 2 == 0) {
Thread t2 = new Thread(new SquareCalculator(number)); 
t2.start();
} else {
Thread t3 = new Thread(new CubeCalculator(number)); 
t3.start(); 
}
try {
Thread.sleep(1000); 
} catch (InterruptedException e) { 
  Thread.currentThread().interrupt();
}
}
}
}

class SquareCalculator implements Runnable {
private int number;
public SquareCalculator(int number) { 
  this.number = number;
}
@Override
public void run() {
  int square = number * number; 
  System.out.println("Square of " + number + ": " + square);
}
}
class CubeCalculator implements Runnable {
private int number;
public CubeCalculator(int number) { 
  this.number = number;
}
@Override
public void run() {
int cube = number * number * number; 
System.out.println("Cube of " + number + ": " + cube);
}
}
public class Main {
public static void main(String[] args) {
Thread t1 = new Thread(new RandomNumberGenerator()); 
t1.start();
}
}