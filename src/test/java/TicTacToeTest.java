import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

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
        //assertEquals(1, game.getX().size());
    }

}
