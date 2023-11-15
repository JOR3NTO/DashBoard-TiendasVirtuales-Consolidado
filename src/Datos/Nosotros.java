package Datos;

import GUI.GUIdash;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Nosotros extends JFrame {
    JButton jbVolver;
    GUIdash em;
    JLabel imagen, titulo;
    JEditorPane Cuadro;
    
    public Nosotros(GUIdash obj) {

        super("Nosotros");
        em = obj;
        setSize(1200, 700);
        getContentPane().setBackground(new Color(91,161,153));
        setLocationRelativeTo(null);
        setLayout(null);  // Diseño libre
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        JLabel jTitulo = new JLabel("NOSOTROS");
        jTitulo.setBounds(0, 20, 1200, 70);
        jTitulo.setOpaque(true);
        jTitulo.setBackground(new Color(91,161,153));
        // Letra
        jTitulo.setForeground(Color.WHITE);
        jTitulo.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 32));
        jTitulo.setHorizontalAlignment(JLabel.CENTER);
        add(jTitulo);
        
       /*Cuadro = new JEditorPane();
        JScrollPane jspCap1 = new JScrollPane(Cuadro);
        jspCap1.setBounds(230, 100, 900, 490);
        Cuadro.setBackground(new Color(102, 104, 171));
        add();*/
        

        crearGUI();

        setVisible(true);
    }

    private void crearGUI() {
        
        JLabel jl2 = new JLabel("Jorge Eduardo Cobo ");
        jl2.setBounds(355, 76, 200, 200);
        jl2.setHorizontalAlignment(SwingConstants.CENTER);
        jl2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
        jl2.setHorizontalAlignment(SwingConstants.CENTER);
        jl2.setForeground(Color.WHITE);
        add(jl2);
        
        JLabel jl2_1 = new JLabel("230222019");
        jl2_1.setBounds(355, 91, 200, 200);
        jl2_1.setHorizontalAlignment(SwingConstants.CENTER);
        jl2_1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
        jl2_1.setHorizontalAlignment(SwingConstants.CENTER);
        jl2_1.setForeground(Color.WHITE);
        add(jl2_1);
        
        JLabel jl3 = new JLabel("Katherin Andrea Palacio ");
        jl3.setBounds(600, 76, 250, 200);
        jl3.setHorizontalAlignment(SwingConstants.CENTER);
        jl3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
        jl3.setHorizontalAlignment(SwingConstants.CENTER);
        jl3.setForeground(Color.WHITE);
        add(jl3);
        
        JLabel jl3_1 = new JLabel("230222022");
        jl3_1.setBounds(600, 91, 250, 200);
        jl3_1.setHorizontalAlignment(SwingConstants.CENTER);
        jl3_1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
        jl3_1.setHorizontalAlignment(SwingConstants.CENTER);
        jl3_1.setForeground(Color.WHITE);
        add(jl3_1);


        JLabel jl1 = new JLabel("Mario Ochoa Arango");
        jl1.setBounds(865, 76, 250, 200);
        jl1.setHorizontalAlignment(SwingConstants.CENTER);
        jl1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
        jl1.setHorizontalAlignment(SwingConstants.CENTER);
        jl1.setForeground(Color.WHITE);
        add(jl1);
        
         JLabel jl1_1 = new JLabel("230222016");
        jl1_1.setBounds(870, 91, 250, 200);
        jl1_1.setHorizontalAlignment(SwingConstants.CENTER);
        jl1_1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
        jl1_1.setHorizontalAlignment(SwingConstants.CENTER);
        jl1_1.setForeground(Color.WHITE);
        add(jl1_1);

        
    
        jbVolver = new JButton("VOLVER AL MENU");
        jbVolver.setBounds(900, 590, 220, 40);
        jbVolver.setBackground(new Color(102, 104 ,171));
        jbVolver.setForeground(Color.WHITE);
        jbVolver.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,18));
        jbVolver.setToolTipText("Volver al menú");
        jbVolver.setFocusable(false);
        jbVolver.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
        jbVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_jbVolver();
            }
        });
        
        add(jbVolver);
        
      
    }
    public void paint(Graphics g) {

        super.paint(g);
        Image img = new ImageIcon(getClass().getResource("../Imagenes/mario.jpg")).getImage();
        g.drawImage(img, 900, 240, 200, 230, this);
        
        Image img2 = new ImageIcon(getClass().getResource("../Imagenes/Sin título-1.jpg")).getImage();
        g.drawImage(img2, 630, 240, 200, 230, this);
        
        Image img1 = new ImageIcon(getClass().getResource("../Imagenes/jorge.jpg")).getImage();
        g.drawImage(img1, 360, 240, 200, 230, this);

        
   

    }

    public void evento_jbVolver(){
        setVisible(false); 
        dispose(); //Destrulle Ventana 1

    }
}
