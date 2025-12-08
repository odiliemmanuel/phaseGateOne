def check_validLength(card_number):
    if(len(card_number)) < 13 and len(card_number) > 16):
        return True;
            return False;



def check_card_type(card_number):
    if(card_number[0] == 4):
        type_card = "Visa Card"
        return type_card;

    elif(card_number[0] == 5):
        type_card = "Master Card";
        return type_card;
        

    elif(card_number[0] == 3 and card_number[1] == 7):
        type_card = "American Express Card";
        return type_card;

    elif(card_number[0] == 6):
        type_card = "Discover Cards";

    else:
        typeCard = "Invalid Card"
        return type_card;


         
def double_every_second_digit(card_number):
    suming = 0
    for position in range (1, len(card_number), 2):
        second_digit = card_number[position]
        multiple = second_digit * 2
        temporary_multiple = multiple 
        
        if(len(temporary_multiple) == 2):
            for index in range(0, len(temporary_multiple),1):
                suming += temporary_multiple[len(temporary_multiple) - index]

        else:
            suming += multiple

    return suming




def sum_digits_in_odd_positions(card_number):
    add = 0
    for count in range(0, len(card_number), 2):
        first_digit = card_number[len(card_number) - count]
        add += first_digit
        return add



def add_odd_and_even_position(card_number):
    even = double_every_second_digit(card_number)
    odd = sum_digits_in_odd_positions(card_number)
    combine = even + odd
    return combine





def validity(card_number)
    result = add_odd_and_even_position(card_number)
    if(result % 10 == 0):
    reply = "Valid"    
        return reply

    else:
        reply = "Invalid"
        return reply
print(card_number)
print("*************************************************")
print("Credit Card Type: ", check_card_type(card_number))
print("Credit Card Number: ", card_number)
print("Credit Card Digit Length: ",len(card_number))
print("Credit Card Validity Status: ", )


        

GitHub → Settings → Developer settings → Personal access tokens → Fine-grained tokens



