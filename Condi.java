public class Condi {
    public static void main(String[] args){
        int temperatura = 37;
        if (temperatura >37){
            System.out.println("Temperatura alta");
        }else if (temperatura >= 36 && temperatura <= 37){ //&&: and, ||: or, !: not
            System.out.println("Temperatura Ok");
        }else{
            System.out.println("Temperatura baja");
        }

        //forma corta del if
        String mensaje = (temperatura>37)? "Temp alta" : "Temp ok";
        System.out.println(mensaje);


    }
    
}
