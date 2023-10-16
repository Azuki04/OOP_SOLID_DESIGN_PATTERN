package design_pattern.strategy.attack;

import design_pattern.strategy.Pokemon;

public class FireWhirl implements AttackBehavior{
    @Override
    public void attack(Pokemon attacker, Pokemon defender) {
        System.out.println("FireWhirl attacked "+ attacker.getName() + " attacked " + defender.getName());
        defender.setHp(defender.getHp() - 20);
    }
}
