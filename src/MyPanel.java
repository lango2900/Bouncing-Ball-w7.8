import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;


public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    JLabel speed;
    JLabel position;

    Image Ball;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 2;
    int x = 0;
    int y = 0;
    int xPos = getX();
    int yPos = getY();


    MyPanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setLayout(null);
        this.setBackground(Color.black);
        Ball = new ImageIcon("ball3.png").getImage();
        timer = new Timer(10,this);


        speed = new JLabel("Speed of Ball: ");
        speed.setBounds(10,10,250,25);
        speed.setForeground(Color.white);



        position = new JLabel("Position of Ball: ");
        position.setBounds(10,25,250,25);
        position.setForeground(Color.white);


        timer.start();
        this.add(speed);
        this.add(position);



    }


    public void paint(Graphics g){

        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(Ball,x,y,null);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if (x>=PANEL_WIDTH-Ball.getWidth(null) || x<0) {
            xVelocity = xVelocity * -1;
        }
        if (y>=PANEL_HEIGHT-Ball.getHeight(null) || y<0) {
            yVelocity = yVelocity * -1;
        }

        y = y + yVelocity;
        x = x + xVelocity;
        repaint();


    }
}
