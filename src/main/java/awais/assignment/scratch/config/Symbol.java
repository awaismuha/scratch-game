package awais.assignment.scratch.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author awais
 */
public record Symbol(
        @JsonProperty("reward_multiplier")
        BigDecimal rewardMultiplier,
        BigDecimal extra,
        SymbolType type,
        ImpactType impact
) {
}
