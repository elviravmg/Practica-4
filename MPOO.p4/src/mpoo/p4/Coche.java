package mpoo.p4;

public class Coche {
    String color;
    String modelo;
    String marca;
    int numPuertas;

    public Coche() { //Constructor
    }

    public Coche(String color, String modelo, String marca, int numPuertas){ //Constructor con datos
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.numPuertas = numPuertas;
    }
    
    //Estas son las acciones que hace el coche, es decir los metodos
    public void encender(){
        System.out.println("Estoy encendiendo");
    }

    public void apagar(){
        System.out.println("Estoy apagando");
    }

    public void avanzar(){
        System.out.println("Estoy avanzando");
    }
    
    public void frenar(){
        System.out.println("Estoy frenando, cuidado!");
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", modelo=" + modelo + ", marca=" + marca + ", numPuertas=" + numPuertas + '}';
    }
    
    
}
