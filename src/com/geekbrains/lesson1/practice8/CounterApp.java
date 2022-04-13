package com.geekbrains.lesson1.practice8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {

    private int counter = 0;

    public CounterApp() {
        setTitle("CounterApp window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 200);

        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);
        add(counterView, BorderLayout.CENTER);

        JButton incrementButton = new JButton(">");
        add(incrementButton, BorderLayout.LINE_END);
        JButton decrementButton = new JButton("<");
        add(decrementButton, BorderLayout.LINE_START);
        JButton resetButton = new JButton("Сбросить");
        add(resetButton, BorderLayout.NORTH);

        JButton tenPlusButton = new JButton("+10");
        JButton tenMinusButton = new JButton("-10");
        JPanel twoButton = new JPanel();
        twoButton.add(tenMinusButton);
        twoButton.add(tenPlusButton);
        add(twoButton, BorderLayout.SOUTH);


        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == incrementButton) {
                    counter++;
                } else if (e.getSource() == decrementButton) {
                    counter--;
                } else if (e.getSource() == tenPlusButton) {
                    counter += 10;
                } else if (e.getSource() == tenMinusButton) {
                    counter -= 10;
                } else if (e.getSource() == resetButton) {
                    counter = 0;
                }
                refreshCounterView(counterView);
            }
        };

        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        tenPlusButton.addActionListener(actionListener);
        tenMinusButton.addActionListener(actionListener);
        resetButton.addActionListener(actionListener);

        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}