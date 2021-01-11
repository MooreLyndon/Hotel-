
package javaapplication28;
import java.io.IOException;
import java.util.Scanner;
public class JavaApplication28 {




    
    public static void main(String[] args) throws IOException {
        

        boolean booking = true;
        while( booking = true){
        int total = 0;
        int total2 =0;
        int total3 = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("press any button to begin booking");
        System.in.read();
            System.out.println("What size of room do you want? A Single -£50 per night(s), A double -£75 per night(d), Family -£105 per night(f)");
                String room = inp.next();
        
                if(room.equalsIgnoreCase("s")){
                String RoomChoice = "Single";
                total = total + 50;
                }
                if(room.equalsIgnoreCase("d")){
                String RoomChoice = "Double"; 
                 total = total + 75;               
                }
                if(room.equalsIgnoreCase("f")){
                String RoomChoice = "Family"; 
                 total = total + 105;               
                }
                            System.out.println("What type of catering do you want? self catering(s), Haf boardf (h), Full board(f)");
                String food = inp.next();
        
                if(food.equalsIgnoreCase("s")){
                String foodchoice = "Single";
                total = total + 0;
                }
                if(food.equalsIgnoreCase("h")){
                String foodchoice = "Double"; 
                 total = total + 10;               
                }
                if(food.equalsIgnoreCase("f")){
                String foodchoice = "Family"; 
                 total = total + 20;               
                }
                   
    
         System.out.println("How many days will you be staying here");
                int days = inp.nextInt();    
                if(days > 7){
                    System.out.println("20% discount applied");
                    total2 = total;
                    days = days -7;
                    total = total * 7;  

                    total2 = total2 * days;
                    total2 = total2/100;
                    total2 = total2*80; 
                    
                    total3 = total2 + total;
                    System.out.println("Total is " + total3);
                    
                }else{
                    System.out.println("Not elligable for discount");
                    total = total * days;
                    total3 = total;
                 System.out.println("Total is " + total3);
                
                }
                

   
                
        //while loop close
        }
  
    }
    
}
