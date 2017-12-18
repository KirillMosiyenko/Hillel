public class Dog extends pet{
    public Dog(int id, int age, int weight, String colour, String name, boolean vaccinated, boolean trained) {
        super(id, age, weight, colour, name, vaccinated, trained);

    }

    public String voice() {
        String speak;
        speak = super.voice() + " Woof";
        return speak;
    }
    public String checkVaccinated(){
        String check;
        check = super.checkVaccinated()+"";
        return check;
    }

}
