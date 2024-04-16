package model;


/**
 * Write a description of class Friend here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Friend
{
    // instance variables - replace the example below with your own
    private String name; 
    private String address;
    private int phoneNo;
    
    public Friend (String name, String address, int phoneNo){
        this.name = name; 
        this.address = address;
        this.phoneNo = phoneNo;
    }
    
    public String getName(){
        return name; 
    }
    
    public void setName(){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(){
        this.address = address;
    }
    
    public int getPhone(){
        return phoneNo;
    }
    
    public void setPhoneNo(){
        this.phoneNo = phoneNo;
    }
    
}
