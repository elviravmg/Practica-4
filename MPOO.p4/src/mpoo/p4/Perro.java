package mpoo.p4;

public class Perro {
    //atributos
    String nombre;
    String raza;
    String color;
    
    //constructores
    public Perro() { //vacio
    }

    public Perro(String nombre, String raza, String color) { //con datos
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }
    
    
    //Acciones que hace el perro, estos son los métodos
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    public void dormir(){
        System.out.println("Estoy durmiento");
    }
    
    public void ladrar(){
        System.out.println("Estoy ladrando");
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + '}';
    }
    
}
