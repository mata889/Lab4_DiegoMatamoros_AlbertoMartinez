
package lab4_diego_alberto;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab4_diego_alberto {
static Scanner sc=new Scanner (System.in);
   
    public static void main(String[] args) {
        String b="";
        String [][] Tablero=new String[10][10];
        ArrayList <usuario> lista=new ArrayList();
        
        String op="";
        while ( !op.equals("s") ) {  
            op=JOptionPane.showInputDialog(""
                    + "a-agregar\n"
                    + "b-eliminar\n"
                    + "c-listar\n"
                    + "s-salir\n");
            if(op==null){
                op="s";
            }
            if (op.equals("a")) {
                
                int edad;
                String nombre, lugar, usuario, sexo;
                nombre=JOptionPane.showInputDialog("nombre");
                edad=Integer.parseInt(
                  JOptionPane.showInputDialog("edad")
                );
                lugar=JOptionPane.showInputDialog("Lugar de nacimiento");
                usuario=JOptionPane.showInputDialog("Username");
                sexo=JOptionPane.showInputDialog("Sexo");
                lista.add(new usuario(nombre,edad,lugar,usuario,sexo));                
            }
            if (op.equals("b")) {
                               int pos;
                String s="";
                for (Object t : lista) {
                    if (t instanceof usuario) {
                       s+= ""+lista.indexOf(t)+"- "+t+"\n" ;
                    }
                }
                pos=Integer.parseInt(
                  JOptionPane.showInputDialog(s+"\n"+"Que posicion desea Eliminar?")
                );
                
               lista.remove(pos);
            }
            if (op.equals("c")) {
                String s="";
                for (Object t : lista) {
                    if (t instanceof usuario) {
                       s+= ""+lista.indexOf(t)+"- "+t+"\n" ;
                    }
                }
                JOptionPane.showMessageDialog(null, s);
           }
            
            if (op.equals("d")) {

            }
        
            Tablero=Lectura();
            Imprimir(Tablero);

        }
    }
    
    public static String[][]Lectura(){

        String [][]Temporal=new String[10][10];
        //parte de arriba
        Temporal[0][0]="c";
        Temporal[0][2]="f";
        Temporal[0][3]="a";
        Temporal[0][4]="r";
        Temporal[0][5]="m";
        Temporal[0][6]="a";
        Temporal[0][7]="f";
        Temporal[0][9]="c";
        Temporal[1][0]="d";
        Temporal[1][2]="a";
        Temporal[1][3]="d";
        Temporal[1][4]="c";
        Temporal[1][5]="f";
        Temporal[1][6]="d";
        Temporal[1][7]="a";
        Temporal[1][9]="d";
        
        //parte de abajo
        Temporal[9][0]="c1";
        Temporal[9][2]="f";
        Temporal[9][3]="a";
        Temporal[9][4]="r";
        Temporal[9][5]="m";
        Temporal[9][6]="a";
        Temporal[9][7]="f";
        Temporal[9][9]="c";
        Temporal[8][0]="d";
        Temporal[8][2]="a";
        Temporal[8][3]="d";
        Temporal[8][4]="c";
        Temporal[8][5]="f";
        Temporal[8][6]="d";
        Temporal[8][7]="a";
        Temporal[8][9]="d";
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++)
                if (Temporal[i][j]==null){
                    Temporal[i][j]=" ";
                }
        }
        
        return Temporal;
 
    }
    
        public static void Imprimir(String[][] Sueldos){
        for(int i=0;i<Sueldos.length;i++){
            System.out.print(" |");
            for(int j=0; j<Sueldos[i].length; j++){
                System.out.print(Sueldos[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
