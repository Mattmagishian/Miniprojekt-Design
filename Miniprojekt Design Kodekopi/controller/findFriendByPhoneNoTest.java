package controller;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import model.*;

/**
 * The test class findFriendByPhoneNoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class findFriendByPhoneNoTest
{
    private LendLpController lendLpController;
    /**
     * Default constructor for test class findFriendByPhoneNoTest
     */
    public findFriendByPhoneNoTest()
    {
    }
    
    @BeforeAll
    public static void init() {
        Friend f1 = new Friend("Ulrik", "Sorøgade","123");
        Friend f2 = new Friend("Lise", "Fanøgade", "456");
        Friend f3 = new Friend("Bob", "Læsøgade", "789");
        FriendContainer friendContainer = FriendContainer.getInstance();
        friendContainer.addFriend(f1);
        friendContainer.addFriend(f2);
        friendContainer.addFriend(f3);
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
    public void findFriendByPhoneNoTest() {
        //Arrange
        //we need to make a few friends with the attribute phone number
        
        //Act
        Friend result = lendLpController.findFriendByPhoneNo("456");
        //Assert
        assertEquals("456", result.getPhoneNo());
    }
}
