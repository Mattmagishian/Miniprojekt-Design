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
        boolean found = false;
        Friend foundFriend = null;
        int index = 0;
        while (!found && index < friends.size()) {
            Friend f = friends.get(index);
            if (phoneNo.equals(f.getPhoneNo())) {
                foundFriend = f;
                found = true;
            }
        }
        return foundFriend;
    }
    
}
