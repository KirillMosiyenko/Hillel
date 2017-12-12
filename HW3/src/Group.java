import java.util.Arrays;
import java.util.Scanner;

public class Group {
    String nameOfGroup;
    Students[]list;
    Group(){
       nameOfGroup="";
       list=new Students[0];
    }
    public Students[] addStudent(){
        Students[]temp;
        while(true){
        temp = new Students[list.length+1];
        System.arraycopy(list,0,temp,0,list.length);
        list=temp;
        list[list.length-1]= new Students ();
        System.out.println("Please enter the name of student");
        list[list.length-1].name=stringInput();
        System.out.println("Do you want add one more student? yes/no.");
        if(stringInput().equals("no")){
            break;
            }
        }
        return list;
    }

      void putMarks(Students[]list) {
        System.out.println("Please enter the name of student for put marks");
        String nameStudent = stringInput();
        int n=0;
        int []temp =new int[0];
        for (int i=0; i<=list.length; i++ ) {
            if(list[i].name.equals(nameStudent)){
                //System.out.println(list[i].name);
                temp = list[i].marks;
                n=i;
                break;
            }
        }
        while (true) {
            int[] tempMarks = new int[temp.length + 1];
            System.arraycopy(temp, 0, tempMarks, 0, temp.length);
//            System.out.println("first element of tempmarks"+tempMarks[0]);
            System.out.println("Please enter the mark");
            tempMarks[tempMarks.length-1] = intInput();
            temp = tempMarks;
//            for (int l:tempMarks) {
//                System.out.println(l);
//            }
//            System.out.println(temp[temp.length - 1]);
            list[n].marks=temp;
            System.out.println("Do you want add marks?");
            if(stringInput().equals("no")){
                break;
            }
        }
    }
    void aboutMarksStudent(Students[]list){
        System.out.println("Please enter the name of student for print marks");
        String nameStudent = stringInput();
        for (int i=0; i<=list.length; i++ ) {
            if(list[i].name.equals(nameStudent)){
                System.out.println("Students marks "+list[i].name);
                System.out.println(Arrays.toString(list[i].marks));
                break;
               }
        }
    }

        public Students[] deleteStudent(Students[]list){
        Students[]temp;

            temp = new Students[list.length - 1];
            int k = 0;
            String tempNameDeleteStudent = "";
            System.out.println("Group listed next student. Please choose the name");
                        for (Students i : list) {
                System.out.println(i.name);
            }
            tempNameDeleteStudent = stringInput();
            for (Students i : list) {
                if (i.name.equals(tempNameDeleteStudent)) {
                    continue;
                }
                temp[k] = i;
                k++;
            }
            list = temp;
        return list;
    }



    private static String stringInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    private static int intInput() {
        int value;
        Scanner input = new Scanner(System.in);
        try {
            value = input.nextInt();
        } catch (Exception e) {
            System.out.print("Please, enter number in correct form.");
            return intInput();
        }
        return value;
    }


}




