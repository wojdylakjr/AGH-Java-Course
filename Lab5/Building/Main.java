package com.company;

public class Main {

    public static void main(String[] args) {
        // klasa Main w metodzie main:
        // - tworzy kilka gwozdzi
        Nail nail1 = new Nail();
        Nail nail2 = new Nail();
        Nail nail3 = new Nail();


        // - tworzy dwa mlotki roznych producentow
        Hammer hammer1 = new Hammer("Fiskars");
        Hammer hammer2 = new Hammer("Makita");

        // - tworzy dwie sciany w roznych kolorach
        Wall wall1 = new Wall("Red");
        Wall wall2 = new Wall("White");
        // - probuje wbijac te gwozdzie mlotkami w sciany
        hammer1.hitTheNail(nail1,wall1);
        hammer1.hitTheNail(nail1,wall2);
        wall1.setColor("Blue");
        hammer1.hitTheNail(nail2,wall1);
        hammer2.hitTheNail(nail3,wall1);




        // - w szczegolnosci sprawdza, czy mozna wbic dany gwozdz dwa razy
        // - probuje rowniez zmieniac kolor istniejacej sciany i sprawdzic, jak wplynie to na dalsze akcje z jej udzialem
    }
}

