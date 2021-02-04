import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        int customer;
        double food,discount,total;

        Scanner scan = new Scanner (System.in);

        System.out.println("********************************");
        System.out.println("            RECEIPT             ");
        System.out.println("********************************");

        System.out.print("Customer : ");
        customer = scan.nextInt();
        System.out.print("Rent for food is : ");
        food = scan.nextInt();

        
        if (customer >= 1 && customer <= 2){
            System.out.println ("Don't have Discount");
            discount = food - ( food * 0);
            System.out.println("food discount = " + discount);
            total = (discount + ( discount * 0.07));
            System.out.println("Total is = " + total);
        }

        else if (customer >= 3 && customer <= 5){
            System.out.println ("food discount 5% of food");
            System.out.println ("discount = " + (food * 0.05) + " Baht");
            discount = food - ( food * 0.05);
            System.out.println("food discount = " + discount);
            total = (discount + ( discount * 0.07));
            System.out.println("Total is = " + total);            
        }

        else if (customer >= 6 && customer <= 10){
            System.out.println ("food discount 12% of food");
            System.out.println ("discount = " + (food * 0.12) + " Baht");
            discount = food - ( food * 0.12);
            System.out.println("food discount = " + discount);
            total = (discount + ( discount * 0.07));
            System.out.println("Total is = " + total);            
        }

        else if (customer >= 11 && customer <= 14){
            System.out.println ("food discount 13% of food");
            System.out.println ("discount = " + (food * 0.13) + " Baht");
            discount = food - ( food * 0.13);
            System.out.println("food discount = " + discount);
            total = (discount + ( discount * 0.07));
            System.out.println("Total is = " + total);           
        }

        else if (customer >= 15 && customer <= 17){
            System.out.println ("food discount 20% of food");
            System.out.println ("discount = " + (food * 0.20) + " Baht");
            discount = food - ( food * 0.20);
            System.out.println("food discount = " + discount);
            total = (discount + ( discount * 0.07));
            System.out.println("Total is = " + total);            
        }

        else if (customer >= 18 && customer <= 20){
            System.out.println ("food discount 30% of food");
            System.out.println ("discount = " + (food * 0.30) + " Baht");
            discount = food - ( food * 0.30);
            System.out.println("food discount = " + discount);
            total = (discount + ( discount * 0.07));
            System.out.println("Total is = " + total);            
        }

        else if (customer >= 21 && customer <= 22){
            System.out.println ("food discount 35% of food");
            System.out.println ("discount = " + (food * 0.35) + " Baht");
            discount = food - ( food * 0.35);
            System.out.println("food discount = " + discount);
            total = (discount + ( discount * 0.07));
            System.out.println("Total is = " + total);           
        }

        else if(customer >= 23 ){
            System.out.println ("food discount 40% of food");
            System.out.println ("discount = " + (food * 0.40) + " Baht");
            discount = food - ( food * 0.40);
            System.out.println("food discount = " + discount);
            total = (discount + ( discount * 0.07));
            System.out.println("Total is = " + total);        
        }
    }
}