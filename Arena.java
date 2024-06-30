package MagicArenaAssignment;

import java.util.Random;

public class Arena {
    private Player player1;
    private Player player2;
    private Random random;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }

    public void fight() {
        Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while (attacker.isAlive() && defender.isAlive()) {
            takeTurn(attacker, defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println("Match Over!");
        System.out.println(player1);
        System.out.println(player2);
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = rollDice();
        int defendRoll = rollDice();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendDamage = defender.getStrength() * defendRoll;

        int damage = Math.max(0, attackDamage - defendDamage);
        defender.reduceHealth(damage);

        System.out.println(attacker + " attacks " + defender + " for " + damage + " damage.");
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }
}
