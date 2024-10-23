class OuterClass {
private int outerValue = 10; 
class InnerClass {
void display() {
System.out.println("Value from InnerClass: " + outerValue);
}
}


void useInnerClass() {
InnerClass inner = new InnerClass(); 
inner.display(); 
}
}
public class Main {
public static void main(String[] args) {
OuterClass outer = new OuterClass();
outer.useInnerClass();
}
}