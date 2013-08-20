import java.util.ArrayList;
import java.util.List;

public class TicTacToeGame {
    private List<Integer> moveXs = new ArrayList<Integer>();
    private List<Integer> moveOs = new ArrayList<Integer>();
    public boolean isLegalMove(int i) {
        return true;
    }

    public void playX(int i) {
        moveXs.add(i);
    }

    public List<Integer> getX() {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(moveXs);
        return result;
    }

    public void playO() {
        moveOs.add(2);
    }

    public List<Integer> getO() {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(moveOs);
        return result;
    }
}
