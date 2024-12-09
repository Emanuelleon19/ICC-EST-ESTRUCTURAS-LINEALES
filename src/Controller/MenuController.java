package Controller;

import Materia.Models.Contact;
import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView conseloView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.conseloView = new ConsoleView();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            conseloView.displayMenu();
            String option = conseloView.getInput("");
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    exit = true;
                    conseloView.showMessage("Exiting.....");
                    break;

                default:
                    conseloView.showMessage("Invalid option.");

                    break;
            }
        }
    }

    private void deleteContact() {
    }

    

    private void findContact() {
    }

    private void addContact() {
        String name = conseloView.getInput("Enter name : ");
        String phone = conseloView.getInput("Enter phone : ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        conseloView.showMessage("Contact added");
    }
    
    private void printList() {
        contactManager.printList();
    }

}
