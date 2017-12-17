public class DogGiude extends Dog {
    private boolean isTrained;
    public DogGiude(int id, int age, int weight, String colour, String name, boolean isVaccinated, boolean trained) {
        super(id, age, weight, colour, name, isVaccinated, trained);
        this.isTrained = trained;
    }
    public boolean isTrained(){
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public String voice() {
        String speak = super.voice();
        if(this.isTrained()) {
            speak = speak + "I can take you Home.";
        }
        return speak;
    }

}
