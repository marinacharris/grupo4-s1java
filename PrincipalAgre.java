public class PrincipalAgre {
    public static void main(String[] args) {
        EstudianteAgre est1 = new EstudianteAgre("Luis",123456,"MAT");
        EstudianteAgre est2 = new EstudianteAgre("Carolina",456789,"SOC");
        EstudianteAgre est3 = new EstudianteAgre("Carlos",987654, "MAT");
        EstudianteAgre est4 = new EstudianteAgre("Sofía",654321, "SOC");
        String[] estudiantesMat = {est1.nombre,est3.nombre};
        String[] estudiantesSoc = {est2.nombre,est4.nombre};
        DepartamentoAgre dpMat = new DepartamentoAgre("MAT",estudiantesMat);
        DepartamentoAgre dpSoc = new DepartamentoAgre("SOC",estudiantesSoc);
        String[] tempo = dpMat.getEstudiantes();
        for(String i: tempo){
            System.out.println(i);
        }
        tempo = dpSoc.getEstudiantes();
        for(String i: tempo){
            System.out.println(i);
        }

    }
}
