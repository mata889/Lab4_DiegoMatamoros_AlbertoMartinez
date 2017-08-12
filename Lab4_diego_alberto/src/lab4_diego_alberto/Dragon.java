package lab4_diego_alberto;

public class Dragon extends Piezas {

    int x, y;

    public Dragon() {
        super();
    }

    public Dragon(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "F";
    }

    public String[][] Movimiento(int pos1, int pos2, int nuevapos1, int nuevapos2, String[][] Tablero) {

        if (nuevapos1 == pos1 + 1 && nuevapos2 == pos2 + 1 || nuevapos1 == pos1 + 2 && nuevapos2 == pos2 + 2 || nuevapos1 == pos1 + 3 && nuevapos2 == pos2 + 3 || nuevapos1 == pos1 + 4 && nuevapos2 == pos2 + 4 || nuevapos1 == pos1 + 5 && nuevapos2 == pos2 + 5) {
            Tablero[nuevapos1][nuevapos2] = Tablero[pos1][pos2];
            Tablero[pos1][pos2] = " ";

            return Tablero;
        }
        return Tablero;
    }

    @Override
    public String[][] Movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
