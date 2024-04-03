public interface account {
    void deposite(int amount );
    void withdraw(int amount );
    void calculateinterest(float percent);
    default void averagebalance(int balance){
        System.out.println("AVERAGE BALANCE MUST BE :"+balance);
    }


    
}