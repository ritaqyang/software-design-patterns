package ca.mcgill.cs.swdesign.GUI.simple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    public GUI() {
        //make frame / window JFrame (from swing library)
        JFrame frame = new JFrame();


        JButton button = new JButton("Click me ");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: " + count);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));

        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Rita's GUI");
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Num of clicks " + count);
    }
}
