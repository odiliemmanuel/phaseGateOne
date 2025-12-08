const prompt = require('prompt-sync')();

console.log("Hello, Kindly Enter Card details to verify");
let name = prompt("Credit Card Number: " );
 
    let start = date.now;

   function checkValidLength(cardNumber){
    
     if(cardNumber.length < 13 && cardNumber.length > 16){
    return true;
    }
    
    else{
        return false;
    }
    


}


    function checkCardType(cardNumber){

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




    function doubleEverySecondDigit(cardNumber) {
        sum = 0;
    
        for(position = 1; position < cardNumber.length; position += 2) {
            secondDigit = cardNumber[cardNumber.length - 1 - position];
            multiple = secondDigit * 2;
            tempMultiple = multiple + "";

           
            if(tempMultiple.length == 2) {
                for(index = 0; index < tempMultiple.length; index ++){
                   sum += Number(tempMultiple[index]);
                }
            }

            else {
                sum += multiple;
            }
         
        }

        
        return sum;
               
    }


        function sumDigitsInOddPositions(cardNumber) {

               add =  0;       
          for( position = 0; position < cardNumber.length; position += 2) {
            firstDigit = Number(cardNumber[cardNumber.length - 1 - position]);
    
            add += firstDigit;
            }

            return add;
    
        }

        
        function addOddAndEvenPosition(cardNumber) {
            
             even = doubleEverySecondDigit(cardNumber);
             odd = sumDigitsInOddPositions(cardNumber);
             combine = odd + even;

        return combine;        

        
        }


        function validity(cardNumber) {

             result = addOddAndEvenPosition(cardNumber);
                
            if(result % 10 == 0){
                return "Valid";
            }
            
           return "Invalid";

        }

        console.log("*******************************************");
        console.log("Credit Card Type: " + checkCardType(name));
        console.log("Credit Card Number: " + name);
        console.log("Credit Card Digit Length: " + name.length);
        console.log("Credit Card Validity Status: " + validity(name));
        console.log("************************************************");




























