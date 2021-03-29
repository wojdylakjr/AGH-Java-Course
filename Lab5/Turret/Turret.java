package com.company;

public class Turret {
    private static int turrets = 0;
    private int numberOfTurret;
    private int ammunition = 10;


    public Turret() {
        turrets++;
        this.numberOfTurret = turrets;
        if (numberOfTurret % 3 == 0) ammunition = 0;
    }


    public void shoot() {

        System.out.print("Turret " + numberOfTurret);
        if (ammunition == 0) System.out.println(": OOPS!");
        else {
            System.out.println(": BOOM!");
            ammunition--;
        }
    }

    @Override
    public String toString() {
        return "Turret " + numberOfTurret + ", current ammo: " + ammunition;
    }

    public static void main(String[] args) {
        Turret[] turrets = new Turret[10];
        for (int i = 0; i < turrets.length; i++) {
            turrets[i] = new Turret();
        }
        for (Turret turret : turrets) {
            System.out.println(turret);
        }
        for (Turret turret : turrets) {
            turret.shoot();
        }
        for (Turret turret : turrets) {
            System.out.println(turret);
        }
    }

}