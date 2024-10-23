import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your text (Enter an empty line to finish):");
int charCount = 0;
int wordCount = 0; 
int lineCount = 0;
while (true) {
String line = scanner.nextLine();
if (line.isEmpty()) {
break; 
}
charCount += line.length();
String[] words = line.split("\\s+");
wordCount += words.length;
lineCount++;
}
System.out.println("Character count: " + charCount); 
System.out.println("Word count: " + wordCount); 
System.out.println("Line count: " + lineCount);
}
}
