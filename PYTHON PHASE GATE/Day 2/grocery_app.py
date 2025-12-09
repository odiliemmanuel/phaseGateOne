from grocery_app_function import remove_items, add_items, show_all_items

def main_menu(my_list):

    menuApp = ("""

    GROCERY LIST
    
    1. Add item
    2. Remove item
    3. Show all available items
    """)
    
    print(menuApp)
    menuOption = input("Enter any option ")

    match(menuOption):
        case "1": 
                add = input("Enter item to add ")
                add_items(my_list, item)
                print("Item added Successfully")


        case "2": 
                remove = input("Enter item to remove ")
                remove_items(my_list, item)
                print("Item removed Successfully")

        

        case "3":
                print("Showing all available items ", my_list) 






def main():
    my_list = ["garri", "rice", "yam"]
    main_menu(my_list)


    
main()   









    
