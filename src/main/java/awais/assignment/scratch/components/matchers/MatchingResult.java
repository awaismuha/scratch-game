package awais.assignment.scratch.components.matchers;

import awais.assignment.scratch.config.CombinationGroup;

import java.math.BigDecimal;

/**
 * @author awais
 */
public record MatchingResult(
        String symbol,
        String combination,
        CombinationGroup group,
        BigDecimal rewardMultiplier
) {
}
