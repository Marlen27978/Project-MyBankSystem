package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SignUpWindow extends Container {
    JLabel fullname, login, phoneNum, question, answer, password, i;
    JTextField fullnameField, loginField, phoneNumField, answerField;
    JPasswordField passwordField;
    JComboBox questionBox;
    JButton createBtn, backBtn;
    public static int id = 1;
    private static ArrayList<User> users = new ArrayList<>();

    public SignUpWindow() {
        setSize(400,500);
        setLayout(null);
        Font font = new Font("TimesRoman",Font.BOLD,12);

        fullname = new JLabel("FULL NAME");
        fullname.setBounds(25,50,120,30);
        fullname.setFont(font);
        add(fullname);

        fullnameField = new JTextField();
        fullnameField.setBounds(200,50,150,30);
        add(fullnameField);

        login = new JLabel("LOGIN");
        login.setBounds(25,100,120,30);
        login.setFont(font);
        add(login);

        phoneNum = new JLabel("PHONE NUMBER");
        phoneNum.setBounds(25,200,155,30);
        phoneNum.setFont(font);
        add(phoneNum);

        password = new JLabel("PASSWORD");
        password.setBounds(25,150,155,30);
        password.setFont(font);
        add(password);

        loginField = new JTextField();
        loginField.setBounds(200,100,150,30);
        add(loginField);

        phoneNumField = new JTextField();
        phoneNumField.setBounds(200,150,150,30);
        add(phoneNumField);

        passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        passwordField.setBounds(200,200,150,30);
        add(passwordField);

        question = new JLabel("KEY QUESTION");
        question.setBounds(25,250,155,30);
        question.setFont(font);
        add(question);

        answer = new JLabel("QUESTION ANSWER");
        answer.setBounds(25,300,155,30);
        answer.setFont(font);
        add(answer);

        String[] keyWords = {"What is your dog's name?", "What is your nickname?", "Where would you want to go?"};

        questionBox = new JComboBox(keyWords);
        questionBox.setBounds(200,250,150,30);
        add(questionBox);

        answerField = new JTextField();
        answerField.setBounds(200,300,150,30);
        add(answerField);

        createBtn = new JButton("Create an Account");
        createBtn.setBounds(125,350,150,30);
        add(createBtn);

        createBtn.addActionListener(actionEvent -> {
            String name = fullnameField.getText();
            String log = loginField.getText();
            char[] pas = passwordField.getPassword();
            String phNum = phoneNumField.getText();
            int keyQ = (Integer) questionBox.getSelectedIndex();
            String keyWord = answerField.getText();
            users.add(new User(name,log,pas,phNum,keyWord,keyQ,id));
            id++;
            fullnameField.setText("");
            loginField.setText("");
            passwordField.setText("");
            phoneNumField.setText("");
            questionBox.setSelectedIndex(0);
            answerField.setText("");
        });

        backBtn = new JButton("<- Back");
        backBtn.setBounds(25,390,85,30);
        backBtn.setBackground(Color.lightGray);
        add(backBtn);

        backBtn.addActionListener(actionEvent -> {
            MainFrame.signUpWindow.setVisible(false);
            MainFrame.signInWindow.setVisible(true);
            Main.mf.setSize(300,400);
            Main.mf.setLocation(600,180);
        });

    }
}
