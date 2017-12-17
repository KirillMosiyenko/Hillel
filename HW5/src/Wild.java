public abstract class Wild extends Animals{
    private boolean isPredator;

    public Wild(int id, int age, int weight, String colour, boolean isPredator) {
        super(id, age, weight, colour);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {

        return isPredator;
    }

    public void setPredator(boolean predator) {

        isPredator = predator;
    }
    @Override
    public String voice() {
      String speak;
      speak = super.voice()+" i am wild animal ";
      if(this.isPredator()){
          speak = speak + "and I am angry";
      }
      return speak;
    }
}
