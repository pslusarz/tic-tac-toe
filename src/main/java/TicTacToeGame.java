import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToeGame {
    private List<Integer> moveXs = new ArrayList<Integer>();
    private List<Integer> moveOs = new ArrayList<Integer>();
    public boolean isLegalMove(int i) {
        for (int move: moveXs) {
           if (move == i)
               return false;
        }
        for (int move: moveOs) {
            if (move == i)
                return false;
        }
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
        for (int i = 1; i< 8; i++) {
            if (isLegalMove(i)) {
                moveOs.add(i);
                break;
            }
        }
    }

    public List<Integer> getO() {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(moveOs);
        return result;
    }

    public boolean isFinished() {
        List<List<Integer>> winningPositions = new ArrayList<List<Integer>>();
        List<Integer> pos1 = list(new Integer[] { 1, 4, 7 });
        winningPositions.add(pos1);
        for (List<Integer> pos : winningPositions) {
            if (haveSameElements(pos, moveXs)) {
              return true;
            }
        }
        return false;
    }

    private boolean haveSameElements(List<Integer> a, List<Integer> b) {
       return (a.size() == b.size()) && a.containsAll(b);
    }

    private List<Integer> list (Integer[] arr) {
        return Arrays.asList(arr);
    }
}
