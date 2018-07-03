public class Reformatory {
    private int n;

    public int weight(Person person) {
        int i=person.getWeight();
        n++;
        return i;
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    public int totalWeightsMeasured(){
        return this.n;
    }

}
