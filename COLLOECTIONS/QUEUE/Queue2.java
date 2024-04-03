import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

public class Queue2 {
    public static void main(String[] args) {
        Queue<String> std=new PriorityQueue<>() ;
         std.add("jay");
         std.add("jayanth");
         std.add("mahi");
          ArrayList<String> a=new ArrayList<>(std);
       System.out.println(a);
       Collections.reverse(a);
       System.out.println(a);

       String[] b=new String[a.size()];
        b =a.toArray(b);
        for(String d:b){
            System.out.println(d);

        }

System.out.println(std);
std.poll();
System.out.println(std);
std.add("hello");
std.add("hello");
std.add("ajay");
System.out.println(std);
 std.poll();
 System.out.println(std);
 std.poll();
System.out.println(std); 

    System.out.println(std.equals("mahi"));
            
        
    }
    
}
