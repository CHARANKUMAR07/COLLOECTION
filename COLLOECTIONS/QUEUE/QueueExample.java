import java.util.*;

import javax.sound.midi.Soundbank;
public class QueueExample{
    public static void main(String[] args) {
        Queue<String> student =new PriorityQueue<String>();
        student.add("CHARAN");
        student.offer("vinay");
        student.offer("kumar");
        student.offer("bharath");
        System.out.println(student);

        System.out.println(student.peek());
        System.out.println(student.element());
        System.out.println(student.contains("bharath"));
        student.clear();
        System.out.println(student);
System.out.println(student.peek());
          try{
                System.out.println(student.element());
                }
                 catch(Exception E){
        
                System.out.println("no elements present to peek" +E);
                 }
                 student.offer("kajal");
        student.offer("agarval");
        student.offer("tamanna");
        student.offer("saroja");
        student.add("hello");
        student.add("world");
        System.out.println(student);
        student.poll();
System.out.println(student);
Queue<String> std=new PriorityQueue<>();
std.addAll(student);
System.out.println(std); 
std.add("bye");
std.add("hie");       
student.containsAll(std);
System.out.println(student);
       
    }
}
