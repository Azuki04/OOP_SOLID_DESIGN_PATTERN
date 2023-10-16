package design_pattern.strategy;

import design_pattern.strategy.attack.AttackBehavior;
import design_pattern.strategy.attack.DragonClaw;
import design_pattern.strategy.attack.FireWhirl;
import design_pattern.strategy.defende.DefendBig;
import design_pattern.strategy.defende.DefendNormal;
import design_pattern.strategy.defende.DefenseBehavior;

public class MainStrategy {
    public static void main(String[] args) {
        System.out.println("Strategy pattern start");
        System.out.println("_______________________");
        // attack behavior
        AttackBehavior dragonClaw = new DragonClaw();
        AttackBehavior fireWhirl = new FireWhirl();
        // defense behavior
        DefenseBehavior defendBig = new DefendBig();
        DefenseBehavior defendNormal = new DefendNormal();

        FirePokemon glurak = new FirePokemon("Glurak", 100, dragonClaw, defendBig);
        FirePokemon glumanda = new FirePokemon("Glumanda", 50, fireWhirl, defendNormal);


        glumanda.showStatus();

        System.out.println("_______________________");
        glurak.attack(glumanda);
        glumanda.showStatus();

        System.out.println("_______________________");
        glumanda.defense();
        glumanda.showStatus();

        // change attack behavior
        System.out.println("_______________________");
        glumanda.setDefenseBehavior(defendBig);
        glumanda.defense();
        glumanda.showStatus();

        System.out.println("Strategy pattern end");
    }



}
