package lesson31.task5;

import java.util.concurrent.Phaser;

public class PhaserTest {

    public static void main(String[] args) {

        Phaser phaser = new Phaser();

        new Competitor("Иван", 1000, phaser);
        new Competitor("Пётр", 3000, phaser);
        new Competitor("Сидор", 5000, phaser);
    }
}