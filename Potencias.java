public class Potencias {
    public static void main(String[] args) {
        double pMonto = 10000;
        double pInteres = 2;
        int pTiempo = 48;
        double interesSimple;
        interesSimple = pMonto * (pInteres/100) * pTiempo;
        System.out.println(interesSimple);
        double interesCompuesto;
        interesCompuesto = Math.round(pMonto * (Math.pow(1+pInteres/100,pTiempo)-1));
        System.out.println(interesCompuesto);



        
    }
}
