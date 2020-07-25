package com.example.demo.dpattern.strategy;

public class MyWallet extends Wallet {

    public MyWallet(long money, PayPolicy payPolicy) {
        super(money, payPolicy);
    }

    @Override
    protected void prePay() {

    }

    @Override
    protected void process(long price) {
        System.out.println("지출 금액 : " + price);
        this.money = this.money - price;
    }

    public static void main(String[] args) {
        Wallet wallet1 = new MyWallet(10000, new TimidPayPolicy());
        wallet1.pay(1000);

        Wallet wallet2 = new MyWallet(200000, new TreatPayPolicy());
        wallet2.pay(4000);
    }
}
