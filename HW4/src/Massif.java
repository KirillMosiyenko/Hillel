public class Massif {
    private int [] masiff;

    public int[] getMasiff() {
        return masiff;
    }
    public void setMasiff(int[] masiff) {
        this.masiff = masiff;
    }

    int[] add(int i){ //Добавление к массиву. Вопрос: почему int[] add(int i)???
        int length = masiff.length;
        int temp [] = new int [masiff.length+1];
        System.arraycopy(masiff, 0, temp, 0,length);
        temp[length]=i;
        masiff = temp;
        return masiff;
    }
    int get(int i){
        i=masiff[i-1];
        return i;
    }
    boolean contains(int i){
        boolean unswer;
        unswer = false;
        for(int n: this.masiff){
            if(n==i){
                unswer =true;
                break;
            }
        }
        return unswer;
    }
    int [] addAll(int [] Plus){
        int [] temp = new int [masiff.length + Plus.length];
        System.arraycopy(masiff, 0, temp, 0, masiff.length);
        System.arraycopy(Plus,0,temp,Plus.length, Plus.length);
        masiff = temp;
        return masiff;
    }
    boolean equal(int [] equalMassif){
        boolean unswear = true;
        if(masiff.length!=equalMassif.length){
            System.out.println("Length of massif is different");
            unswear = false;
            return unswear;
        }
        for(int i=0; i< masiff.length;i++){
            if(masiff[i]!=equalMassif[i]){
                System.out.println("Two massifs are not equal.");
                unswear = false;
                break;
            }

        }
        System.out.println("Two massifs is equal.");
        return unswear;
    }
    int [] clear (){
        int [] temp = new int[0];
        masiff = temp;
        return  masiff;
    }
    int find(int findIndex){
        int i=0;
        for(int j:masiff){
            if(masiff[i]==findIndex){
                System.out.println("w");
                break;
            }
            i++;
        }
        return i;
    }
    int getSize(){
        int i;
        i=masiff.length;
//        for (i=0; i<masiff.length;i++){
//
//        }
        return i;
    }
}
