package org.progmatic.edu.pirates;

public class BattleApp {

    public static void main(String[] args) {
        Ship black = new Ship();
        Ship white = new Ship();

        black.fillShip();
        white.fillShip();

        System.out.println(black.getPirates());
        System.out.println(white.getPirates());

       if (black.battle(white)) {
           System.out.println("black wins");
       } else {
           System.out.println("white wins");
       }
        System.out.println(black.getPirates());
        System.out.println(white.getPirates());
    }
}
