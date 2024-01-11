package first;
import javax.swing.*;
import java.awt.*;

public class Rules extends JFrame{
	
	String name;
	
    Rules(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rules();
    }
}

