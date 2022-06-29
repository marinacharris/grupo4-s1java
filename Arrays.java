public class Arrays {
    public static void main(String[] args) {
        //declarar un array unidimensional
        String[] nombres = {"Juan","Ana","Pedro","Sofía"};
        System.out.println(nombres[3]);
        System.out.println("--------------------");
        for(int i = 0; i < nombres.length; i++){ //recorremos con los índices
            System.out.println(nombres[i]);
        }
        // for each
        for(String nom:nombres){ //
            System.out.println(nom);
        }

        int[][] numeros = {{45,22,89},{12,36,78}}; // array bidimensional
        // 45   22  89
        // 12   36  78
        System.out.println(numeros[1][1]); // imprimimos el 36 en la posicion [1,1]
        System.out.println("--------------------------");
        // recorrido de un array bidimensional
        for (int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]); 
            }
        }
        System.out.println("-----------------------");
        for (int[] i: numeros){
            for (int j: i){
            System.out.println(j);
            }
        }



        
    }
}
