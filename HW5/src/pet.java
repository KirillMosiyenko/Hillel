public abstract class pet extends Animals{
    private String name;
    boolean isVaccinated;
//    boolean isTrained;

    public pet(int id, int age, int weight, String colour, String name, boolean vaccinated, boolean trained) {
        super(id, age, weight, colour);
        this.name = name;
        this.isVaccinated = vaccinated;
//        this.isTrained = trained;
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
    public String checkVaccinated(){
        String check = "I have ";
        if(this.isVaccinated){
            check = check+" all vaccine";
        }else {check = check + " not vaccine";}
        return check;
    }

}
