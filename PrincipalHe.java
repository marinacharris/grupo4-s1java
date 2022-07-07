public class PrincipalHe {
    public static void main(String[] args) {
        GatoHe animal1 = new GatoHe("Pepe","Angora",2);
        PerroHe animal2 = new PerroHe("Milo", "Labrador",4,"Grande");
        System.out.println(animal1.nombre);
        System.out.println(animal1.raza);
        System.out.println(animal1.edad);
        System.out.println(animal2.nombre);
        System.out.println(animal2.raza);
        System.out.println(animal2.edad);
        System.out.println(animal2.getTamano());
        animal1.dormir();
        animal1.sonidoAnimal();
        animal2.sonidoAnimal();

    }
}
