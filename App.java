package crudsql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App 

{
    static String url = "jdbc:sqlite:C:\\Users\\robot\\Desktop\\hr.db";
    public static void main( String[] args )
    {
      consultaEmpleados();  
    }
    public static void consultaEmpleados(){
        try{
            Connection conexion = DriverManager.getConnection(url);
            String sql="select * from employees where salary>10000";
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString("last_name");
                Double salario = rs.getDouble("Salary");
                System.out.println(id+'\t'+nombre+'\t'+apellido+'\t'+salario);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
