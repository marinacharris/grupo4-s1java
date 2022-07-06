public class Constructor {
    String nombre;
    int edad;
    public Constructor(){ //el nombre del constructor debe coincidir con el nombre de la clase, no tiene retorno
        nombre = "María";
        edad = 25;
    }
    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(c.nombre);
        System.out.println(c.edad);
    }
}
