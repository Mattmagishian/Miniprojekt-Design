package tui;
import controller.*;
import model.*;
import java.util.Scanner;

public class MainMenu
{
    private LendLpController lendLpController;
    private FriendController friendController;
    private LpController lpcontroller;

    public MainMenu(){
    }
    
    public void mainMenu(){
        printMainMenu();
        boolean running = true; 
        while (running){
            int choice = getUserInputInt();
            switch (choice){
                case 1:
                    lendLp();
                    break; 
                case 2: 
                    System.out.println("Denne funktion er ikke lavet endnu");
                    break;
            }
        }
    }
    
    private void printMainMenu(){
        System.out.println("*******************");
        System.out.println("*** Hovedmenu ***");
        System.out.println("(1) Lån LP");
        System.out.println("(2) Håndtere LP'er");
        System.out.println("(3) Returnere LP'er");
        System.out.println("(4) Håndtere venner");

        System.out.println("(0) Afslut");
    }
    
    private int getUserInputInt(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("Indtast gyldig input");
            scanner.nextLine();
        }
        int userInputInt = scanner.nextInt();
        scanner.nextLine();
        return userInputInt;
    }
    
    private Friend findFriendByPhoneNo(String phoneNo){
        return lendLpController.findFriendByPhoneNo(phoneNo);
    }
    
    private void createLoan(int loanNo, String borrowDate, int period){
        lendLpController.createLoan(loanNo, borrowDate, period);
    }
    
    private Copy findCopyBySerialNo(int serialNo){
        return lendLpController.findCopyBySerialNo(serialNo); 
    }
    
    private void addCopyToLoan(Copy copy){
        lendLpController.addCopyToLoan(copy);
    }
    
    private void endLoan(){
        lendLpController.addLoanToContainer();
    }
    
    private void lendLp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast din vens telefonnummer:");
        String phoneNo = scanner.next();
        Friend friend = findFriendByPhoneNo(phoneNo);
        friend.printFriendInfo();
        System.out.println("Indtast udlåningsdato:");
        String borrowDate = scanner.next();
        System.out.println("Indtast låneperioden i antal dage:");
        int period = scanner.nextInt();
        //TODO hvad gør vi med loanNo?
        createLoan(1, borrowDate, period);
        //TODO resten af use casen
    }
}
