public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        long num = 25; //declarando la variable num
        System.out.println(num);
        String nombre = "Omar";
        System.out.println(nombre);
        var apellido = "Díaz";//cuando se declara una variable con var Java infiere el tipo de variable
        System.out.println(apellido.getClass().getSimpleName());
        System.out.println(((Object)num).getClass().getSimpleName());
        Integer conta = 10;
        System.out.println(conta.getClass().getSimpleName());
        

    }
}
