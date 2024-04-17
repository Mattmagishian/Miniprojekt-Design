package model;
import java.util.ArrayList;
import java.util.*;


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
        
    }
    
    public Copy findCopyBySerialNo (int serialNo){
        Copy foundCopy = null;
        Iterator<Lp> it = lps.iterator();
        boolean found = false;
        while(!found&&it.hasNext())
        {
            Lp lp = it.next();
            Copy c = lp.findCopyBySerialNo(serialNo);
            if(c != null){
                foundCopy = c;
                found = true;
            }
        }
        
        return foundCopy;
    }
}
