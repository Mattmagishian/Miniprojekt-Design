package controller;

import model.*;
/**
 * Write a description of class FriendController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendController
{
    //fields
    
    //constructor
    public FriendController() {
        
    }
    
    public void createFriend(String name, String address, String phoneNo) {
        //TODO f1 = new Friend(...)...
        Friend newFriend = new Friend(name, address, phoneNo);
    }
    
    public Friend findFriendByPhoneNo(String phoneNo) {
        return FriendContainer.getInstance().findFriendByPhoneNo(phoneNo);
    }
}
