// 6206021612121 นางสาวอัจฉราพรรณ ดาสนม

import java.util.Scanner;

public class HWIf_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double time,distance,fare;
        int hour = 2;

        System.out.println("*************************************************************");
        System.out.println("                         Taxi Recepit                        ");
        System.out.println("*************************************************************");
        System.out.print("Enter Distance (Kilomate) : ");
        distance = scan.nextInt();
        System.out.print("Enter Times (Hour) : ");
        time = scan.nextInt();        
        System.out.println("*************************************************************");

        if (distance >= 0 && distance <= 1) {
            System.out.println("Your price of distance is : " + (distance * 35 ) + " Baht");
            time = distance * 35;
            System.out.println("Your price of times is : " + (time * hour) + " Baht");
            fare = time * hour ;
            System.out.println("Your price of fare is : " + (time + fare) + " Baht");
            System.out.println("*************************************************************");
        }

        else if (distance >= 2 && distance < 12){
            System.out.println("Your price of distance is : " + (distance * 5 ) + " Baht");
            time = distance * 5;
            System.out.println("Your price of times is (2 Baht/Hour) : " + (time * hour) + " Baht");
            fare = time * hour ;
            System.out.println("Your price of fare is : " + (time + fare) + " Baht");
            System.out.println("*************************************************************");
        }

        else if (distance >= 12 && distance < 20){
            System.out.println("Your price of distance is : " + (distance * 5.50 ) + " Baht");
            time = distance * 5.50;
            System.out.println("Your price of times is (2 Baht/Hour) : " + (time * hour) + " Baht");
            fare = time * hour ;
            System.out.println("Your price of fare is : " + (time + fare) + " Baht");
            System.out.println("*************************************************************");
        }

        else if (distance >= 20 && distance < 40){
            System.out.println("Your price of distance is : " + (distance * 6 ) + " Baht");
            time = distance * 6;
            System.out.println("Your price of times is (2 Baht/Hour) : " + (time * hour) + " Baht");
            fare = time * hour ;
            System.out.println("Your price of fare is : " + (time + fare) + " Baht");
            System.out.println("*************************************************************");
        }

        else if (distance >= 40 && distance < 60){
            System.out.println("Your price of distance is : " + (distance * 6.50 ) + " Baht");
            time = distance * 6.50 ;
            System.out.println("Your price of times is (2 Baht/Hour) : " + (time * hour) + " Baht");
            fare = time * hour ;
            System.out.println("Your price of fare is : " + (time + fare) + " Baht");
            System.out.println("*************************************************************");
        }

        else if (distance >= 60 && distance < 80){
            System.out.println("Your price of distance is : " + (distance * 7.50 ) + " Baht");
            time = distance * 7.50;
            System.out.println("Your price of times is (2 Baht/Hour) : " + (time * hour) + " Baht");
            fare = time * hour ;
            System.out.println("Your price of fare is : " + (time + fare) + " Baht");
            System.out.println("*************************************************************");
        }

        else if (distance >= 80){
            System.out.println("Your price of distance is : " + (distance * 8.50 ) + " Baht");
            time = distance * 8.50;
            System.out.println("Your price of times is (2 Baht/Hour) : " + (time * hour) + " Baht");
            fare = time * hour ;
            System.out.println("Your price of fare is : " + (time + fare) + " Baht");
            System.out.println("*************************************************************");
        }
    }
}