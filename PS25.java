import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
ArrayList<Integer> dynamicArray = new ArrayList<>();
dynamicArray.add(10);
dynamicArray.add(20);
dynamicArray.add(30);
dynamicArray.add(40);
System.out.println("Contents of the array:"); 
for (int i = 0; i < dynamicArray.size(); i++) {
System.out.println(dynamicArray.get(i)); 
}
}
}