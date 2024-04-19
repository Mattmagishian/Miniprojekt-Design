package controller;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.*;
public class LendLpControllerTest
{
    private LendLpController lendLpController;

    Copy copy1;
    Loan loan1;
    Friend f1;
    
    public LendLpControllerTest()
    {
    }

    @BeforeEach
    public void setUp()
    {
        loan1 = new Loan(1, "01012024", 30, f1);
    }


    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void addCopyToLoanTest(){
        LendLpController lendLpController = new LendLpController();
        lendLpController.addCopyToLoan(copy1);
        boolean result = loan1.addCopyToLoan(copy1);
        assertEquals(true, result);
    }
    
    @Test
    public void addLoanToContainerTest(){
        LendLpController lendLpController = new LendLpController();
        lendLpController.addLoanToContainer();
        boolean result = LoanContainer.getInstance().addLoanToLoanContainer(loan1);
        assertEquals(true, result);
    }
}
