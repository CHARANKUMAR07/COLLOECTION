public interface shapes{
     void area(int l,int b);
     default void colour(String colour){
        System.out.println("COLOUR IS: " +colour);
     }
    

}