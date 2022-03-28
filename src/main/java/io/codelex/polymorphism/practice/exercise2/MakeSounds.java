package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Firework firework = new Firework();
        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        List<Sound> soundMakers = new ArrayList<>();
        soundMakers.add(firework);
        soundMakers.add(parrot);
        soundMakers.add(radio);
        soundMakers.forEach(Sound::playSound);
    }
}
