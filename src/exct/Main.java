package exct;
//name : Nishan Nuwantha Bandara Konara Mudiyanselage
//Index No : 12183750
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int N = 8, lessons,max=0,min = 0,sum=0;
        float total=0.00f;
        String name=null,ch,maxname = null,minname=null;


        System.out.println("Welcome to the Rocky Blues Management System");
        System.out.println("\n\n");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            do {
                System.out.println("Please enter booking name ==>");
                name = input.nextLine();
                if (name == "") {
                    System.out.println("ERROR booking name cannot be Blank");
                }
            }while(name.length() == 0);
            do {
                System.out.println("Enter the number of lessons for " + name + " ==>");
                lessons = input.nextInt();
                if (lessons < 1) {
                    System.out.println("ERROR number of lessons must be greater than or equal to 1");
                }
                if( lessons>max){
                    max = lessons;
                    maxname = name;
                }
                min = max;
                if(lessons<min && lessons >0){
                    min = lessons;
                    minname = name;
                }
                sum += lessons;

            } while (lessons < 1);
            System.out.println(name+" do you want to purchase a guitar for $199.00 (y/n) ==> ");
            ch = input.next();
            boolean guitar;
            switch (ch){
                case "y" :
                case "Y" : {
                    guitar =true;
                    break;
                }
                default:{
                    guitar =false;
                }
            }
            float charge,cost= (float) 29.95,discount=0,guitarPrice=0;
            if(lessons >10){
                discount = (float) (lessons*cost*0.2);
                if(guitar){
                    guitarPrice = 199.00F;
                }
            }
            else if(lessons > 5){
                discount = (float) (lessons*cost*0.1);
                if(guitar){
                    guitarPrice = 199.00F;
                }
            }
            charge = (guitarPrice + ((float)lessons)*cost - discount);
            System.out.println("The Charge for "+name+" for "+lessons+" lessons is $"+String.format("%.2f",charge));
            System.out.println("\n");
            total += charge;
        }
        System.out.println("Statistical information for Rocky Blues\n");
        float avg = (float) sum/N;
        System.out.println(minname+" has the minimum number of "+min+" lessons");
        System.out.println(maxname+" has the maximum number of "+max+" lessons");
        System.out.println("The Average number of lessons per booking is : "+String.format("%.2f",avg)+" lessons");
        System.out.println("The total charges collected is $"+String.format("%.2f",total));
        System.out.println("\n");
        System.out.println("Thank you for using the Rocky Blues Management System");
        System.out.println("Program Written by 12183750");
    }
}
