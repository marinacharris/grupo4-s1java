public class Asociacion{
    public static void main(String[] args) {
        Carro carro1 = new Carro("Nissan");
        Persona persona1 = new Persona("John");
        System.out.println("El carro " + carro1.getMarca() + " es manejado por "+ persona1.getNombre() + "");
    }
}