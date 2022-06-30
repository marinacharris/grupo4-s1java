import java.util.Scanner;

public class Tablas {
    public void capturaDatos(){
        Scanner sc  =  new Scanner(System.in);
        int tabla;
        do{
            System.out.println("Digite la tabla que desea o presione \"-1\" para salir");
            tabla = sc.nextInt();
            if (tabla != -1){
                mostrarTabla(tabla);
            }
        }while(tabla != -1);
        sc.close();
    }
    public void mostrarTabla(int num){
        for (int i = 1; i < 11; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
    public static void main(String[] args) {
        Tablas obj1 = new Tablas();
        obj1.capturaDatos();
    }

}
