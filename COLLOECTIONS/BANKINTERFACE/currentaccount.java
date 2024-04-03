public class currentaccount implements account{

    @Override
    public void calculateinterest(float percent) {
        System.out.println("CHANGE IN INTEREST: "+percent);
        
        
    }

    @Override
    public void deposite(int amount) {
        System.out.println("AMOUNT DEPOSITED: "+amount);
        
        
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("AMOUNT WITHDRAW : "+amount);
        
     }
     public void maxtransaction(int max){
        System.out.println("MAX TRANSACTION AMOUNT: "+max);
     }
    
}
