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
    public Copy findCopyBySerialNo(int serialNo){
        return LpContainer.getInstance().findCopyBySerialNo(serialNo);
    }
}
