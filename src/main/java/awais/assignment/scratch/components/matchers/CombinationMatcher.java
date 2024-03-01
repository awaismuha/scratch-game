package awais.assignment.scratch.components.matchers;

import awais.assignment.scratch.config.WinCombination;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author awais
 */
public class CombinationMatcher {

    private final Map<String, WinCombination> winCombinations;

    protected CombinationMatcher() {
        winCombinations = Map.of();
    }

    public CombinationMatcher(Map<String, WinCombination> winCombinations) {
        this.winCombinations = winCombinations;
    }

    public List<MatchingResult> match(String[][] board) {
        List<MatchingResult> result = new ArrayList<>();

        result.addAll(new SameSymbolMatcher(winCombinations).match(board));
        result.addAll(new LinearMatcher(winCombinations).match(board));

        return result;
    }

    protected record CombinationDescriptor(
            String name,
            WinCombination winCombination
    ){}
}
