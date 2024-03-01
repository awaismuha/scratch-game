package awais.assignment.scratch.config;

import java.util.Map;

/**
 * @author awais
 */
public record CellDistribution(
        int column,
        int row,
        Map<String, Integer> symbols
) {
}
