package controller;
import model.*;

/**
 * Write a description of class LpController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LpController
{
    // instance variables - replace the example below with your own
    public LpController(){
        //TODO initalize this
    }
    
    public void createLp(String barcode, String title, String artist, String publicationDate){
        //TODO Implement method
    }
    
    public Copy findCopyBySerialNo(int serialNo){
        return LpContainer.getInstance().findCopyBySerialNo(serialNo);
    }
}
