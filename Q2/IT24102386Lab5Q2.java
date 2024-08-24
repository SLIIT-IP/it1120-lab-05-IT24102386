import java.util.Scanner;
public class IT24102386Lab5Q2{
         public static void main(String[]args){
              Scanner input = new Scanner(System.in);
                   System.out.println("Enter the number of new members introduced:");
                   int new_members=input.nextInt();
                   if (new_members<0){
                          System.out.println("Input must be a number 0 or greater");
                   }
                   else{
                        String Prize;
                        switch(new_members){
                          case 0:
                            Prize="No Prize";
                            System.out.println("Prize is a:"+Prize);
                            break; 
                          case 1:
                             Prize="Pen";
                             System.out.println("Prize is a:"+Prize);
                             break;
                          case 2:
                              Prize="Umbrella";
                              System.out.println("Prize is a:"+Prize);
                              break;
                          case 3:
                              Prize="Bag";
                              System.out.println("Prize is a:"+Prize);
                              break;
                          case 4:
                               Prize="Travelling Chair";
                               System.out.println("Prize is a:"+Prize);
                               break;
                          default: 
                               Prize="Headphone";
                               System.out.println("Prize is a:"+Prize);
                          }
                     }       
                               
                            
                             
        }
}

           
