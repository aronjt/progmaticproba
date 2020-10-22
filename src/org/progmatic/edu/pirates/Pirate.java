package org.progmatic.edu.pirates;

public class Pirate {

    private int alcoholLevel = 0;
    private boolean isAlive;
    private boolean isPassedOut;

    public Pirate() {
    }

    public int getAlcoholLevel() {
        return alcoholLevel;
    }

    public int drink() {
        return alcoholLevel++;
    }

    public void howItGoinfMate () {
        if (alcoholLevel <= 4 && !isPassedOut) {
            System.out.println("Pour me anudder!");
            isPassedOut = false;
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            alcoholLevel = 0;
            isPassedOut = true;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isPassedOut() {
        return isPassedOut;
    }

    public boolean passeOut() {
        return isPassedOut = true;
    }

    public boolean die() {
        return isAlive = false;
    }

    public void brawl(Pirate enemy) {
        double chance = Math.random();
        if (chance < (1/3d)) {
            die();
        } else if (chance < (2/3d)) {
            enemy.die();
        } else {
            passeOut();
            enemy.passeOut();
        }
    }
}
