import random

count_correct = 0
answer = 0
count_number_answered = 0
count_wrong = 0
correct_answer = 0
NUMBER_OF_QUESTIONS = 10           

while(count_number_answered != NUMBER_OF_QUESTIONS):
    first_number = random.randint(1,10)
    second_number = random.randint(1,10)

    correct_answer = first_number - second_number
    if(first_number < second_number):
        swap = first_number
        second_number = swap
        first_number = second_number
        print(first_number, " - " , second_number, " = ")
        answer = input("Answer : ")
        count_number_answered += 1

    if(answer == correct_number):
        count_correct += 1
    if(answer != correct_answer):
        count_wrong += 1



    print("The Number Of Correctly Answered Questions is " , countCorrect);
    print("Time taken is ", total/ 1000 ,  " seconds");
                            







