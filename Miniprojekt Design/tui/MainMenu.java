package tui;
import controller.*;
import model.*;
import java.util.Scanner;

public class MainMenu
{
    private LendLpController lendLpController;
    private FriendController friendController;
    private LpController lpcontroller;
    
    Scanner scanner = new Scanner(System.in);
    public MainMenu(){
    }
    
    public void mainMenu(){
        printMainMenu();
        boolean running = true; 
        while (running){
            int choice = getUserInput();
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
    
    private int getUserInput(){
        while (!scanner.hasNextInt()){
            System.out.println("Indtast gyldig input");
            scanner.nextLine();
        }
        int userInput = scanner.nextInt();
        scanner.nextLine();
        return userInput;
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
}
