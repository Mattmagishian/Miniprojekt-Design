package model;
import java.util.ArrayList;

/**
 * Write a description of class FriendContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendContainer
{
    //fields
    private ArrayList<Friend> friends;
    private static FriendContainer instance;
    
    private FriendContainer() {
        friends = new ArrayList<>();
    }
    
    public static FriendContainer getInstance() {
        if (instance == null){
            instance = new FriendContainer();
        }
        return instance;
    }
    
    public Friend findFriendByPhoneNo(String phoneNo) {
        //TODO
        return null;
    }
}
