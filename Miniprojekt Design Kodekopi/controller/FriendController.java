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
    public Friend findFriendByPhoneNo(String phoneNo) {
        return FriendContainer.getInstance().findFriendByPhoneNo(phoneNo);
    }
}
