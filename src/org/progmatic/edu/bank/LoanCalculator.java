package org.progmatic.edu.bank;

public class LoanCalculator {
    private LoanResponse calculator;

    public LoanCalculator(LoanResponse calculator) {
        this.calculator = calculator;
    }

    public void respond() {
        if (calculator.isGranted()) {
            if (calculator.needsCoverage()) {
                if (calculator.needsSuccessor()) {
                    System.out.println("Szükséged van kezesre és egy " + calculator.getCoverageAmount() + " Ft értékű fedezetre.");
                    System.out.println("A havi törlesztő részlet: " + (int)calculator.getMonthlyFee() + " Ft");
                } else {
                    System.out.println("Nincs szükséged kezesre, de egy " + calculator.getCoverageAmount() + " Ft értékű fedezetre igen.");
                    System.out.println("A havi törlesztő részlet: " + (int)calculator.getMonthlyFee() + " Ft");
                }
            } else {
                System.out.println("A hitelt azonnal folyosítjuk.");
                System.out.println("A havi törlesztő részlet: " + (int)calculator.getMonthlyFee() + " Ft");
            }
        } else {
            System.out.println("Nem vagy jogosult a hitelre.");
        }
    }
}
