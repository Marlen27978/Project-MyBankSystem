package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class ChangePasswordWindow extends Container {
    JLabel oldPassword, newPassword;
    JPasswordField oldPasswordField, newPasswordField;
    JButton changeBtn, backBtn;

    public ChangePasswordWindow() {
        setSize(300,250);
        setLayout(null);
        Font font = new Font("TimesRoman",Font.BOLD,10);

        backBtn = new JButton("<---");
        backBtn.setBounds(10,10,50,40);
        backBtn.setFont(font);
        add(backBtn);

        backBtn.addActionListener(actionEvent -> {
            MainFrame.bankWindow.setVisible(true);
            MainFrame.changePasswordWindow.setVisible(false);
            Main.mf.setSize(400,500);
            Main.mf.setLocation(550,160);
        });

        oldPassword = new JLabel("Old Password");
        oldPassword.setBounds(20,50,80, 30);
        oldPassword.setFont(font);
        add(oldPassword);

        newPassword = new JLabel("New Password");
        newPassword.setBounds(20,100,80,30);
        newPassword.setFont(font);
        add(newPassword);

        oldPasswordField = new JPasswordField();
        oldPasswordField.setBounds(100,50,150,30);
        add(oldPasswordField);

        newPasswordField = new JPasswordField();
        newPasswordField.setBounds(100,100,150,30);
        add(newPasswordField);

        changeBtn = new JButton("Change Password");
        changeBtn.setBounds(80,150,140,40);
        changeBtn.setFont(font);
        add(changeBtn);

        changeBtn.addActionListener(actionEvent -> {
            char[] s = {'a','d','i','k'};
            char[] s2 = oldPasswordField.getPassword();
            char[] s0 = newPasswordField.getPassword();
            char[] s3 = {};
            if(Arrays.equals(s,s2) && !Arrays.equals(s3,s0)) {
                JOptionPane.showMessageDialog(null, "Your password was successfully changed!");
                MainFrame.bankWindow.setVisible(true);
                MainFrame.changePasswordWindow.setVisible(false);
                Main.mf.setSize(400,500);
                Main.mf.setLocation(550,160);
            }
            else {
                JOptionPane.showMessageDialog(null, "The old password was inserted incorrectly! or new password is empty!");
            }
            oldPasswordField.setText("");
            newPasswordField.setText("");
        });
    }
}
