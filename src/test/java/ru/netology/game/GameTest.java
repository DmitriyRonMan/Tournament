package ru.netology.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.exception.NotRegisteredException;
import ru.netology.game.Game;

public class GameTest {
    Game game = new Game();
    Player Andrei = new Player(01, "Andrei", 25);
    Player Dmitry = new Player(02, "Dmitry", 45);
    Player Evgeny = new Player(03, "Evgeny", 40);
    Player Aleksandr = new Player(04, "Aleksandr", 29);
    Player Oleg = new Player(05, "Oleg", 29);

    @Test
    public void testRoundGamePlayer1Strength() {
        game.register(Dmitry);
        game.register(Evgeny);

        int expected = game.round("Dmitry", "Evgeny");
        int actual = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRoundGamePlayer2Strength() {
        game.register(Andrei);
        game.register(Aleksandr);

        int expected = game.round("Andrei", "Aleksandr");
        int actual = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRoundGameDraw() {
        game.register(Oleg);
        game.register(Aleksandr);

        int expected = game.round("Oleg", "Aleksandr");
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRoundNotPlayer1() {
        game.register(Evgeny);
        game.register(Aleksandr);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("", "Aleksandr");
        });
    }

    @Test
    public void testRoundNotPlayer2() {
        game.register(Evgeny);
        game.register(Aleksandr);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Evgeny", "");
        });
    }

    @Test
    public void testRoundNotPlayers() {
        game.register(Evgeny);
        game.register(Aleksandr);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("", "");
        });
    }

    @Test
    public void testRoundOtherPlayers() {
        game.register(Evgeny);
        game.register(Aleksandr);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Oleg", "Aleksandr");
        });
    }
}

