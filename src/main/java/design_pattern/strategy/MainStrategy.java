package design_pattern.strategy;

import design_pattern.strategy.attack.AttackBehavior;
import design_pattern.strategy.attack.DragonClaw;
import design_pattern.strategy.attack.FireWhirl;
import design_pattern.strategy.defende.DefendBig;
import design_pattern.strategy.defende.DefendNormal;
import design_pattern.strategy.defende.DefenseBehavior;

public class MainStrategy {

    public static void startStrategy() {
        System.out.println("Strategy pattern start");

        AttackBehavior dragonClaw = new DragonClaw();
        AttackBehavior fireWhirl = new FireWhirl();

        DefenseBehavior defendBig = new DefendBig();
        DefenseBehavior defendNormal = new DefendNormal();

        FirePokemon Glurak = new FirePokemon("Glurak", 100, dragonClaw, defendBig);
        FirePokemon Glumanda = new FirePokemon("Glumanda", 50, fireWhirl, defendNormal);


        Glurak.showStatus();
        Glumanda.showStatus();

        Glurak.attack(Glumanda);
        Glumanda.showStatus();

        Glumanda.defense();
        Glumanda.showStatus();

        // change attack behavior
        Glumanda.setDefenseBehavior(defendBig);
        Glumanda.defense();
        Glumanda.showStatus();



        System.out.println("Strategy pattern end");
    }
}
