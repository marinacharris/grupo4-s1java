public class CarroCol {
    private String marca;
    private double precio;

    public CarroCol(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }
    public CarroCol(String marca){
        this.marca = marca;
    }
    //getters
    public String getMarca(){
        return marca;
    }
    public double getPrecio(){
        return precio;
    }
    
}
