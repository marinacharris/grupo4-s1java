import java.util.Scanner;
public class Entrada2 {
    public static void main(String[] args){
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digita ciudad, edad, estatura");
        String ciudad = entrada2.nextLine();
        int edad2 = entrada2.nextInt();
        double estatura = entrada2.nextDouble();
        entrada2.close();
        System.out.println("Edad: "+ edad2 + ", estatura: "+ estatura +", ciudad: "+ciudad);
    }
}
