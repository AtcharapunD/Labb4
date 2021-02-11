import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int PER_LINE = 5;
        int start,end,i,count = 0;

        System.out.print("Enter Start Number : ");
        start = scan.nextInt();
        System.out.print("Enter End Number : ");
        end = scan.nextInt();

        System.out.println();

        for (i = start ; i <= end ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i + "\t");
                count++;
                if (count % PER_LINE == 0)
                    System.out.println();
            }
        }
    }
}