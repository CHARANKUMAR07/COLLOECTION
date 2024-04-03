import java.util.HashMap;
import java.util.Map;

public class hashmapstudent{
    public static void main(String args[]){
        HashMap<Integer,String> student =new HashMap<Integer,String>();
        student.put(1, "BHARATH");
        student.put(2,"JAYANTH");
        student.put(3,"boji");
        student.put(6, "JAYANTH THARAK");
       System.out.println(student);
       System.out.println(student.get(2));
       System.out.println(student.size());
       student.put(4,"venkey");
       System.out.println(student);
       System.out.println(student.isEmpty());
       student.getOrDefault(5,"no student");
       System.out.println(student.containsKey(2));
      // student.remove(1);
       //System.out.println(student);

       for(Map.Entry x:student.entrySet()){
        System.out.println(x.getKey()+" "+x.getValue());
       }

        
    }
}