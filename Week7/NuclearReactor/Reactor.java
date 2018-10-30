package NuclearReactor;

import java.util.Random;

public class Reactor {
    private int throughputLevel = 0;

    public Reactor(int throughputLevel) {
        this.throughputLevel = throughputLevel;
    }

    public int getThroughputLevel() {
        return throughputLevel;
    }

    public void increaseThroughput() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        this.throughputLevel += r.nextInt(high - low) + low;
        if (getReactorStatus()){
            throw new IllegalStateException();
        }
    }

    public void decreaseThroughput() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        this.throughputLevel -= r.nextInt(high - low) + low;
    }

    public boolean getReactorStatus() {
        if (this.throughputLevel >= 100 || this.throughputLevel <= 1) {
            return true;
        } else {
            return false;
        }
    }



}
