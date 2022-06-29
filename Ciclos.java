public class Ciclos {
    public static void main(String[] args) {
        int conta = 1;
        while (conta<=5){
            System.out.println(conta);
            conta++;
        }
        System.out.println("------------------------");
        conta = 1;
        do{ // evalúa la condición al final del ciclo y esto asegura que se ejecuta por lo menos una vez
            System.out.println(conta);
            conta++;
        }while(conta<=5);
        System.out.println("------------------------");
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
    }
}
