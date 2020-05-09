package com.company;

import javax.swing.*;
import java.awt.*;

public class ForgotWindow extends Container {
    JLabel login, phoneNum, question, answer, password, i;
    JTextField loginField, phoneNumField, answerField;
    JPasswordField passwordField;
    JComboBox questionBox;
    JButton sendBtn, changeBtn, backBtn;

    public ForgotWindow() {
        setSize(400,500);
        setLayout(null);

        Font font = new Font("TimesRoman",Font.BOLD,12);

        login = new JLabel("What is your login");
        login.setBounds(25,50,120,30);
        login.setFont(font);
        add(login);

        phoneNum = new JLabel("What is your phone number");
        phoneNum.setBounds(25,100,155,30);
        phoneNum.setFont(font);
        add(phoneNum);

        loginField = new JTextField();
        loginField.setBounds(200,50,150,30);
        add(loginField);

        phoneNumField = new JTextField();
        phoneNumField.setBounds(200,100,150,30);
        add(phoneNumField);

        question = new JLabel("Select a question");
        question.setBounds(25,150,155,30);
        question.setFont(font);
        add(question);

        answer = new JLabel("Write your answer");
        answer.setBounds(25,200,155,30);
        answer.setFont(font);
        add(answer);

        String[] keyWords = {"What is your dog's name?", "What is your nickname?", "Where would you want to go?"};

        questionBox = new JComboBox(keyWords);
        questionBox.setBounds(200,150,150,30);
        add(questionBox);

        answerField = new JTextField();
        answerField.setBounds(200,200,150,30);
        add(answerField);

        i = new JLabel("-----------------------------------------------------------------------------");
        i.setBounds(40,310,350,10);
        add(i);
        i.setVisible(false);

        password = new JLabel("NEW    Password");
        password.setBounds(25,340,155,30);
        password.setFont(font);
        add(password);
        password.setVisible(false);

        passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        passwordField.setBounds(200,340,150,30);
        add(passwordField);
        passwordField.setVisible(false);

        changeBtn = new JButton("Change");
        changeBtn.setBounds(232,390,85,30);
        add(changeBtn);
        changeBtn.setVisible(false);

        sendBtn = new JButton("Send");
        sendBtn.setBounds(232,250,85,30);
        add(sendBtn);

        sendBtn.addActionListener(actionEvent -> {
            String s = loginField.getText();
            loginField.setText("");
            passwordField.setText("");
            answerField.setText("");
            questionBox.setSelectedIndex(0);
            if(s.equals("123")) {
                JOptionPane.showMessageDialog(null, "Inserted data is correct, so you can change your password");
                i.setVisible(true);
                password.setVisible(true);
                passwordField.setVisible(true);
                changeBtn.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Incorrect data");
            }
        });

        changeBtn.addActionListener(actionEvent -> {
            i.setVisible(false);
            password.setVisible(false);
            passwordField.setVisible(false);
            changeBtn.setVisible(false);
            MainFrame.forgotWindow.setVisible(false);
            MainFrame.signInWindow.setVisible(true);
            Main.mf.setSize(300,400);
            Main.mf.setLocation(600,180);
        });

        backBtn = new JButton("<- Back");
        backBtn.setBounds(25,390,85,30);
        backBtn.setBackground(Color.lightGray);
        add(backBtn);

        backBtn.addActionListener(actionEvent -> {
            MainFrame.forgotWindow.setVisible(false);
            MainFrame.signInWindow.setVisible(true);
            Main.mf.setSize(300,400);
            Main.mf.setLocation(600,180);
        });

    }
}
