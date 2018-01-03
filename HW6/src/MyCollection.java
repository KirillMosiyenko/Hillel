import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public  class MyCollection  {

    ArrayList<String> Massif = new ArrayList<String>();

    String Contains(Object a){
        String unswer = "no";
        if(Massif.contains(a)){
            unswer=a + " contains in list";
        }
        return unswer;
    }
    ArrayList<String> add(String o){
        Massif.add(o);
        return Massif;
    }
    int size(){
        int i = 0;
          i=Massif.size();
        return i;
    }
    String isEmpty(){
        String unswer = "no";
        if(Massif.isEmpty()){
            unswer = "yes";
        }
        return unswer;
    }
    ArrayList<String> remove(String o){
        Massif.remove(o);
        return Massif;
    }
//    ArrayList<String> addAll (MyCollection temp){
//        Massif.addAll(temp);
//        return Massif;
//    }
    void Clear(){
        Massif.clear();
    }


}
