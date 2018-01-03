import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String []args){
        MyCollection test = new MyCollection();
        System.out.println(test.size()); //Size
        //add and size
        System.out.println("size and add");
        System.out.println(test.add("qwe"));
        System.out.println(test.size());
        System.out.println(test.add("asd"));
        System.out.println(test.size());
        //isEmpty
        System.out.println("Empty");
        System.out.println(test.isEmpty());
        //Contains
        System.out.println("contains");
        System.out.println(test.contains("asd"));
        System.out.println(test.contains("fg"));
        //remove
        System.out.println("remove");
        System.out.println(test.remove("qwe"));
        System.out.println(test.size());
        //addAll
        System.out.println("AddAll");
        test.add("1");
        Collection testAdd = new ArrayList();
        testAdd.add("2");
        test.addAll(testAdd);
        System.out.println(test.size());
        //removeAll
//        System.out.println("removeAll");
//        test.add("1");
//        MyCollection testAdd = new MyCollection();
//        testAdd.add("1");
//        System.out.println(test.size());
//        System.out.println(testAdd.size());
//        test.removeAll(testAdd);
//        System.out.println(test.size());


    }
}
