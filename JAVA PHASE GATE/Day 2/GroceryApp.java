import java.util.Arrays;
import java.util.Scanner;
    public class GroceryApp {
        public static void main(String...Odili){
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            Scanner input3 = new Scanner(System.in);


    

String menu =("""
FLASH GROCERY

1. Add item

2. Remove item

3. Show all available items

""");

System.out.println(menu);
String menuOption = input.nextLine();

    switch(menuOption){
        case "1": 
            
            int length = 0;
            String condition = "no";
            String answer = "";

           System.out.println("Enter the length of the item you want to add");
                length = input.nextInt();

            String [] add = new String [length];
         
        
           for(int count = 0; count < length; count ++){

            System.out.println("Enter item");
                add[count]  = input2.nextLine();

             System.out.println(Arrays.toString(add));


            }
           
       }
       

    












           
            
            int length = 0;
            String condition = "no";
            String answer = "";

           System.out.println("Enter the length of the item you want to add");
                length = input.nextInt();

            String [] add = new String [length];
         
        do{
           for(int count = 0; count < length; count ++){

            System.out.println("Enter item");
                add[count]  = input2.nextLine();

            

            }
            
        }

        while(answer.equalsIgnoreCase(condition));
        
        System.out.println(Arrays.toString(add));

   
        String [] remove = new String [length];

     System.out.println("Enter the length of item to remove");
        length = input.nextInt();       

    do{
      
        for(int count = 0; count < length; count ++){
        
        System.out.println("Enter item to remove");
            remove[count] = input2.nextLine();
           if(remove.equals(add[0])){
                System.out.println(Arrays.toString(remove));
            }
        }
      }


        
        while(answer.equalsIgnoreCase(condition));

    
         System.out.println(Arrays.toString(add));

        System.out.println("Showing All Items");
        System.out.println(Arrays.toString(add));





   
         
      }
  }



















