import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {

        String str1 = "";
        Scanner scan = new Scanner(System.in);
        boolean prime = true;

        System.out.print("Enter positive number : ");
        int number = scan.nextInt();
        int limit = (int) Math.sqrt(number);
        
        for (int i = 2 ; i <= limit ; i++){
            if (number % i == 0) {
                prime = false;

                break;
            }
        }

        if (prime == true) {
            str1 = " is prime number." ;
        } else 
            str1 = " is not prime number." ;

        System.out.println(" Number " + number + str1);
    }
}