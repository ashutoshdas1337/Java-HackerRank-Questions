import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class if-else{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
         n = scanner.nextInt();
       if(n%2!=0){
           System.out.println("Weird");
       }
       if(n%2==0&&n>=2&&n<=5){
           System.out.println("Not Weird");
       }
       if(n%2==0&&n>=6&&n<=20){
           System.out.println("Weird");
       }
       if(n%2==0&&n>20){
           System.out.println("Not Weird");
       }

        scanner.close();
    }
}
