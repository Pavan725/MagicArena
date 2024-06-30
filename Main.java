package MagicArenaAssignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter attributes for Player A:");
        Player playerA = createPlayer(scanner);

        System.out.println("Enter attributes for Player B:");
        Player playerB = createPlayer(scanner);

        Arena arena = new Arena(playerA, playerB);
        arena.fight();
    }

    private static Player createPlayer(Scanner scanner) {
        System.out.print("Health: ");
        int health = scanner.nextInt();
        System.out.print("Strength: ");
        int strength = scanner.nextInt();
        System.out.print("Attack: ");
        int attack = scanner.nextInt();
        return new Player(health, strength, attack);
    }
}

