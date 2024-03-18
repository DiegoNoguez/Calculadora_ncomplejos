package algebralineal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class VentanaConfi  extends JFrame{
    public JPanel panel1;
    public void Ventana(){
        this.setSize( 720, 630);
        this.setVisible(true);
        this.setTitle("Calculadora Algebra");
        componentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void componentes(){
        paneles();
        etiquetas();
        imagenes();
        buton();
    }
    private void paneles(){
        panel1=new JPanel();
        panel1.setBackground(Color.DARK_GRAY);
        this.getContentPane().add(panel1);
    }
    private void etiquetas(){
        panel1.setLayout(null);
        JLabel etiquetatitu = new JLabel("BIENVENIDO",SwingConstants.CENTER);
        //etiquetatitu.setText("BIENVENIDO");  coloca texto a la etiquta
        etiquetatitu.setBounds(250,1,220,30);
        etiquetatitu.setForeground(Color.WHITE);//establece color a la letra
        etiquetatitu.setFont(new Font("brodway",Font.BOLD,25));
        panel1.add(etiquetatitu);
        JLabel etoption = new JLabel();
        etoption.setText("Seleciona la opcion que vas a realizar");
        etoption.setForeground(Color.WHITE);
        etoption.setBounds(5,50,800,18);
        etoption.setFont(new Font("castellar",Font.LAYOUT_LEFT_TO_RIGHT,17));
        panel1.add(etoption);
    }
    private void imagenes(){
        ImageIcon imag1 = new ImageIcon("F1.png");
        JLabel im1 = new JLabel();
        im1.setBounds(20,80,500,500);
        im1.setIcon(new ImageIcon(imag1.getImage().getScaledInstance(350,350,Image.SCALE_SMOOTH)));
        panel1.add(im1);
        ImageIcon imag2 = new ImageIcon("Opcion2.jpg");
        JLabel ima2 = new JLabel();
        ima2.setBounds(370,280,400,400);
        ima2.setIcon(new ImageIcon(imag2.getImage().getScaledInstance(270,270,Image.SCALE_SMOOTH)));
        panel1.add(ima2);
        
    }
    private void buton(){
        JButton boton1 = new JButton();
        boton1.setText("OPERACIONES CON NUMEROS COMPLEJOS");
        //metetodo setEnabled desactiva o no el boton;
        //setMnemonic establece con el atl mas alguna letra clikea el boto
        boton1.setBounds(50,80,300,30);
        panel1.add(boton1);
        JButton boton2 = new JButton();
        
    }
}

