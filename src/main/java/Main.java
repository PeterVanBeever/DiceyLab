public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000); // one million tosses
        simulation.runSimulation();
        simulation.printResults();
    }
}
