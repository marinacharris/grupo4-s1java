package crudsql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class App 

{
    static String url = "jdbc:sqlite:C:\\Users\\robot\\Desktop\\hr.db";
    public static void main( String[] args )
    {
      consultaEmpleados();  
      System.out.println();
      consultaEmpleado(101);
    }
    public static void consultaEmpleados(){
        try{
            Connection conexion = DriverManager.getConnection(url);
            Double salariot = 5000.0;
            String sql="select * from employees where salary>"+salariot;
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString("last_name");
                Double salario = rs.getDouble("Salary");
                System.out.println(id+"\t"+nombre+"\t"+apellido+"\t"+salario);
            }
            rs.close();
            stm.close();
            conexion.close();
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    //preparedStatement
    public static void consultaEmpleado(int id_empleado) {
        try{
            String sql = "select * from employees where employee_id=?";
            Connection conexion = DriverManager.getConnection(url);
            PreparedStatement stm = conexion.prepareStatement(sql);
            stm.setInt(1, 101);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString("last_name");
                Double salario = rs.getDouble("Salary");
                System.out.println(id+"\t"+nombre+"\t"+apellido+"\t"+salario);
            }
            rs.close();
            stm.close();
            conexion.close();
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }        

    }   
}
