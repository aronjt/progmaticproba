package org.progmatic.edu.bank;

public class LoanRequest {

    private int VIP;
    private int amount;
    private int period;

    public LoanRequest(int VIP, int amount, int period) {
        this.VIP = VIP;
        this.amount = amount;
        this.period = period;
    }

    public boolean isVIP() {
        if (VIP == 69) {
            return true;
        }
        return false;
    }

    public int getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }
}
