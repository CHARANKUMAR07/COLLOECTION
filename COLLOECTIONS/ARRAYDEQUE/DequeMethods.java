import java.net.Socket;
import java.util.ArrayDeque;

public class DequeMethods{
    public static void main(String[] args) {
        ArrayDeque<String> names=new ArrayDeque<>();
        names.add("MAHESH BABU");
        names.add("ARJUN");
        names.offer("BALAYYA");
        names.offerFirst("BABU");
        names.offerLast("KRISHNA");
        System.out.println(names);
    }
}