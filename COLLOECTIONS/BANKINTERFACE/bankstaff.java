public interface bankstaff {
    void intresforstaff(int intrest);
    default void eligible(){
        System.out.println("ELIGIBLE FOR ANY LOAN ");
    }

    
    
}
