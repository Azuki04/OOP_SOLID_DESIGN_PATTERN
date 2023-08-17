package design_pattern.strategy.defende;

import design_pattern.strategy.Pokemon;

public class DefendNormal implements DefenseBehavior{
    @Override
    public void defense(Pokemon pokemon) {
        System.out.println("Defend Normal");
        pokemon.setHp(pokemon.getHp() + 10);
    }
}
