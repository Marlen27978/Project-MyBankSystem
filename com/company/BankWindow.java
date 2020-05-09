package com.company;

import javax.swing.*;
import java.awt.*;

public class BankWindow extends Container {
    JLabel cardId, perevod, urcrdid, money, sum;
    JTextField moneyField, perevodField, sumField;
    JTextArea cardIdArea;
    JButton button, button2, logoutBtn;

    public BankWindow() {
        setSize(400,500);
        setLayout(null);

        sum = new JLabel("Total sum");
        sum.setBounds(25,250,125,30);
        sum.setFont(new Font("TimesRoman",Font.BOLD,10));
        add(sum);

        sumField = new JTextField();
        sumField.setBounds(100,250,150,30);
        add(sumField);

        button2 = new JButton("Translate");
        button2.setBounds(120,300,100,40);
        add(button2);

        button2.addActionListener(actionEvent -> {
            perevodField.setText("");
            sumField.setText("");
        });

        perevodField = new JTextField();
        perevodField.setBounds(150,200,150,30);
        add(perevodField);

        perevod = new JLabel("Translate to another ID");
        perevod.setBounds(25,200,125,30);
        perevod.setFont(new Font("TimesRoman",Font.BOLD,10));
        add(perevod);

        moneyField = new JTextField("50 000");
        moneyField.setBounds(150,80,100,30);
        moneyField.setEnabled(false);
        add(moneyField);

        money = new JLabel("Your default money:");
        money.setBounds(25,80,100,30);
        money.setFont(new Font("TimesRoman",Font.BOLD,10));
        add(money);

        urcrdid = new JLabel(String.valueOf(SignUpWindow.id));
        urcrdid.setBounds(180,40,120,30);
        add(urcrdid);

        cardId = new JLabel("Your Card ID:");
        cardId.setFont(new Font("TimesRoman",Font.BOLD,10));
        cardId.setBounds(25,40,100,30);
        add(cardId);

        cardIdArea = new JTextArea();
        cardIdArea.setBounds(150,40,150,30);
        cardIdArea.setEditable(false);
        add(cardIdArea);

        logoutBtn = new JButton("Log Out");
        logoutBtn.setBounds(280,400,80,30);
        logoutBtn.setFont(new Font("TimesRoman",Font.BOLD,10));
        add(logoutBtn);

        logoutBtn.addActionListener(actionEvent -> {
            MainFrame.bankWindow.setVisible(false);
            MainFrame.signInWindow.setVisible(true);
            Main.mf.setSize(300,400);
            Main.mf.setLocation(600,180);
        });

        button = new JButton("Change password");
        button.setBounds(30,400,135,30);
        button.setFont(new Font("TimesRoman",Font.BOLD,10));
        add(button);

        button.addActionListener(actionEvent -> {
            MainFrame.bankWindow.setVisible(false);
            MainFrame.changePasswordWindow.setVisible(true);
            Main.mf.setSize(300,250);
            Main.mf.setLocation(550,160);
        });
    }
}
