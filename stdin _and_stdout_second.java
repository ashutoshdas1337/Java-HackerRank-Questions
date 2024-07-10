import java.util.Scanner;

public class stdin_and_stdout_second{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Reading inputs
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();  // Consume the newline left-over
        String s = scan.nextLine();
        
        // Printing outputs
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}
