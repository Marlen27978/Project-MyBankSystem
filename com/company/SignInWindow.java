package com.company;

import javax.swing.*;
import java.awt.*;

public class SignInWindow extends Container {
    private JPasswordField passwordField;
    private JTextField loginField;
    private JLabel loginLabel, passwordLabel;
    private JButton exitBtn, forgotBtn, createBtn, signIn;

    public SignInWindow() {
        setSize(300,400);
        setLayout(null);

        loginLabel = new JLabel("Login");
        loginLabel.setBounds(20,40,60,20);
        loginLabel.setForeground(Color.blue);
        add(loginLabel);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20,80,60,20);
        passwordLabel.setForeground(Color.blue);
        add(passwordLabel);

        loginField = new JTextField();
        loginField.setBounds(100,35,120,30);
        add(loginField);

        passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        passwordField.setBounds(100,75,120,30);
        add(passwordField);

        Font font = new Font("TimesRoman",Font.BOLD,10);

        signIn = new JButton("Sign In");
        signIn.setBounds(125,125,70,30);
        signIn.setFont(font);
        add(signIn);

        signIn.addActionListener(actionEvent -> {
            MainFrame.bankWindow.setVisible(true);
            MainFrame.signInWindow.setVisible(false);
            Main.mf.setSize(400,500);
            Main.mf.setLocation(550,160);
        });

        forgotBtn = new JButton("Forgot Password?");
        forgotBtn.setBounds(100,180,120,30);
        forgotBtn.setBackground(Color.white);
        forgotBtn.setForeground(Color.magenta);
        forgotBtn.setFont(font);
        add(forgotBtn);

        forgotBtn.addActionListener(actionEvent -> {
            MainFrame.forgotWindow.setVisible(true);
            MainFrame.signInWindow.setVisible(false);
            Main.mf.setSize(400,500);
            Main.mf.setLocation(550,160);
        });

        createBtn = new JButton("Create new one");
        createBtn.setBounds(100,215,120,30);
        createBtn.setBackground(Color.white);
        createBtn.setForeground(Color.magenta);
        createBtn.setFont(font);
        add(createBtn);
        createBtn.addActionListener(actionEvent -> {
            MainFrame.signUpWindow.setVisible(true);
            MainFrame.signInWindow.setVisible(false);
            Main.mf.setSize(400,500);
            Main.mf.setLocation(550,160);
        });

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(120,310,60,30);
        exitBtn.setBackground(Color.lightGray);
        add(exitBtn);

        exitBtn.addActionListener(actionEvent -> {
            System.exit(0);
        });
    }
}
