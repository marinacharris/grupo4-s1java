import java.util.Scanner;
public class Entrada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Digite su edad");
        int edad = entrada.nextInt();
        entrada.close();
        System.out.println("Te llamas "+ nombre +" y tu edad es "+ edad);
        
      

    }
    
}
