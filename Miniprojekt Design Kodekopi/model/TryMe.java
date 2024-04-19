package model;

public class TryMe
{
    public void generateData(){
        Friend f1 = new Friend("John", "Johnvej 1", "11111111");
        Friend f2 = new Friend("Hans", "Hansvej 1", "22222222");
        Friend f3 = new Friend("Tom", "Tomvej 1", "33333333");
        
        FriendContainer fc = FriendContainer.getInstance();
        
        fc.addFriend(f1);
        fc.addFriend(f2);
        fc.addFriend(f3);
        
        Lp lp1 = new Lp("AAA", "Lille Peter Edderkop", "Kim Larsen", "01012001");
        Lp lp2 = new Lp("BBB", "Mester Jakob", "Birthe Kjær", "02022002");
        
        LpContainer lc = LpContainer.getInstance();
        
        lc.addLp(lp1);
        lc.addLp(lp2);
        
        Copy c1 = new Copy(1);
        Copy c2 = new Copy(2);
        
        lp1.addCopy(c1);
        lp2.addCopy(c2);
        
        Loan l1 = new Loan(1, "01012024", 30, f1);
        Loan l2 = new Loan(2, "01012024", 30, f2);
        
        l1.addCopyToLoan(c1);
        l2.addCopyToLoan(c2);
        
        //test af funktioner
    }
}