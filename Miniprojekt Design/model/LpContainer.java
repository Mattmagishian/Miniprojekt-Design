package model;
import java.util.ArrayList;


/**
 * Write a description of class LpContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LpContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Lp> lps;
    private static LpContainer instance; 
    
    private LpContainer(){
        lps = new ArrayList<>();
    }
    
    public static LpContainer getInstance() {
        if (instance == null){
            instance = new LpContainer();
        }
        return instance;
    }
    
    public void addLp(Lp lp){
        //TODO implement add lp method
    }
    
    public int findCopyBySerialNo(int serialNo){
        //TODO Implement method
        return 0;
    }

}
