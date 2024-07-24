public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    private Bins bins;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins(numberOfDice, numberOfDice * 6);
    }

    public void runSimulation() {
        Dice dice = new Dice(numberOfDice);
        for (int i = 0; i < numberOfTosses; i++) {
            int result = dice.tossAndSum();
            bins.incrementBin(result);
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.printf("Simulation of %d dice tossed for %d times.%n", numberOfDice, numberOfTosses);
        System.out.println("***");

        for (int i = numberOfDice; i <= numberOfDice * 6; i++) {
            int count = bins.getBin(i);
            double percentage = (double) count / numberOfTosses;
            System.out.printf("%2d : %8d: %.2f ", i, count, percentage);
            for (int j = 0; j < (int) (percentage * 100); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
