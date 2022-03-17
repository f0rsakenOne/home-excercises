package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(60, 120),
    INTERMEDIATE(30, 59),
    ADVANCED(0, 29);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    static Runner getFitnesLevel(int time) {
        Runner runner = BEGINNER;

        if (time >= 30 && time <= 59) {
            runner = INTERMEDIATE;
        } else if (time > 0 && time <= 29) {
            runner = ADVANCED;
        }
        return runner;
    }
}
