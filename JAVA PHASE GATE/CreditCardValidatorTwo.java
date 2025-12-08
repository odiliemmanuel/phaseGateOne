import java.util.Scanner;
//import java.util.Arrays;

    public class CreditCardValidator {
        public static void main(String...Odili){
            Scanner input = new Scanner(System.in);

                System.out.println("Hello, Kindly Enter Card details to verify: ");

                System.out.println("Enter Card Number");
                String cardNumber = input.nextLine();

            System.out.println("*******************************************");
                String type = checkCardType(cardNumber);
            System.out.print("Credit Card Type: " + type + "\n");
                
            System.out.print("Credit Card Number: " + cardNumber + "\n");

                boolean length = checkValidLength(cardNumber);
            System.out.print("Credit Card Digit Length: " + cardNumber.length() + "\n");

                String valid = validity(cardNumber);
            System.out.print("Credit Card Validity Status: " + valid + "\n");
            System.out.println("*******************************************");
         }


    public static boolean checkValidLength(String cardNumber) {
        if(cardNumber.length() < 13 && cardNumber.length() > 16){
        return true;
        }
        
        else{
            return false;
        }
    }


    public static String checkCardType(String cardNumber) {
        if(cardNumber.charAt(0) == '4'){
            return "Visa Card";
        }

       else if(cardNumber.charAt(0) == '5') {
        
            return "Master Card";
        }

        else if(cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7') {
            return "American Express Card";
        }

        else if(cardNumber.charAt(0) == '6'){
            return "Discover Cards";
        }

        else {
            return "Invalid Card";
        }

    }

    public static int doubleEverySecondDigit(String cardNumber){
        int sum = 0;
    
        for(int position = 1; position < cardNumber.length(); position += 2) {
           int secondDigit = cardNumber.charAt(cardNumber.length() - 1 - position) - 48;
           int multiple = secondDigit * 2;
           String temporaryMultiple = multiple + "";
           
            if(tempMultiple.length() == 2) {
                for(int index = 0; index < temporaryMultiple.length(); index ++){
                   sum += temporaryMultiple.charAt(index) - 48;
                }
            }

            else {
                sum += multiple;
            }
         
        }
            return sum;
               

    }

      public static int sumDigitsInOddPositions(String cardNumber) {
        
            int add =  0;       
          for(int position = 0; position < cardNumber.length(); position += 2) {
           int firstDigit = cardNumber.charAt(cardNumber.length() - 1 - position) - 48;
    
            add += firstDigit;
            }

            return add;
    

        }
            

        public static int addOddAndEvenPosition(String cardNumber) {
            
            int even = doubleEverySecondDigit(cardNumber);
            int odd = sumDigitsInOddPositions(cardNumber);
            int combine = odd + even;

        return combine;        

        }


        public static String validity(String cardNumber){
            int result = addOddAndEvenPosition(cardNumber);

            if(result % 10 == 0){
                return "Valid";
            }
            
            else{
                return "Invalid";
            }

        }




    }
