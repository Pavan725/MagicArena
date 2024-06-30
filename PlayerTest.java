package MagicArenaAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerCreation() {
        Player player = new Player(100, 10, 5);
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(5, player.getAttack());
    }

    @Test
    public void testPlayerHealthReduction() {
        Player player = new Player(100, 10, 5);
        player.reduceHealth(30);
        assertEquals(70, player.getHealth());
    }

    @Test
    public void testPlayerDeath() {
        Player player = new Player(30, 10, 5);
        player.reduceHealth(30);
        assertEquals(0, player.getHealth());
        assertFalse(player.isAlive());
    }
}

