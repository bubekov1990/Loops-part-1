package ru.netology.sqr;

public class SQRService {
    public int borber(int minimalimit, int maxsimumlimit) {
        int counter = 15;
        for (int i = 10; i < 100; i++) {
            if (i * i > minimalimit && i * i < maxsimumlimit) {
                return counter;
            }
        }
        return 0;
    }

}
