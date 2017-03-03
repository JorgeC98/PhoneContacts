/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
    import java.util.*;
/**
 *
 * @author Eduardo
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {
        // TODO code application logic here
        printMenu();
        int option=scanner.nextInt();
        
        while  (option >0 && option<7){
            switch(option){
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
                    listContacts();
                    break;
                case 6: 
                    printMenu();
                    break;
                default:
                    break;
            }
            System.out.println("Option?");
            option = scanner.nextInt();
        }
        
    }
    public static void printMenu(){ //Si el metodo no es STATIC no lo puedes jalar a main
        System.out.println("*****Menu***** ");
        System.out.println("0. Quit");
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Query contact");
        System.out.println("5. List all contacts");
        System.out.println("6. Print options");
        System.out.println("Option? ");
    }
    
    public static void addContact(){
        String name;
        int number;
        System.out.println("Contact name: ");
        name=scanner.next();
        System.out.println("Telephone number: ");
        number=scanner.nextInt();
        
        if (myPhone.addContact(name,number)){
            System.out.println("Contact successfuly added");
        }else{
            System.out.println("Contact already in list");
        }
    }
    
    public static void updateContact(){
        String name;
        int number;
        System.out.println("Contact name: ");
        name=scanner.next();
        System.out.println("Telephone number: ");
        number=scanner.nextInt();
        
        if (myPhone.updateContact(name,number)){            
            System.out.println("Contact successfuly updated");
        }else{
            System.out.println("Contact not found");
        }
    }
    public static void deleteContact(){
        String name;
        
        System.out.println("Contact name: ");
        name=scanner.next();
        
        
        if (myPhone.removeContact(name)){            
            System.out.println("Contact successfuly deleted");
        }else{
            System.out.println("Contact not found");
        }
    }
    
    public static void queryContact(){
        System.out.println("Introduce contact's name that you want to query: ");
        String name= scanner.next();
        System.out.println(myPhone.queryContact(name));
    }
    
    public static void listContacts(){
        System.out.println("Contacts saved right now: ");
        myPhone.listContacts();
    }
}