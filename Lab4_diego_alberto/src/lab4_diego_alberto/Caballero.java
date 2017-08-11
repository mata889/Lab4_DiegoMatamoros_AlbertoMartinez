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


    public String toString() {
        return "C";
    }
    
    

<<<<<<< HEAD

=======
>>>>>>> f35574eaf071d24c3e5e42961a894ae639e74447
    public String[][] Movimiento(int pos1,int pos2,int nuevapos1,int nuevapos2,String[][] Tablero) {
        Tablero[nuevapos1][nuevapos2]=Tablero[pos1][pos2];
        Tablero[pos1][pos2]=" ";
                 
        return Tablero;
 }

    @Override
    public String[][] Movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
