public class PerroHe extends MascotaHe {
    private String tamano;
    public PerroHe(String nombre, String raza, int edad, String tamano){
        this.nombre = nombre;   
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }
    public String getTamano(){
        return tamano;
    }
    public void sonidoAnimal(){
        System.out.println("El perro hace guau");
    }
}
