public  class savingaccount implements account,bankstaff{

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

    public void avalbalance(int balance){
        System.out.println("AVALABLE BALANCE IS : "+balance);
    }

    @Override
    public void intresforstaff(int intrest) {
        System.out.println("INTREST FOR STAFF IS :"+intrest);
        
    }    
    
}
