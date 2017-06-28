public class Reformatory {
    private int weightCounter = 0;
    
    public int weight(Person person) {
        weightCounter++;
        return person.getWeight();
        
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return weightCounter;
    }

}
