import java.util.Scanner;
 
public class Exam02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long num,checknum,odd = 0, even = 0,zero = 0;

        System.out.print("Enter position number : ");
        num = scan.nextLong();

        while (num > 0){
            checknum = num % 10;
            if (checknum % 2 == 0 && checknum > 0){
                even++;
            }
            else if (checknum % 2 != 0 && checknum > 0){
                odd++;
            }
            else if (checknum == 0){
                zero++;
            }
            num = num / 10;
        }
        System.out.println("Odd digit :" + odd);
        System.out.println("Even digit : " + even);
        System.out.println("Zero digit : " + zero);
    }
}
