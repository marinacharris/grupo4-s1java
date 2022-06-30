import java.util.Scanner;

public class Calcular {
    public void capturaDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor 1");
        float valor1 = sc.nextFloat();
        System.out.println("Digite el valor 2");
        float valor2 = sc.nextFloat();
        sc.close();
        System.out.println(suma(valor1, valor2));
        System.out.println(resta(valor1, valor2));
        System.out.println(multi(valor1, valor2));
        System.out.println(divi(valor1,valor2));
    }
    public float suma(float v1, float v2){
        return v1+v2;
    }
    public float resta(float v1, float v2){
        return v1-v2;
    }
    public float multi(float v1, float v2){
        return v1*v2;
    }
    public float divi(float v1, float v2){
        return v1/v2;
    }
    public static void main(String[] args) {
        Calcular obj1 = new Calcular();
        obj1.capturaDatos();
        System.out.println(obj1.suma(20, 15)); 
    }
}
