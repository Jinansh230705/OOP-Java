import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
      Scanner o1 = new Scanner(System.in);
      System.out.println("Enter the Name:\n");
      String i= o1.nextLine();
      System.out.println("Enter your Age:\n");
      Integer i1=o1.nextInt();
      System.out.println("Enter Your Gender:\n");
      Character i2=o1.next().charAt(0);
      System.out.println("Enter your ID No.:\n");
      Integer i3=o1.nextInt();
      System.out.println("Enter your Salary:\n");
      Float i4= o1.nextFloat();
      

      System.out.println("Your name is:\n" +i);
      System.out.println("Your age is:\n"+i1);
      System.out.println("Your Gender is:\n"+i2);
      System.out.println("Your ID No. is:\n"+i3);
      System.out.println("Your Salary is:\n"+i4);
      
  }                         
}
