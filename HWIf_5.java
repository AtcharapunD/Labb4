// 6206021612121 นางสาวอัจฉราพรรณ ดาสนม

import java.util.Scanner;

public class HWIf_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name,surname;
        double salary,year,bonus;


        System.out.println("                                                   ");
        System.out.println("---------------------------------------------------");
        System.out.println("                     Salary                        ");
        System.out.println("---------------------------------------------------");
        System.out.print("Enter your name : ");
        name = scan.nextLine();
        System.out.print("Enter your surname : ");
        surname = scan.nextLine();
        System.out.print("Enter your salary : ");
        salary = scan.nextInt();
        System.out.println("---------------------------------------------------");
        System.out.println("Your name is " + name + " " + surname);
        System.out.println("                                                   ");

        if (salary > 0 && salary <= 15000) {
            System.out.println("Salary this year is " + (salary * 12) + " Baht");
            year = salary *12;
            System.out.println("You don't get bonus");
            System.out.println("---------------------------------------------------");
            System.out.println("Your all salary is " + year);
            System.out.println("---------------------------------------------------");
            System.out.println("                                                   ");
        }

        else if (salary >= 15001 && salary <= 20000) {
            System.out.println("Salary this year is " + (salary * 12) + " Baht");
            year = salary *12;
            System.out.println("You get bonus 7% of salary");
            System.out.println("Your bonus this year is " + (year * 0.07) + " Baht");
            bonus = (year * 0.07);
            System.out.println("---------------------------------------------------");
            System.out.println("Your all salary is " + (year + bonus) +" Baht");
            System.out.println("---------------------------------------------------");
            System.out.println("                                                   ");
        }

        else if (salary >= 20001 && salary <= 30000) {
            System.out.println("Salary this year is " + (salary * 12) + " Baht");
            year = salary *12;
            System.out.println("You get bonus 10% of salary");
            System.out.println("Your bonus this year is " + (year * 0.10) + " Baht");
            bonus = (year * 0.10);
            System.out.println("---------------------------------------------------");
            System.out.println("Your all salary is " + (year + bonus) +" Baht");
            System.out.println("---------------------------------------------------");
            System.out.println("                                                   ");
        }

        else if (salary >= 30001 && salary <= 40000) {
            System.out.println("Salary this year is " + (salary * 12) + " Baht");
            year = salary *12;
            System.out.println("You get bonus 12% of salary");
            System.out.println("Your bonus this year is " + (year * 0.12) + " Baht");
            bonus = (year * 0.12);
            System.out.println("---------------------------------------------------");
            System.out.println("Your all salary is " + (year + bonus) +" Baht");
            System.out.println("---------------------------------------------------");
            System.out.println("                                                   ");
        }

        else if (salary >= 40001 && salary <= 60000) {
            System.out.println("Salary this year is " + (salary * 12) + " Baht");
            year = salary *12;
            System.out.println("You get bonus 13% of salary");
            System.out.println("Your bonus this year is " + (year * 0.13) + " Baht");
            bonus = (year * 0.13);
            System.out.println("---------------------------------------------------");
            System.out.println("Your all salary is " + (year + bonus) +" Baht");
            System.out.println("---------------------------------------------------");
            System.out.println("                                                   ");
        }

        else if (salary >= 60001 && salary <= 70000) {
            System.out.println("Salary this year is " + (salary * 12) + " Baht");
            year = salary *12;
            System.out.println("You get bonus 14% of salary");
            System.out.println("Your bonus this year is " + (year * 0.14) + " Baht");
            bonus = (year * 0.14);
            System.out.println("---------------------------------------------------");
            System.out.println("Your all salary is " + (year + bonus) +" Baht");
            System.out.println("---------------------------------------------------");
            System.out.println("                                                   ");
        }

        else if (salary >= 70001 ) {
            System.out.println("Salary this year is " + (salary * 12) + " Baht");
            year = salary *12;
            System.out.println("You get bonus 15% of salary");
            System.out.println("Your bonus this year is " + (year * 0.15) + " Baht");
            bonus = (year * 0.15);
            System.out.println("---------------------------------------------------");
            System.out.println("Your all salary is " + (year + bonus) +" Baht");
            System.out.println("---------------------------------------------------");
            System.out.println("                                                   ");
        }
    }
}
