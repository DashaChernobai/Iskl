package com.example.pupil.iskl;

public class SingleThread implements Runnable {

    private Account account;
    private String login;
    private long password;
    private int sum;

    public SingleThread(Account account) {
        super();
        this.account = account;
    }

    @Override
    public void run() {
        account.takeMoney(this.login, this.password,this.sum); }

    public void getMoneyFromAccount(String login, long password, int sum) {
        this.password = password;
        this.login = login;
        this.sum = sum;
        Thread thread = new Thread(this);
        thread.start();
    }
}
