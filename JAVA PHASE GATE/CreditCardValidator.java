import java.util.Scanner;
import java.util.Arrays;

    public class CreditCardValidator {
        public static void main(String...Odili){
            Scanner input = new Scanner(System.in);
    
//            String category = "";
            
            System.out.println("Hello, Kindly Enter Card details to verify");

            System.out.print("Credit Card Number: ");                    
                String cardDigit = input.nextLine();

                int cardLength = cardDigit.length();

                String visa = "Visa Cards";
                String master = "MasterCard";
                String america = "American Express Cards";
                String discover = "Discover Cards";
                String cardType = "";


            if(cardDigit.charAt(0) == '4'){
                cardType = visa;
            System.out.println("Credit Card Type: " + cardType);
            }

            else if(cardDigit.charAt(0) == '5'){
                cardType = master;
            System.out.println("Credit Card Type: " + cardType);
            }

            else if(cardDigit.charAt(0) == '3' && cardDigit.charAt(1) == '7'){
                cardType = america;
            System.out.println("Credit Card Type: " + cardType);
            }

            else if(cardDigit.charAt(0) == '6'){
                cardType = discover;
            System.out.println("Credit Card Type: " + cardType);
            }
            
            else {
                System.out.println("Invalid");
            }

             System.out.println("Credit Card Digit Length: " + cardLength);     


            int [] card = new int[cardLength];
          
            
            for(int index = 0; index < cardDigit.length(); index++ ){
                int counter = 0;
                card[index] = cardDigit.charAt(index) - 48;
                  
             }
//
//                int sum = 0;
//            for(int counter = 1; counter < card.length; counter += 2){
//                int firstDigitCounter = card[counter];
//                sum += firstDigitCounter;
//                
//            }
//                System.out.print(sum);
//

           
                int sum = 0;
                int sum2 = 0;
                int secondDigitCounter = 0;
            for(int counter = 0; counter < card.length; counter += 2){
                secondDigitCounter = card[counter] * 2;
               sum += secondDigitCounter;
//               
//                if(secondDigitCounter > 9){
                    
                    
//                    int value1 = secondDigitCounter / 10;
//                    int value2 = secondDigitCounter % 10;
//                    sum += value1;
//                    sum += value2;  
//    
                    
//                } 
            }
                    System.out.print(sum);
            
            
           
                 


        }
    }
