import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created with IntelliJ IDEA.
 * User: ps
 * Date: 8/19/13
 * Time: 10:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class TicTacToeTest {
    @Test
    public void testInTheBeginningAllMovesAreLegal() {
        TicTacToeGame game = new TicTacToeGame();
        for (int i = 1; i<8; i++) {
          assertTrue(game.isLegalMove(i));
        }
    }

    @Test
    public void testRemembersFirstMove() {
        TicTacToeGame game = new TicTacToeGame();
        game.play(1);
        assertNotNull(game.getX());
        assertEquals(1, game.getX().size());
        assertEquals(1, game.getX().get(0));
    }

    @Test
    public void testRemembersFirstMoveTriangulate() {
        TicTacToeGame game = new TicTacToeGame();
        game.play(2);
        assertNotNull(game.getX());
        assertEquals(1, game.getX().size());
        assertEquals(2, game.getX().get(0));
    }

    @Test
    public void testOpponentMoves() {
        TicTacToeGame game = new TicTacToeGame();
        game.play(1);
        game.playO();
        assertNotNull(game.getO());
        assertEquals(1, game.getO().size());
        assertEquals(2, game.getO().get(0));
    }

    @Test
    public void testRememberSecondMove() {
        TicTacToeGame game = new TicTacToeGame();
        game.play(1);
        game.playO();
        game.play(3);
        assertEquals(2, game.getX().size());
        assertEquals(3, game.getX().get(1));
    }

}
