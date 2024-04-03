public class bankmain {
    public static void main(String[] args) {
        savingaccount s1=new savingaccount();
        s1.avalbalance(12000);
        s1.deposite(4000);
        s1.withdraw(1200);
        s1.calculateinterest(12);
        s1.intresforstaff(5);
        s1.eligible();
        s1.averagebalance(1000);
        currentaccount c1=new currentaccount();
        c1.calculateinterest(12);
        c1.averagebalance(5000);
        c1.deposite(120000);
        c1.withdraw(13000);
        c1.maxtransaction(200000);        
    }
    
}
