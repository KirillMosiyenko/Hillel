
import java.util.Arrays;

public class Students {
    String name;
    int numberOfLessons;
    int [] marks = new int [numberOfLessons];
    boolean [] visit;
    String group;


    Students(){
        name ="";
        marks = new int[0];
        visit = new boolean[]{};
    }


    public Students(String student) {
        this.name=student;
    }

    public void Status(){
        System.out.println("name is   "+ name+ "//  marks is "+ Arrays.toString(marks));
    }


}
