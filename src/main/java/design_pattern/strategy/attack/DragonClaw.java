package design_pattern.strategy.attack;

import design_pattern.strategy.Pokemon;

public class DragonClaw implements AttackBehavior{

    @Override
    public void attack(Pokemon attacker, Pokemon defender) {
        System.out.println("dragonClaw attacked "+ attacker.getName() + " attacked " + defender.getName());
        defender.setHp(defender.getHp() - 90);
    }
}
