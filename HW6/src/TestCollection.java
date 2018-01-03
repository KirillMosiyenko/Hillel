
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestCollection {

    public static void main(String []args){
        MyCollection ListFirst = new MyCollection();
        ListFirst.add("Pasha");
        ListFirst.add("Dasha");
        System.out.println(ListFirst.size());
        ListFirst.add("Katya");
        System.out.println(ListFirst.size());
        System.out.println(ListFirst.isEmpty());
        System.out.println(ListFirst.Contains("Pasha"));
        System.out.println(ListFirst.remove("Pasha"));
        System.out.println(ListFirst.size());
        MyCollection SecondfList = new MyCollection();
        SecondfList.add("Tonya");
        SecondfList.add("Kumis");
        System.out.println(SecondfList.size());
        SecondfList.Clear();
        System.out.println(SecondfList.size());
        SecondfList.add("123");
        System.out.println(SecondfList.size());
//        SecondfList.addAll(ListFirst);
        System.out.println(SecondfList.size());
    }
}
