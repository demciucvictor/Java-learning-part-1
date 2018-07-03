public class DecreasingCounter {
    private int value;
    private int i;// instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.i=valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value>0){   
            value--;
        }
        
    }
    public void reset(){    
        value=0;
    }

    public void setInitial(){   
        value=i;
    }
}
