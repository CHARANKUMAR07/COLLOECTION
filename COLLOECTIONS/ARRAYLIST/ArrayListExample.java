
import java.lang.reflect.Array;
import java.util.*;
public class ArrayListExample{
    public static void main(String[] args) {
        String[] name={"BHARATH","VINAY","JAYANTH"};
        ArrayList<String> names1 =new ArrayList<>(Arrays.asList(name));
       // List names=Arrays.asList(name);
       names1.add("MAHESH BABU");
       names1.add("JAYA KRISHNA");
       Collections.sort(names1);
        System.out.println(names1);
        
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
     num.add(40);
     num.add(60);
     num.add(2,70);
     
System.out.println(num);
ArrayList<Integer> number = new ArrayList<>();
number.add(100);
number.add(200);
number.add(300);
System.out.println(number);




num.remove(1);
System.out.println(num);
        
num.remove(Integer.valueOf(10));
System.out.println(num);
num.set(2,22);
System.out.println(num);
num.addFirst(11);
System.out.println(num);
num.addLast(11);
System.out.println(num);
Collections.sort(num);
Collections.reverse(num);
System.out.println(num);
num.addAll(1, number);
System.out.println(num);

//num.addAll(number);
//System.out.println(num);
boolean containsnumber=num.contains(100);
System.out.println("DOES IT CONTAINS :"+ containsnumber);

 int no=num.get(3); 
 System.out.println(no);

  boolean a =num.isEmpty();
  System.out.println(a);
  //num.clear();
 // boolean b =num.isEmpty();
  System.out.println(num.isEmpty());
}
}