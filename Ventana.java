import javax.swing.JFrame;
import javax.swing.JLabel;
public class Ventana extends JFrame {
    private JLabel label1;
    public Ventana(){
        setLayout(null);//no utilizo layout y las posiciones son absolutas
        label1 = new JLabel("Hola Mundo");
        label1.setBounds(30,30,80,30);
        add(label1);        
    }
    public static void main(String[] args) throws Exception {
        Ventana ventana1 = new Ventana();
        ventana1.setBounds(20,80,400,300);
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setTitle("Ventana1");


    }
}
