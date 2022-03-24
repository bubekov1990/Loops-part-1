package ru.netology.sqr;

public class SQRService {
    public int borber(int minimalimit, int maxsimumlimit) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i > minimalimit && i * i < maxsimumlimit) {
                counter++;
            }
        }
        return counter;
    }

}
