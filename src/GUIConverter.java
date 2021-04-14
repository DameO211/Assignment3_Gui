import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIConverter extends JFrame  {
    private JFrame frame;
    private JPanel panel;
    private Button dConvert;
    private Button tConvert;
    private Button exit;


/// Constructor to setup GUI components and event handlers?
    public GUIConverter() {
        frameclass();

        panel = new JPanel();
        frame.add(panel);

        dConvert = new Button("Distance Converter");
//        DistanceConverter dbutton = new DistanceConverter();
//        dbutton.convert(31);
        panel.add(dConvert);
        dConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Almost","Results",JOptionPane.PLAIN_MESSAGE);


            }
        });

        tConvert = new Button("Temperature Converter");
        panel.add(tConvert);
        tConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }});

        exit = new Button("Exit");
        panel.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });



    }

    private void frameclass() {
        {
            frame = new JFrame();
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setSize(300,300);
        }
    }

    public static void main(String[]args){
        GUIConverter gui = new GUIConverter();
    }
}


/*
* Implement GUIConverter class using JFrame and JPanel as follows:
a. GUI will have 3 buttons: “Distance Converter”, “Temperature Converter”, and
“Exit”.
*
* f. SUGGESTIONS:
 For the input dialog you can use JOptionPane.showInputDialog
 The ActionListener for each Converter button should create the appropriate
Converter child instance, set the input, and call its convert() method
 For the pop up with converted value you can use
JOptionPane.showMessageDialog

*
*
* */