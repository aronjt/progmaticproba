package org.progmatic.edu.pirates;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> pirates = new ArrayList<>();
    private Pirate captain;

    public void fillShip() {
        int size = (int) (Math.random()*100+1);
        for (int i = 0; i < size; i++) {
            pirates.add(new Pirate());
        }
        captain = pirates.get(0);
    }

    public int getPirates() {
        return pirates.size();
    }

    public Pirate getCaptain() {
        return captain;
    }

    public boolean battle(Ship otherShip) {
        int shipScore = pirates.size() + captain.getAlcoholLevel();
        int otherShipScore = otherShip.pirates.size() + otherShip.captain.getAlcoholLevel();
        if (shipScore > otherShipScore) {
            int deaths = (int) (Math.random()*otherShip.pirates.size());
            if (deaths >= otherShip.pirates.size()) {
                otherShip.pirates.clear();
            } else {
                for (int i = 0; i < deaths-1; i++) {
                    otherShip.pirates.remove(i);
                }
            }
            int rum = (int) (Math.random()*10);
            for (int i = 0; i < rum; i++) {
                for (int j = 0; j < pirates.size()-1; j++) {
                    pirates.get(j).drink();
                }
            }
            return true;
        } else {
            int deaths = (int) (Math.random()*pirates.size());
            if (deaths >= pirates.size()) {
                pirates.clear();
            } else {
                for (int i = 0; i < deaths-1; i++) {
                    pirates.remove(i);
                }
            }
            int rum = (int) (Math.random()*10);
            for (int i = 0; i < rum; i++) {
                for (int j = 0; j < otherShip.pirates.size()-1; j++) {
                    otherShip.pirates.get(j).drink();
                }
            }
        }
        return false;
    }
}
