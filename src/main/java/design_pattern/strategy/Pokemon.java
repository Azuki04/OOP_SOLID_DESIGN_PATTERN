package design_pattern.strategy;

import design_pattern.strategy.attack.AttackBehavior;
import design_pattern.strategy.defende.DefenseBehavior;

public abstract class Pokemon {

    String name;
    int level;
    int hp;

    AttackBehavior attackBehavior;
    DefenseBehavior defenseBehavior;


    public Pokemon(String name, int level, AttackBehavior attackBehavior, DefenseBehavior defenseBehavior) {
        this.name = name;
        this.level = level;
        this.hp = 100;
        this.attackBehavior = attackBehavior;
        this.defenseBehavior = defenseBehavior;
    }

    public void attack(Pokemon enemy) {
        attackBehavior.attack(this, enemy);
    }

    public void defense() {
        defenseBehavior.defense(this);
    }

    public void showStatus() {
        System.out.println("#########################");
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("#########################");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public AttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public DefenseBehavior getDefenseBehavior() {
        return defenseBehavior;
    }

    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        this.defenseBehavior = defenseBehavior;
    }
}
