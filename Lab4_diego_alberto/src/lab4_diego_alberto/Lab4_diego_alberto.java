package lab4_diego_alberto;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_diego_alberto {

    static Scanner sc = new Scanner(System.in);
    static usuario u = new usuario();
    static Caballero c = new Caballero();
    static Arquero a = new Arquero();
    static Duendes d = new Duendes();
    static Dragon f = new Dragon();
    static Rey r = new Rey();
    static Magos m = new Magos();
    static String[][] Temporal = Lectura();
    static char cambio = 's';

    public static void main(String[] args) {

        ArrayList<usuario> lista = new ArrayList();
        int menu = 0;
        Temporal = Lectura();
        do {
            System.out.println("\n 1.Añadir jugadores \n 2.Eliminar jugadores \n 3.Lista Jugadores \n 4.Jugar \n 0. salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    String jugador,
                     lugar,
                     username,
                     sexo = "";
                    int edad;
                    System.out.println("Introduzca nombre del jugador");
                    jugador = sc.next();

                    //String nombre, int edad, String lugar, String username, String sexo
                    System.out.println("Introduzca edad");
                    edad = sc.nextInt();

                    System.out.println("Introduzca Lugar de nacimiento");
                    lugar = sc.next();

                    System.out.println("Introduzca Username");
                    username = sc.next();

                    System.out.println("Introduzca su sexo");
                    sexo = sc.next();

                    lista.add(new usuario(jugador, edad, lugar, username, sexo));

                    break;
                case 2:
                    System.out.println("Eliminar");
                    System.out.println("Escoja cual quiere eliminar");
                    int eliminar;
                    for (usuario t : lista) {
                        String s = "";
                        if (t instanceof usuario) {
                            s += "" + (lista.indexOf(t)+1) + "-" + t + "\n";
                        }
                        System.out.print(s);
                    }
                    System.out.println("Escoga cual quiere eliminar");
                    eliminar = sc.nextInt()-1;
                    if (eliminar<0||eliminar>lista.size()){
                    System.out.println("numero incorrecto");
                    }else{
                        lista.remove(eliminar);
                        
                    }
                    break;
                case 3:
                    System.out.println("Listado");

                    for (usuario t : lista) {
                        String s = "";
                        if (t instanceof usuario) {
                            s += "" + (lista.indexOf(t)+1) + "-" + t + "\n";
                        }
                        System.out.print(s);
                    }
                    break;
                case 4:
                    
                    int player1, player2, cont=2, turnos;
                    String Jugador1, Jugador2;
                    Imprimir (Temporal);
                    for (usuario t : lista) {
                        String s = "";
                        if (t instanceof usuario) {
                            s += "" + (lista.indexOf(t)+1) + "-" + t + "\n";
                        }
                        System.out.print(s);
                    }
                    System.out.println("Escoja su nombre jugador 1");
                    player1 = sc.nextInt()-1;
                    Jugador1 = lista.get(player1).getNombre();
                    System.out.println("Escoja su nombre jugador 2");
                    player2 = sc.nextInt()-1;
                    Jugador2 = lista.get(player2).getNombre();
                    
                    System.out.println("Cuantos turnos?");
                    turnos=sc.nextInt();
                    while (cont<=turnos+1){
                    int resp;
                        if (cont%2==0) {
                            do{
                                resp=2;
                                Imprimir(Temporal);
                                System.out.println("");
                                System.out.println("Es el turno de " + Jugador1+"!");
                                System.out.println("Escoja la posicion x:");
                    int x = sc.nextInt();
                    System.out.println("y:");
                    int y = sc.nextInt();
                    System.out.println("Escoja la posicion a mover x:");
                    int x1 = sc.nextInt();
                    System.out.println("y:");
                    int y1 = sc.nextInt();

                    if ("c☺".equals(Temporal[x][y])  ) {
                        Temporal=c.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("a☺".equals(Temporal[x][y])  ) {
                        Temporal=a.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("f☺".equals(Temporal[x][y])  ) {
                        Temporal=f.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("r☺".equals(Temporal[x][y])  ) {
                        Temporal=r.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("m☺".equals(Temporal[x][y]) ) {
                        Temporal=m.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("d☺".equals(Temporal[x][y])  ) {
                        Temporal=d.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }if (!"d☺".equals(Temporal[x][y])&&!"a☺".equals(Temporal[x][y])&&!"m☺".equals(Temporal[x][y])&&!"a☺".equals(Temporal[x][y])&&!"r☺".equals(Temporal[x][y])&&!"f☺".equals(Temporal[x][y])){
                        System.out.println("Esa no es pieza tuya o esta fuera del tablero! vuelve a intentarlo.");
                    }
                            }while(resp==2);
                    
                            
                            
                            cont++;
                        }else{
                            do{
                            resp=2;
                            Imprimir(Temporal);
                            System.out.println("");
                            System.out.println("Es el turno de " + Jugador2+"!");
                                                System.out.println("Escoja la posicion x:");
                    int x = sc.nextInt();
                    System.out.println("y:");
                    int y = sc.nextInt();
                    System.out.println("Escoja la posicion a mover x:");
                    int x1 = sc.nextInt();
                    System.out.println("y:");
                    int y1 = sc.nextInt();
                    if ("c☻".equals(Temporal[x][y])  ) {
                        Temporal=c.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("a☻".equals(Temporal[x][y])  ) {
                        Temporal=a.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("f☻".equals(Temporal[x][y])  ) {
                        Temporal=f.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("r☻".equals(Temporal[x][y])  ) {
                        Temporal=r.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("m☻".equals(Temporal[x][y])  ) {
                        Temporal=m.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }
                    if ("d☻".equals(Temporal[x][y])  ) {
                        Temporal=d.Movimiento(x, y, x1, y1, Temporal);
                        resp=1;
                    }else{
                        System.out.println("Esa no es pieza tuya! vuelve a intentarlo.");
                    }
                            }while(resp==2);
                            
                            
                            cont++;
                        }
                    }
                    
                    break;

            }
        } while (menu != 0);

    }

    public static String[][] Lectura() {
        String[][] Temporal = new String[10][10];
        //parte de arriba
        Temporal[0][0] = "c☺";
        Temporal[0][2] = "f☺";
        Temporal[0][3] = "a☺";
        Temporal[0][4] = "r☺";
        Temporal[0][5] = "m☺";
        Temporal[0][6] = "a☺";
        Temporal[0][7] = "f☺";
        Temporal[0][9] = "c☺";
        Temporal[1][0] = "d☺";
        Temporal[1][2] = "a☺";
        Temporal[1][3] = "d☺";
        Temporal[1][4] = "c☺";
        Temporal[1][5] = "f☺";
        Temporal[1][6] = "d☺";
        Temporal[1][7] = "a☺";
        Temporal[1][9] = "d☺";

        //parte de abajo
        Temporal[9][0] = "c☻";
        Temporal[9][2] = "f☻";
        Temporal[9][3] = "a☻";
        Temporal[9][4] = "r☻";
        Temporal[9][5] = "m☻";
        Temporal[9][6] = "a☻";
        Temporal[9][7] = "f☻";
        Temporal[9][9] = "c☻";
        Temporal[8][0] = "d☻";
        Temporal[8][2] = "a☻";
        Temporal[8][3] = "d☻";
        Temporal[8][4] = "c☻";
        Temporal[8][5] = "f☻";
        Temporal[8][6] = "d☻";
        Temporal[8][7] = "a☻";
        Temporal[8][9] = "d☻";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (Temporal[i][j] == null) {
                    Temporal[i][j] = "  ";
                }
            }
        }

        return Temporal;

    }

    public static void Imprimir(String[][] Sueldos) {
        for (int i = 0; i < Sueldos.length; i++) {
            System.out.print(" |");
            for (int j = 0; j < Sueldos[i].length; j++) {
                System.out.print(Sueldos[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    public String[][] GetMatriz() {
        return Temporal;
    }
}
