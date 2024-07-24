import java.util.HashMap;
import java.util.Map;

public class Bins {
    // hash map of integers for each bin of possible outcome
    private Map<Integer, Integer> bins;

    // min and max possible rolls, constructor
    public Bins(int min, int max) {
        // initialize the bin
        bins = new HashMap<>();
        // start at 0, enter value as key
        for (int i = min; i <= max; i++) {
            bins.put(i, 0);
        }
    }

    public int getBin(int bin) {
        // get bin count, get bin # count
        return bins.get(bin);
    }
    //
    public void incrementBin(int bin) {
        bins.put(bin, bins.get(bin) + 1);
    }
}
