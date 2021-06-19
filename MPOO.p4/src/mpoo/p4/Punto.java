package mpoo.p4;

//Creacion de una clase
public class Punto {
    int x, y;

    public Punto() { //Constructor
    }

    public Punto(int x, int y) { //Constructor para darle muchos valores a las variables
        this.x = x;
        this.y = y;
    }
    
    public void imprimirPunto(){
        System.out.println("X="+x+" Y="+y);
    }
}
