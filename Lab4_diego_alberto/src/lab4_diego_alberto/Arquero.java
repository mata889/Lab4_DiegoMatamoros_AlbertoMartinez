package lab4_diego_alberto;

public class Arquero extends Piezas {

    int x, y;

    public Arquero() {
        super();
    }

    public Arquero(int x, int y) {
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
        return "A";
    }

    public String[][] Movimiento(int pos1, int pos2, int nuevapos1, int nuevapos2, String[][] Tablero) {
        try {
            if (!"c☻".equals(Tablero[pos1+1][pos2+1]) || !"a☻".equals(Tablero[pos1+1][pos2+1]) || !"f☻".equals(Tablero[pos1+1][pos2+1]) || !"r☻".equals(Tablero[pos1+1][pos2+1]) || !"m☻".equals(Tablero[pos1+1][pos2+1]) || !"d☻".equals(Tablero[pos1+1][pos2+1])||!"c☺".equals(Tablero[pos1+1][pos2+1]) || !"a☺".equals(Tablero[pos1+1][pos2+1]) || !"f☺".equals(Tablero[pos1+1][pos2+1]) || !"r☺".equals(Tablero[pos1+1][pos2+1]) || !"m☺".equals(Tablero[pos1+1][pos2+1]) || !"d☺".equals(Tablero[pos1+1][pos2+1])||!"c☻".equals(Tablero[pos1-1][pos2-1]) || !"a☻".equals(Tablero[pos1-1][pos2-1]) || !"f☻".equals(Tablero[pos1-1][pos2-1]) || !"r☻".equals(Tablero[pos1-1][pos2-1]) || !"m☻".equals(Tablero[pos1-1][pos2-1]) || !"d☻".equals(Tablero[pos1-1][pos2-1])||!"c☺".equals(Tablero[pos1-1][pos2-1]) || !"a☺".equals(Tablero[pos1-1][pos2-1]) || !"f☺".equals(Tablero[pos1-1][pos2-1]) || !"r☺".equals(Tablero[pos1-1][pos2-1]) || !"m☺".equals(Tablero[pos1-1][pos2-1]) || !"d☺".equals(Tablero[pos1-1][pos2-1])) {
                Tablero[nuevapos1][nuevapos2] = Tablero[pos1][pos2];
                Tablero[pos1][pos2] = " ";

                return Tablero;
            }
        } catch (Exception e) {
            return Tablero;
        }
        return Tablero;
    }

    @Override
    public String[][] Movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
