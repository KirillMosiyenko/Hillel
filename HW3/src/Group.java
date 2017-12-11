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



    private static String stringInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}



