package design_pattern.strategy.attack;

import design_pattern.strategy.Pokemon;

public interface AttackBehavior {
    void attack(Pokemon attacker, Pokemon defender);
}
