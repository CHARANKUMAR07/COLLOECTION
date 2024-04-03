import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapexp {
    public static void main(String[] args) {
        HashMap<Integer,String> student =new HashMap<>();
        student.put(1, "CHARAN");
        student.put(2,"boji");
        student.put(3,"kohli" );
        //student.clear();
        System.out.println(student);
        System.out.println(student.isEmpty());
        HashMap<Integer,String> student1 =new HashMap<>();
        student1.put(4, "jayanth");
        student1.put(5,"bharath");
        student1.put(6,"vinay" );
        System.out.println(student1.isEmpty());
        student.putAll(student1);
     System.out.println(student);
        for(Map.Entry x : student.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
       
        HashMap<Integer,String> s=new HashMap<>();
        s.put(11, "CHARAN");
        s.put(11,"boji");
        s.put(11,"kohli" );
        System.out.println(s.containsKey(11));
         System.out.println(s);
        s.putAll(student);

        HashMap<Integer,String> student3=(HashMap)s.clone();
        //student3=(HashMap)student2.clone();
       System.out.println(student3);

      
    }

}

