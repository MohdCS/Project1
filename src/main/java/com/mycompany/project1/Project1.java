package com.mycompany.project1;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
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
        x1, y1 = starting point, while the point starts in top left corner.
        x2, y2 = ending point.
        while x is vertical and y is horizontal.
         */
        Line2D.Double line2D = new Line2D.Double(0, 0, 600, 300);
        graphic2D.setColor(Color.BLACK);
        graphic2D.draw(line2D);

        // Another Rectangle2D example.
        Rectangle2D secondRectangle2D = new Rectangle2D.Double(85, 85, 150, 75);
        graphic2D.setColor(Color.YELLOW);
        graphic2D.fill(secondRectangle2D);

        /* Useful notes:
        - Methods between shapes and lines may differ.
        Example: we use "fill" method for shapes such as Rectangle2D. Unlike lines such as Line2D, we use "draw" method.

        - Bottom Object appears on top of everything.
        Example: secondRectangle2D is below line2D and firstRectangle2D.
         */
    }
}