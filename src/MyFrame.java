import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;


    MyFrame(){

        panel = new MyPanel();





        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("A Bouncing Ball");
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);


        this.setResizable(false);
        this.setVisible(true);

    }
}
