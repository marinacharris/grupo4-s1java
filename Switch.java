import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner entObj = new Scanner(System.in);    
        System.out.println("Digite el mes");
        int mes = entObj.nextInt();
        entObj.close();
        switch(mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");    
                break;
            default:
                System.out.println("mes no válido");
        
        }
    }
}
