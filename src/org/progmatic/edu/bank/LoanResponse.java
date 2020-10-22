package org.progmatic.edu.bank;

public class LoanResponse {
    private LoanRequest request;
    private boolean isGranted;
    private boolean needsSuccessor;
    private boolean needsCoverage;
    private int coverageAmount;
    private float monthlyFee;

    public LoanResponse(LoanRequest loan) {
        this.request = loan;
    }

    public boolean isGranted() {
        if (request.isVIP()) {
            if (request.getAmount() <= 50000000) {
                return true;
            } else {
                return false;
            }
        } else if (request.getAmount() <= 20000000) {
            return true;
        }
        return false;
    }

    public boolean needsCoverage() {
        int money = request.getAmount();
        if (request.isVIP() && money >= 3000000) {
            return true;
        } else if (request.isVIP() && money < 3000000) {
            return false;
        } else if (money >= 500000) {
            return true;
        }
        return false;
    }

    public boolean needsSuccessor() {
        int money = request.getAmount();
        if (request.isVIP() && money > 20000000) {
            return true;
        } else if (request.isVIP() && money <= 20000000) {
            return false;
        } else if (money > 3000000) {
            return true;
        }
        return false;
    }

    public int getCoverageAmount() {
        if (needsCoverage() && request.isVIP()) {
            coverageAmount = request.getAmount() / 100 * 70;
        } else if (needsCoverage()){
            coverageAmount = request.getAmount() / 100 * 80;
        }
        return coverageAmount;
    }

    public float getMonthlyFee() {
        if (request.isVIP() && request.getPeriod() <= 12) {
            monthlyFee = request.getAmount() * (14 / 10f) / 12;
        } else if (request.isVIP()) {
            float rate = ((request.getPeriod() - 12) * 2 + 40f) / 100 + 1;
            monthlyFee = request.getAmount() * rate / request.getPeriod();
        } else if (request.getPeriod() <= 12) {
            monthlyFee = request.getAmount() * (15/10f) / 12;
        } else {
            float rate = ((request.getPeriod() - 12) * 3 + 50f) / 100 + 1;
            monthlyFee = request.getAmount() * rate / request.getPeriod();
        }
        return monthlyFee;
    }
}
