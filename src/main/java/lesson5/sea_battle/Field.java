package lesson5.sea_battle;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private char[][] field;
    private char emptyCell = '.';
    private char shipCell = 'O';
    private char destroyedShip = 'X';
    private char missedShotCell = '*';
    private List<Ship> ships = new ArrayList<>();
//    private Ship[] ships = new Ship[10];

    public Field() {
        field = new char[10][10];
        init();
    }

    private void init() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = emptyCell;
            }
        }
    }

    public void repaint(boolean forOpponent) {
        // Если forOpponent - true, нужно отображать поле без неподбитых кораблей
        // Если forOpponent - false, нужно отображать все символы
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
