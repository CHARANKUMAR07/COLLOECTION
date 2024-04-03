import java.util.*;
import java.util.LinkedList;
public class linkedlistmethod{
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("charan");
        names.add("bharath");
        names.add("vinay");
        names.add("virat");
         System.out.println(names);

         names.remove(1);
         names.remove(0);
         System.out.println(names);

         names.add(1,"prabhas");
         names.add(2, "arjun");
         System.out.println(names);

         LinkedList<String> names1=new LinkedList<>();
        names1.add("kajal");
        names1.add("samantha");
        names1.add("priya");
        names1.add("amala");
         System.out.println(names1);

         LinkedList<String> actors=new LinkedList<>();
         actors.addAll(names);
         actors.addAll(2,names1);
         System.out.println(actors);

         LinkedList<String> names3=new LinkedList<>();
         names3.add("kajal agarval");
         names3.add("samantha prabhu");
         names3.add("priyamohanan");
         names3.add("amalapal");
          
         Iterator p =names3.listIterator();
         while (p.hasNext()) {
            System.out.println(p.next());
           }
           System.out.println("=========================="); 
         Iterator p1 =names3.listIterator(1);
         while (p1.hasNext()) {
            System.out.println(p1.next());
            
         }
         System.out.println("=========================="); 
         Iterator p2=names3.descendingIterator();
         while (p2.hasNext()) {
            System.out.println(p2.next());
            
         }
         names3.addFirst("tamanna");
         names3.addLast("keerthi suresh");
         System.out.println(names3);

         names3.offerFirst("SUBBALACHIMMI");
         names3.offerLast("SAROJAAA");
         System.out.println(names3);


         LinkedList<String> colours =new LinkedList<>();
         colours.add("yellow");
         colours.add("white");
         colours.add("pink");
         for(int i=0;i<colours.size();i++){
            System.out.println("Element at index "+ i + ":" + colours.get(i));
         }
        
         for(int i=0;i<colours.size();i++){
            System.out.println("Element at index "+ i + ":" + names.get(i));
         }

         Collections.swap(colours,0,1);
         System.out.println(colours);
         Collections.shuffle(colours);
         System.out.println(colours);

         



         
    }

}