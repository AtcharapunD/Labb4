// 6206021612121 นางสาวอัจฉราพรรณ ดาสนม

import java.util.Scanner;

class HWIf_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day;

        System.out.print("Enter Days (Only 28, 29,30, 31) : ");
        day = scan.nextInt();

        if (day == 28)
            System.out.println("Your number is" + day + "Febuary have 28 Days and 29 Days");
        if (day == 29)
            System.out.println("Your number is" + day + "Febuary have 28 Days and 29 Days");
        if (day == 30)
            System.out.println("Your number is" + day + "Mount has 30 Days have April, June, September, November");
        if (day == 31)
            System.out.println("Your number is" + day + "Mount has 31 Days have January, March, May, July, August, October and December");
        else 
            System.out.println(" !!ERROR NOT FOUND!! ");
    }
}
