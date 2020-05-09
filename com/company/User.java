package com.company;

public class User extends Human {
    private String fullName;
    private String username;
    private char[] password;
    private String phoneNum;
    private String keyWord;
    private int keyQ_index;
    private int cardId;

    public User(String fullName, String username, char[] password, String phoneNum, String keyWord, int keyQ_index, int cardId) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.phoneNum = phoneNum;
        this.keyWord = keyWord;
        this.keyQ_index = keyQ_index;
        this.cardId = cardId;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    @Override
    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getKeyQ_index() {
        return keyQ_index;
    }

    public void setKeyQ_index(int keyQ_index) {
        this.keyQ_index = keyQ_index;
    }
}
