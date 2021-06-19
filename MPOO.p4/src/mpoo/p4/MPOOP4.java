package mpoo.p4;

public class MPOOP4 {

    public static void main(String[] args) {
        System.out.println("/***PRIMER EJERCICIO***/");
        Punto punto = new Punto(); //Aqui lo que hara es imprimir este punto. Esto es un objeto
        punto.imprimirPunto();
        punto.x=5; //Le asigno valores a x
        punto.y=6; //Le asigno valores a y
        punto.imprimirPunto();
        
        Punto punto2 = new Punto(8,17); //Esto es un objeto
        punto2.imprimirPunto();
        
        //Segundo ejemplo
        System.out.println("\n/***SEGUNDO EJERCICIO***/");
        
        //Constructor vacio
        Coche miCoche = new Coche(); //El objeto de coche. La clase sirve para crear el objeto quien es quien hace todo
        System.out.println(miCoche.toString());
        miCoche.color ="rojo"; //Aqui asigno valores
        miCoche.modelo = "HRV";
        miCoche.marca = "Honda";
        miCoche.numPuertas = 4;
        System.out.println(miCoche.toString());
        
        //Constructor que si tiene datos
        Coche tuCoche = new Coche("Negro", "R8", "Audi", 4);
        System.out.println(tuCoche.toString());
        
        //Tercer Ejemplo. Clase perro
        System.out.println("\n/***TERCER EJERCICIO***/");
        
        //Clase perro. Use el constructor vacio
        Perro miPerro = new Perro(); //Objeto perro
        miPerro.color = "Sal y pimienta";
        miPerro.nombre = "Hershey";
        miPerro.raza = "Schnauzer";
        System.out.println(miPerro.toString());
        
        //Constructor con datos
        Perro perroVecino = new Perro("Bimba", "Griffon de Bruselas", "Rojizo");
        System.out.println(perroVecino.toString());
    }
    
}
