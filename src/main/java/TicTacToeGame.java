import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ps
 * Date: 8/19/13
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class TicTacToeGame {
    private List<Integer> moveXs = new ArrayList<Integer>();
    int moveO;
    public boolean isLegalMove(int i) {
        return true;
    }

    public void play(int i) {
        moveXs.add(i);
    }

    public List<Integer> getX() {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(moveXs);
        return result;
    }

    public void playO() {
        moveO = 2;
    }

    public List<Integer> getO() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(moveO);
        return result;
    }
}
