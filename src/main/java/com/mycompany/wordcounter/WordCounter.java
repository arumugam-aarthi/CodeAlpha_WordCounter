package com.mycompany.wordcounter;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JTextArea textArea = new JTextArea();
        JButton countButton = new JButton("Count Words");
        JLabel resultLabel = new JLabel("Word Count: 0");
        countButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String text = textArea.getText().trim();
                int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
                resultLabel.setText("Word Count: " + wordCount);
            }
        });
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JScrollPane(textArea));
        frame.add(countButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
