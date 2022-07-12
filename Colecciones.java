import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Colecciones {
    public static void main(String[] args) {
        // ArrayList
        // Es que tiene longitud variable
        // Es una clase del paquete java.util
        // es unac coleccion compuesta por un solo tipo de objetos
        ArrayList<String> ciudades = new ArrayList<String>();
        ciudades.add("Cali"); //add, sirve para añadir un elemento al final de la lista
        ciudades.add("Tunja");
        ciudades.add("Barranquilla");
        ciudades.add("Pereira");
        System.out.println(ciudades);
        ciudades.add(2, "Medellín");
        System.out.println(ciudades);
        ciudades.set(0,"Bucaramanga");
        System.out.println(ciudades);
        ArrayList<Integer> numAleatorios = new ArrayList<Integer>();
        for (int i = 0; i < 21; i++) {
            Integer numAleatorio = (int)(Math.random()*100);
            numAleatorios.add(numAleatorio);
        }
        System.out.println(numAleatorios);
        //for
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(ciudades.get(i)); //obtiene el valor de la posición i
        }
        System.out.println("---------------");
        ciudades.remove(1);
        //for each
        for(String i: ciudades){
            System.out.println(i);
        }
        System.out.println(ciudades.contains("Barranquilla"));
        Collections.sort(ciudades);
        for(String i: ciudades){
            System.err.println(i);
        }

        //LinkedList
        LinkedList<String> nombres = new LinkedList<String>();
        nombres.add("Tania");
        nombres.add("Camilo");
        nombres.add("Sofía");
        System.out.println(nombres);
        // addFirst, addLast, removeFirst, removeLast, getFirst, getLast, estos métodos de las linkedList

        //ArrayList de objetos de la clase CarroCol

        ArrayList<CarroCol> carros = new ArrayList<CarroCol>();
        carros.add(new CarroCol("Mazda"));
        carros.add(new CarroCol("Nissan")); 
        carros.add(new CarroCol("Audi"));
        carros.add(new CarroCol("Fiat"));

        System.out.println(carros.get(0).getMarca());

        for (CarroCol i: carros){
            System.out.println(i.getMarca());
        }
        System.out.println("--------------------");
        for (int i=0; i<carros.size(); i++){
            System.out.println(carros.get(i).getMarca());
        }

        //HashSet
        //Es una colección que no permite valores duplicados
        HashSet<Integer> numeros = new HashSet<Integer>(); 
        numeros.add(67);
        numeros.add(78);
        numeros.add(25);
        numeros.add(33);
        numeros.add(67);
        System.out.println(numeros.size());
        System.out.println(numeros);

        for (int i: numeros){
            System.out.println(i);
        }



        








    }
}
