package design_pattern.strategy;

import design_pattern.strategy.attack.AttackBehavior;
import design_pattern.strategy.defende.DefenseBehavior;

public class FirePokemon extends Pokemon{



    public FirePokemon(String name, int level, AttackBehavior attackBehavior, DefenseBehavior defenseBehavior) {
        super(name, level, attackBehavior, defenseBehavior);
    }



}
