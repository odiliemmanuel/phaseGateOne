const prompt = require('prompt-sync')();

const NUMBER_OF_QUESTIONS = 10;

countCorrect = 0;

answer = 0;

countNumberAnswered = 0;

countWrong = 0;

correctAnswer = 0;

        let start = Date.now();

    while(countNumberAnswered != NUMBER_OF_QUESTIONS){
      firstNumber = parseInt(Math.random(0, 10)* 11);
       secondNumber = parseInt(Math.random (0, 10)* 11);

       const correctAnswer = firstNumber - secondNumber;

        if(firstNumber < secondNumber) {
            swap = firstNumber;
            secondNumber = swap;
            firstNumber = secondNumber;
        }

           answer = prompt(firstNumber + " - " + secondNumber + " = ");
            countNumberAnswered += 1;

        if(answer == correctAnswer) {
            countCorrect += 1;
        }

        if(answer != correctAnswer) {
            countWrong += 1;
        }

        if(countWrong == 2){
            break;
        }
        


    }

        stop = Date.now();
        total = stop - start;
//
        console.log("The Number Of Correctly Answered Questions is " + countCorrect);
        console.log("The time taken is " + total/1000 +  " seconds");































