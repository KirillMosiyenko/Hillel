import java.util.Collection;
import java.util.Iterator;

public class MyCollection implements Collection {
    private Object [] massif= new Object [0];


    public Object getMassif(int i) {
        return massif[i];
    }

    public void setMassif(Object[] massif) {
        this.massif = massif;
    }

    @Override
    public int size() {
        return massif.length;
    }

    @Override
    public boolean add(Object o) {
        Object [] temp = new Object[massif.length+1];
        for(int i =0; i<massif.length; i++){
            temp[i]=massif[i];
        }
        temp[massif.length]=o;
        massif = temp;
        return false;
    }

    @Override
    public boolean isEmpty() {
        boolean unswear = false;
        if(massif.length == 0){
            unswear = true;
        }
        return unswear;
    }

    @Override
    public boolean contains(Object o) {
        boolean unswear = false;
        for(Object i : massif){
            if(i == o){
                unswear = true;
                break;
            }
        }
        return unswear;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        int i, n =0;
        Object [] temp = new Object [massif.length-1];
        if(contains(o)){
            for(i = 0; i<massif.length-1; i++){
                if(massif[i]==o){
                    n++;
                }
                temp [i] = massif[n];
                n++;
            }
            massif = temp;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        MyCollection Add = (MyCollection)c;
        for(int i=0; i< c.size(); i++){
            add(Add.getMassif(i));
        }
        return false;
    }

    @Override
    public void clear() {
        massif = new Object[0];

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        MyCollection temp = (MyCollection) c;
        for(int i=0; i<c.size();i++){
            if(contains(temp.getMassif(i))){
                remove(temp.getMassif(i));
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
