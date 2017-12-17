public abstract class pet extends Animals{
    private String name;
    private boolean isVaccinated;
    boolean trained;

    public pet(int id, int age, int weight, String colour, String name, boolean isVaccinated, boolean trained) {
        super(id, age, weight, colour);
        this.name = name;
        this.isVaccinated = isVaccinated;
        this.trained = trained;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String voice() {
        return(super.voice()+" My name is " + this.name);
    }

}
