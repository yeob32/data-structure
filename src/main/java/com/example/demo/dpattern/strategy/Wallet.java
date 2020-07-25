package com.example.demo.dpattern.strategy;

public abstract class Wallet {

    protected long money;
    private final PayPolicy payPolicy;

    public Wallet(long money, PayPolicy payPolicy) {
        this.money = money;
        this.payPolicy = payPolicy;
    }

    public void pay(long price) {
        prePay();

        long changePrice = payPolicy.controll(price);

        process(changePrice);
        finalPay();
    }

    protected abstract void prePay();
    protected abstract void process(long price);

    protected void finalPay() {
        System.out.println("잔여 금액 : " + this.money);
    }
}
