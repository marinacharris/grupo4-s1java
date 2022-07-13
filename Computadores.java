package com.example;

public class Computadores {
    //Atributos:
    protected final static char CONSUMO_W = 'F';
    protected final static Double PRECIO_BASE = 100.0;
    protected final static Integer PESO_BASE = 5;

    protected Double precioBase;
    protected Integer peso;
    protected char consumoW;

    //Constructor 

    public Computadores() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.consumoW = Computadores.CONSUMO_W;
        //this(PRECIO_BASE, PESO_BASE, CONSUMO_W);  esto llama al constructor de la misma clase

    }
    public Computadores(Double precioBase, Integer peso) {
        //this.precioBase = precioBase;
        //this.peso = peso;
        //this.consumoW = CONSUMO_W;
        this(precioBase, peso, CONSUMO_W);
    }
    public Computadores(Double precioBase, Integer peso, char consumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }
    // Metodos
    public Double calcularPrecio() {
        Double adicion = 0.0;
        switch(consumoW){
            case 'A':
                adicion +=100.0;
                break;
            case 'B':
                adicion +=80.0;
                break;  
            case 'C':
                adicion +=60.0;
                break;
            case 'D':
                adicion +=50.0;
                break;
            case 'E':
                adicion +=30.0;
                break;
            case 'F':
                adicion +=10.0;
                break;
        }
        if (peso >= 0 && peso <19) {
            adicion +=10.0;
        }else if(peso >= 20 && peso < 49){
            adicion +=50.0;
        }else if(peso >= 50 && peso <=79){
            adicion +=80;
        }else if(peso >=80){
            adicion +=100.0;
        }
        return precioBase + adicion;
    }
}
