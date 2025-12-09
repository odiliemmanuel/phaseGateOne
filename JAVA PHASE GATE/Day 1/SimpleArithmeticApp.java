import java.util.Scanner;
    public class SimpleArithmeticApp {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

        
        int startTime = (int)System.currentTimeMillis();

            final int NUMBER_OF_QUESTIONS = 10;
            
            int countCorrect = 0;
            int answer = 0;
            int countNumberAnswered = 0;
            int countWrong = 0;
            int correctAnswer = 0;

        while(countNumberAnswered != NUMBER_OF_QUESTIONS){

        int firstNumber = (int)(Math.random() * 11);
        int secondNumber = (int)(Math.random() * 11);

         correctAnswer = firstNumber - secondNumber;

        if(firstNumber < secondNumber){
            int swap = firstNumber;
            secondNumber = swap;
            firstNumber = secondNumber;
        }

        
        System.out.print(firstNumber +  " - " + secondNumber + " = " );
             answer = input.nextInt();
            countNumberAnswered += 1;

     if(answer == correctAnswer){
        System.out.println("Correct");
           countCorrect += 1;                    
            }
       
        if(answer != correctAnswer){
            System.out.println("Wrong");
            countWrong += 1;
           
        }
          
           
            if(countWrong >= 2) {
               
            }
    }

            int stopTime = (int)System.currentTimeMillis();
            int total = stopTime - startTime;

            System.out.println("The Number Of Correctly Answered Questions is " + countCorrect);

            System.out.println("Time taken is " + total/ 1000 + " seconds");
                

      




        }
    }
