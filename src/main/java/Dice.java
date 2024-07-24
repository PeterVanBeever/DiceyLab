import java.util.Random;

public class Dice {
    private int numberOfDice;
    private Random random;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
        this.random = new Random();
    }
    //    int toss and sum values
    public int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            // limit dice 1-6
            sum += random.nextInt(6) + 1;
        }
        return sum;
    }
}
