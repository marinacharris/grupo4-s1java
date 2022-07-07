public class GatoHe extends MascotaHe {
    public GatoHe(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;   
        this.edad = edad;
    }
    public void sonidoAnimal(){
        System.out.println("El gato hace miau");
    }
    
}
