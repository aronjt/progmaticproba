package org.progmatic.edu.pirates;


import java.util.ArrayList;

public class Armada {
    private ArrayList<Ship> armada = new ArrayList<Ship>();

    public void fillArmada() {
        int size = (int) (Math.random()*10+1);
        for (int i = 0; i < size; i++) {
            armada.add(new Ship());
        }
    }

    public boolean war(Armada otherArmada) {
        return true;
    }
}
