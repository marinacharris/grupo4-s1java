public class Constructor2 {
    String nombre;
    int nota;
    public Constructor2(String nombre, int not){
        this.nombre = nombre;
        nota = not;
    }
    public static void main(String[] args) {
        Constructor2 c = new Constructor2("Ana", 4);
        System.out.println(c.nombre);
        System.out.println(c.nota);
    }
}
