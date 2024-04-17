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
    public MainMenu()
    {
    }
    
    public void mainMenu(){
        boolean running = true; 
        while (running){
            int choice = getUserInput();
        }
    }
    
    public void printMainMenu(){
        System.out.println("*******************");
        System.out.println("*** Main Menu ***");
        System.out.println("(1) Lend LP");
        System.out.println("(2) Manage LPs");
        System.out.println("(3) Return LP");
        System.out.println("(4) Manage friends");

        System.out.println("(0) Exit");
    }
    
    public int getUserInput(){
        while (!scanner.hasNextInt()){
            System.out.println("Enter valid input");
            scanner.nextLine();
        }
        int userInput = scanner.nextInt();
        scanner.nextLine();
        return userInput;
    }
    
    
    public Friend findFriendByPhoneNo(String phoneNo){
        //TODO
        return null;
    }
    
    public void createLoan(String loanNo, String borrowDate, int period, Friend friend){
        //TODO
    }
    
    public Copy findCopyBySerialNo(int serialNo){
        //TODO
        return null; 
    }
    
    public Copy addCopyToLoan(Copy copy){
        //TODO 
        return null;
    }
    
    public void endLoan(){
        //TODO 
    }
}
