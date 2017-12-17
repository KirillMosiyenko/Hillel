public class Cat extends pet {
    public Cat(int id, int age, int weight, String colour, String name, boolean isVaccinated, boolean trained) {
        super(id, age, weight, colour, name, isVaccinated, trained);
    }

    @Override
    public String voice() {
        return(super.voice()+"meooow");
    }
}
