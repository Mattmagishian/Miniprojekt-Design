package controller;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.*;

/**
 * The test class findCopyBySerialNoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class findCopyBySerialNoTest
{
    private LendLpController lendLpController;
    /**
     * Default constructor for test class findCopyBySerialNoTest
     */
    public findCopyBySerialNoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        lendLpController = new LendLpController();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void findCopyBySerialNoTest() {
        //Arrange
        //make some lps and some copies
        //add copies to the lps
        //put it in BeforeEach?
        Lp lp1 = new Lp("1", "Yoyo", "Metallica","20-12-2020");
        Lp lp2 = new Lp("2", "Weekend", "Coldplay", "26-07-2018");
        LpContainer.getInstance().addLp(lp1);
        LpContainer.getInstance().addLp(lp2);
        Copy c1 = new Copy(11);
        lp1.addCopy(c1);
        Copy c2 = new Copy(12);
        lp1.addCopy(c2);
        Copy c3 = new Copy(21);
        lp2.addCopy(c3);
        Copy c4 = new Copy(22);
        lp2.addCopy(c4);
        //Act
        Copy result = lendLpController.findCopyBySerialNo(22);
        //Assert
        assertEquals(c4, result);
    }
    
    @Test
    public void findCopyBySerialNo_WithNonExistentSerialNo() {
        //Arrange
        //No need to arrange as we don't need any copies for this test
        //Act
        Copy result = lendLpController.findCopyBySerialNo(34);
        //Assert
        //assertNull(result);
        assertEquals(result, null);
    }
}
