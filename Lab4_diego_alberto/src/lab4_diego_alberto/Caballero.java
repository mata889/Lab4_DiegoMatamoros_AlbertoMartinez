package lab4_diego_alberto;

public class Caballero extends Piezas {

    int x, y;

    public Caballero() {
        super();
    }

    public Caballero(int x, int y) {
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
    public int Movimiento() {
        if (x<0 || y<0) {

        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
