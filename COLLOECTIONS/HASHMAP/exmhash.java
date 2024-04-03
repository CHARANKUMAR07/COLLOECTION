import java.util.HashMap;
import java.util.*;
    public class exmhash {
    public static void main(String[] args) {
        HashMap<Integer,String> student =new HashMap<>();
        student.put(1, "CHARAN");
        student.put(2,"boji");
        student.put(3,"kohli" );
        student.put(4,"boji");
        Set s=student.entrySet();
        System.out.println(s);
        for(Map.Entry x : student.entrySet()){
            System.out.println(x);
        }

        String str= (String)student.get(3);
        System.out.println(str);

        System.out.println(student.get(2));

    Set key=student.keySet();
    System.out.println(key);

    System.out.println(student.keySet());
    
    
    System.out.println(student.values());

}
    }