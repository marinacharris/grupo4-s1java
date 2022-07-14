public class Excepciones {
    public static void main(String[] args) {
        try{
            Integer[] numeros = {45,25,78,69,20};
            System.out.println(numeros[10]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //Throw -- Throws
        int a = 25;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.err.println(e);
        }
        try{
            dividir();
        }
        catch(ArithmeticException e){
            System.err.println(e);
        }
        
    }
    public static void dividir() throws ArithmeticException{
            int a = 50;
            int b = 0;
            System.out.println(a/b);
    }
}
