package com.mycompany.project1;

import javax.swing.JComponent;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Project1 extends JComponent {

    public static void main(String[] args) {
        Project1 project = new Project1();

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.add(project);
        frame.setTitle("Project #1");
        frame.setIconImage(new ImageIcon("src\\main\\java\\com\\mycompany\\project1\\icon").getImage());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
    }

    public void paintComponent(Graphics graphic){
        Graphics2D graphic2D = (Graphics2D) graphic;

        RenderingHints render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphic2D.setRenderingHints(render);

        /*
        Rectangle2D notes:
        x and y = location.
        w = width.
        h = height.
         */
        Rectangle2D firstRectangle2D = new Rectangle2D.Double(0, 0, 600, 300);
        graphic2D.setColor(new Color(100, 149, 237));
        graphic2D.fill(firstRectangle2D);

        /* Line2D notes:
        Points start in the top left corner.
        x = vertical, such that: x1 = start point, x2 = end point.
        y = horizontal, such that: y1 = start point, y2 = end point.
         */
        Line2D.Double firstLine2D = new Line2D.Double(50, 50, 300, 50);
        graphic2D.setColor(Color.BLACK);
        graphic2D.draw(firstLine2D);

        Line2D.Double secondLine2D = new Line2D.Double(300, 50, 300, 275);
        graphic2D.setColor(Color.RED);
        graphic2D.draw(secondLine2D);

        Line2D.Double thirdLine2D = new Line2D.Double(50, 275, 300, 275);
        graphic2D.setColor(Color.GREEN);
        graphic2D.draw(thirdLine2D);

        Line2D.Double fourthLine2D = new Line2D.Double(50, 50, 50, 275);
        graphic2D.setColor(Color.PINK);
        graphic2D.draw(fourthLine2D);

        Line2D.Double fifthLine2D = new Line2D.Double(50, 50, 600, 300);
        graphic2D.setColor(Color.BLACK);
        graphic2D.draw(fifthLine2D);

        // Another Rectangle2D example.
        Rectangle2D secondRectangle2D = new Rectangle2D.Double(90, 90, 150, 75);
        graphic2D.setColor(Color.YELLOW);
        graphic2D.fill(secondRectangle2D);

        /* Useful notes:
        - Methods between shapes and lines may differ.
        Example: we use "fill" method for shapes such as Rectangle2D. Unlike lines such as Line2D, we use "draw" method.

        - Last created object appears on top of every object (Stack style).
         */
    }
}