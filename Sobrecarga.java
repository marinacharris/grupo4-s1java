public class Sobrecarga {
    // En java varios métodos pueden tener el mismo nombre con diferentes parámetros
    // static significa que puedo acceder al metodo sin necesidad de instancia (crear un objeto para)

    static int suma(int a, int b) {
        return a + b;
    } 
    static float suma(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
       int s1 = suma(7,8);
       System.out.println(s1);
       float s2 = suma(45.8F,3.2F);
       System.out.println(s2);
    }
    
}
