package awais.assignment.scratch.components;

import awais.assignment.scratch.config.CellDistribution;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

/**
 * @author awais
 */
public class Distribution {
    private final NavigableMap<Double, String> map = new TreeMap<>();
    private final Random random = new Random();
    private double total = 0;

    public Distribution(CellDistribution cellDistribution) {
        cellDistribution.symbols().forEach((symbol, weight) -> add(weight, symbol));
    }

    private void add(double weight, String symbol) {
        if (weight > 0) {
            total += weight;
            map.put(total, symbol);
        }
    }

    public String next() {
        double value = random.nextDouble() * total;
        return map.higherEntry(value).getValue();
    }
}
