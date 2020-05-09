package com.company;

import javax.swing.*;

public class MainFrame extends JFrame {

    public static SignInWindow signInWindow;
    public static SignUpWindow signUpWindow;
    public static ForgotWindow forgotWindow;
    public static ChangePasswordWindow changePasswordWindow;
    public static BankWindow bankWindow;

    public MainFrame(){
        setSize(300,400);
        setTitle("App");
        setLocation(600,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        signInWindow = new SignInWindow();
        signInWindow.setLocation(0,0);
        signInWindow.setVisible(true);
        add(signInWindow);

        signUpWindow = new SignUpWindow();
        signUpWindow.setLocation(0,0);
        signUpWindow.setVisible(false);
        add(signUpWindow);

        forgotWindow = new ForgotWindow();
        forgotWindow.setLocation(0,0);
        forgotWindow.setVisible(false);
        add(forgotWindow);

        changePasswordWindow = new ChangePasswordWindow();
        changePasswordWindow.setLocation(0,0);
        changePasswordWindow.setVisible(false);
        add(changePasswordWindow);

        bankWindow = new BankWindow();
        bankWindow.setLocation(0,0);
        bankWindow.setVisible(false);
        add(bankWindow);

    }
}
