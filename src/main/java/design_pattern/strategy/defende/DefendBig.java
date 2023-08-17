package design_pattern.strategy.defende;

import design_pattern.strategy.Pokemon;

public class DefendBig implements DefenseBehavior{

    @Override
    public void defense(Pokemon pokemon) {
        System.out.println("Defend Big");
        pokemon.setHp(pokemon.getHp() + 30);
    }
}
