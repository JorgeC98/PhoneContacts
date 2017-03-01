/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone myPhone = new MobilePhone();
    
    public static void main(String[] args) {
        // TODO code application logic her
        MobilePhone myphone = new MobilePhone();
        
        int option;
        
        printMenu();
        option = scanner.nextInt();
        while (option > 0 && option < 7) {
            switch(option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    listAllContacts();
                    break;
                case 6:
                    printMenu();
                    break;
                default:
                    break;
            }
            
            System.out.println("Option? ");
            option = scanner.nextInt();
        }
    }
    
    public static void printMenu() {
        System.out.println("Menu: ");
        System.out.println("0. Quit");
        System.out.println("1. Add contact");
        System.out.println("2. Update Contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Query contact");
        System.out.println("5. List all contacts");
        System.out.println("6. Print options");
        System.out.println("Option? ");
    }
    
    public static void addContact() {
        String name;
        int number;
        
        System.out.println("contact name: ");
        name= scanner.nextLine();
        System.out.println("Telephone number: ");
        number = scanner.nextInt();
        
        if (myPhone.addContact(name, number)) {
            System.out.println("Contact succefully added");
        }else{
            System.out.println("Contact already in list");
        }
    }
    
   
    

}
