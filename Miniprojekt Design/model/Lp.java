package model;
import java.util.ArrayList;

/**
 * Write a description of class Lp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lp
{
    // instance variables - replace the example below with your own
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copies; 

    /**
     * Constructor for objects of class Lp
     */
    public Lp(String barcode, String title, String artist, String publicationDate)
    {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copies = new ArrayList<>();
    }

    public String getBarcode()
    {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public ArrayList<Copy> getCopies(){
        return copies;
    }
    
      public void addCopy(Copy copy) {
        if (copy != null) {
            copies.add(copy);
        }
    }
    
    public Copy findCopyBySerialNo(int serialNo) {
        boolean found = false;
        Copy foundCopy = null;
        int index = 0;
        while (!found && index < copies.size()) {
            Copy c = copies.get(index);
            if(c.getSerialNo() == serialNo){
                foundCopy = c;
                found = true;
            } else {
                index++;
            }
        }
        return foundCopy;
    }

    
}

