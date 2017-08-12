package lab4_diego_alberto;

public class Rey extends Piezas {

    int x, y;

    public Rey() {
        super();
    }

    public Rey(int x, int y) {
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

    public String toString() {
        return "M";
    }

    public String[][] Movimiento(int pos1, int pos2, int nuevapos1, int nuevapos2, String[][] Tablero) {

        return Tablero;
    }

    @Override
    public String[][] Movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
