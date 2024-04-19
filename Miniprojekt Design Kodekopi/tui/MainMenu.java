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
        lendLpController = new LendLpController();
    }

    public void mainMenu(){
        printMainMenu();
        boolean running = true; 
        while (running){
            int choice = getUserInputInt();
            switch (choice){
                case 0:
                    running = false;
                    System.out.println("Tak og farvel.");
                    break;
                case 1:
                    int loanNo = askForLoanNo();
                    lendLp(loanNo);
                    break; 
                case 2: 
                    System.out.println("Denne funktion er ikke lavet endnu.");
                    break;
                case 3:
                    System.out.println("Denne funktion er ikke lavet endnu.");
                    break;
                case 4:
                    System.out.println("Denne funktion er ikke lavet endnu.");
                    break;
                case 9:
                    generateTestData();
                    break;
                default:
                    System.out.println("Indtast venligst et gyldigt tal.");
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
        System.out.println("(9) Generér testdata");
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

    private void generateTestData() {
        TryMe tryMe = new TryMe();
        tryMe.generateData();
    }

    private int askForLoanNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast det ønskede lånenummer til lånet: ");
        int loanNo = scanner.nextInt();
        return loanNo;
    }

    private Friend askForAndFindFriend() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast din vens telefonnummer:");
        String phoneNo = scanner.next();
        Friend friend = lendLpController.findFriendByPhoneNo(phoneNo);
        return friend;
    }

    private Loan createLoan(int loanNo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast udlåningsdato:");
        String borrowDate = scanner.next();
        System.out.println("Indtast låneperioden i antal dage:");
        int period = scanner.nextInt();
        //TODO hvad gør vi med loanNo?
        Loan loan = lendLpController.createLoan(loanNo, borrowDate, period);
        return loan;
    }

    private Copy askForSerialNoAndFindCopy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast serienummeret for den ønskede kopi:");
        int serialNo = scanner.nextInt();
        Copy copy = lendLpController.findCopyBySerialNo(serialNo);
        return copy;
    }
    //Denne metode virker ikke, men man kan se tanken bag
    //Kopiens field "isHome" skal være false, fordi kopien er lånt ud
    private void addCopyToLoan(Copy copy){
        if (copy.getIsHome()) {
            lendLpController.addCopyToLoan(copy);
            boolean copyIsHome = copy.getIsHome();
            copyIsHome = false;
        }  
        else {
            System.out.println("LP-kopien er lånt ud til en anden. Vælg venligst et andet serienummer.");
        }
    }

    private void endLoan(){
        lendLpController.addLoanToContainer();
        System.out.println("Lånet er nu oprettet i systemet.");
    }

    private void lendLp(int loanNo){
        askForAndFindFriend();
        Loan loan = createLoan(loanNo);
        Copy copy = askForSerialNoAndFindCopy();
        addCopyToLoan(copy);
        endLoan();
    }
}
