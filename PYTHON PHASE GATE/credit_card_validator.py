def check_validLength(card_number):
    if(len(cardNumber)) < 13 and len(cardNumber) > 16):
        return True;
            return False;

def check_card_type(cardNumber):
    if(cardNumber[0] == 4):
        typeCard = "Visa Card"
        return typeCard;

    elif(cardNumber[0] == 5):
        typeCard = "Master Card";
        return typeCard;
        

    elif(cardNumber[0] == 3 and cardNumber[1] == 7):
        typeCard = "American Express Card";
        return typeCard;

    elif(cardNumber[0] == 6):
        typeCard = "Discover Cards";

    else:
        typeCard = "Invalid Card"
        return typeCard;
         










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
