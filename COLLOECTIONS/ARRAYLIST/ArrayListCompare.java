import java.util.*;
public class ArrayListCompare {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<>();
        colour.add("white");
        colour.add("yellow");
        colour.add("pink");
        colour.add("black");
        Collections.swap(colour,0,2);

        System.out.println("list1  "+colour);

        ArrayList<String>colour1=new ArrayList<>();
        colour1.add("yellow");
        colour1.add("blue");
        colour1.add("pink");
        colour1.add("white");
        colour1.add("grey");
        colour1.add("orange");
        List<String> a=colour1.subList(0, 3);
        System.out.println("THE SUBLIST ELEMENTS ARE:  "+ a);
         System.out.println("list2"+colour1);

        ArrayList<String> compare=new ArrayList<>();
        for(String e:colour){
            compare.add(colour1.contains(e) ? "yes":"no");
           
        }
        System.out.println(compare);
ArrayList<String> newlist=new ArrayList<>();
newlist.addAll(colour);
newlist.addAll(colour1);
System.out.println(" ADDITION OF TWO LIST IS : "+ newlist);
 ArrayList<String> clonelist=(ArrayList<String>)newlist.clone();
 System.out.println(clonelist);


    }
    
}
