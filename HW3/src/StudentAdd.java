
import java.util.Scanner;

public class StudentAdd {
    public static void main (String[] args){
        Group [] group = new Group[0];
        Group [] tempGroup;
        int chooseNumber;
        while(true){
            System.out.println("Please press number of what do you want: 1. add new group; 2. add new student; 3. Print list students of group;" +
                    "\n 4. Put marks;");
            chooseNumber = intInput();
            switch(chooseNumber){
                case 1:
                    while(true){
                        tempGroup = new Group[group.length+1];
                        System.arraycopy(group,0,tempGroup,0, group.length);
                        group=tempGroup;
                        group[group.length-1]=new Group();
                        System.out.println("Please enter the name of group, what you want");
                        group[group.length-1].nameOfGroup = stringInput();
                        System.out.println("Do you want add one more group? Yes/no.");
                        if(stringInput().equals("no")){
                            break;
                        }
                    }
                    break;
                case 2:
                    int numberG=0;
                    String tempNameGroup;
                    aboutGroup(group);
                    System.out.println("Please enter the name of group, where you want add student");
                    tempNameGroup = stringInput();
                    for(int i=0; i<= group.length; i++){
                        if(group[i].nameOfGroup.equals(tempNameGroup)){
                            numberG=i;
                            break;
                        }
                    }
                    group[numberG].addStudent();
                    break;
                case 3:
                    aboutGroup(group);
                    break;
                case 4:

            }

            //System.out.println(group[2].nameOfGroup);
        }
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
    private static String stringInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static void aboutGroup(Group AG[]){
        System.out.println("You have: "+AG.length+" groups.");
        for (Group i : AG){
            System.out.println(i.nameOfGroup);
            for (Students j:i.list) {
                System.out.println("  "+j.name);
            }

        }
    }
}
