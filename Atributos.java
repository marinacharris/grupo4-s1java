public class Atributos {
    int x = 10; 
    final int PORCENTAJE = 3; //atributo constante
    public static void main(String[] args) {
        Atributos obj1 = new Atributos();
        System.out.println(obj1.x);
        obj1.x = 40;
        System.out.println(obj1.x);
        System.out.println(obj1.PORCENTAJE);
        // obj1.porcentaje = 4; NO se puede, porque es contante
    }

}
