import java.util.Scanner;
public class IT24102386Lab5Q3{
       public static final int Room_charge_per_day=48000;
       public static final int Discount_3_4_days=10;
       public static final int Discount_5_OR_More_days=20;
       public static final int Min_day=1;
       public static final int Max_day=31;
       public static void main(String[]args){
           Scanner input=new Scanner(System.in);
                 System.out.println("Enter start Date (1-31):");
                 int start_date=input.nextInt();
                 System.out.println("Enter End Date (1-31):");
                 int end_date=input.nextInt();
                 if(start_date<Min_day||start_date>Max_day||end_date<Min_day||end_date>Max_day){
                          System.out.println("Days must be between 1 and 31"); 
                          return;
                 } 
                 if(start_date >= end_date ){
                         System.out.println("Start date must be less than end date");
                         return;
                 }
                 int Reserved=end_date-start_date;
                 System.out.println("Room chage Per Day:"+ Room_charge_per_day);
                 System.out.println("Number of days Reserved:"+ Reserved);
                 System.out.println("Total Amount to be Paid:"+(Room_charge_per_day*Reserved));
       }
}