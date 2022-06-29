import java.util.Scanner;

public class Ejercicio1 {
    // Variables (atributos o propiedades)
    // métodos o funciones
    // main
    private String nombre; //variables
    private float nota;
    private Scanner sc;

    public void capturar(){
        sc = new Scanner(System.in);
        System.out.println("Digite su nombre:");
        nombre = sc.nextLine();
        System.out.println("Digite su nota:");
        nota = sc.nextFloat();
    }

    public void imprimir(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Nota: "+ nota); 
    }

    public void aprobar(){
        if (nota>=3){
            System.out.println("Aprobó");
        }else{
            System.out.println("No aprobó");
        }
    }

    public static void main(String[] args) {
        Ejercicio1 obj1 = new Ejercicio1(); // crea una instancia de la clase Ejercicio1
        obj1.capturar();
        obj1.imprimir();
        obj1.aprobar();
    }


}   
