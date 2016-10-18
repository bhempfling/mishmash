import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello! Time for a test.");
        int math = 1 + 2 + 3 + 4;
        String name = "Brandon";
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is 1 + 2 + 3 + 4? ");
        int answer = input.nextInt();
        
        if (answer == math) {
            System.out.println("That's right " + name + "!");
        }
        else {
            System.out.println("That is wrong " + name + " :(");
        }
    }
}