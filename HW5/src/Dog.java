public class Dog extends pet{
    public Dog(int id, int age, int weight, String colour, String name, boolean isVaccinated, boolean trained) {
        super(id, age, weight, colour, name, isVaccinated, trained);
    }

    public String voice() {
        String speak;
        speak = super.voice() + " Woof";
        return speak;
    }
}
