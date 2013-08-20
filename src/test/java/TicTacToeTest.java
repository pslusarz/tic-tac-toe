import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class TicTacToeTest {
    TicTacToeGame game;
    @Before
    public void setUp() {
        game = new TicTacToeGame();
    }
    @Test
    public void testInTheBeginningAllMovesAreLegal() {
        for (int i = 1; i<8; i++) {
          assertTrue(game.isLegalMove(i));
        }
    }

    @Test
    public void testRemembersFirstMove() {
        game.playX(1);
        assertNotNull(game.getX());
        assertEquals(1, game.getX().size());
        assertEquals(1, game.getX().get(0));
    }

    @Test
    public void testRemembersFirstMoveTriangulate() {
        game.playX(2);
        assertNotNull(game.getX());
        assertEquals(1, game.getX().size());
        assertEquals(2, game.getX().get(0));
    }

    @Test
    public void testOpponentMoves() {
        game.playX(1);
        game.playO();
        assertNotNull(game.getO());
        assertEquals(1, game.getO().size());
        assertEquals(2, game.getO().get(0));
    }

    @Test
    public void testRememberSecondXMove() {
        game.playX(1);
        game.playO();
        game.playX(3);
        assertEquals(2, game.getX().size());
        assertEquals(3, game.getX().get(1));
    }

    @Test
    public void testXcannotMoveOnX() {
        game.playX(1);
        game.playO();
        assertFalse(game.isLegalMove(1));
    }
    @Test
    public void testXcannotMoveOnY() {
        game.playX(1);
        game.playO();
        assertFalse(game.isLegalMove(game.getO().get(0)));
    }

    @Test
    public void testRememberSecondYMove() {
        game.playX(1);
        game.playO();
        game.playX(3);
        game.playO();
        assertEquals(2, game.getO().size());
        assertEquals(4, game.getO().get(1));
    }
    @Test
    public void testRecognizeAFinishedGame() {
        game.playX(1);
        game.playO();
        game.playX(4);
        game.playO();
        assertFalse(game.isFinished());
        game.playX(7);

        assertTrue(game.isFinished());
        //assertTrue(game.xWon());

    }



}
