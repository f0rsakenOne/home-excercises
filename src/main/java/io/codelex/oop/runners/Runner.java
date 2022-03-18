package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(60, 120),
    INTERMEDIATE(30, 59),
    ADVANCED(0, 29);

    private double minTime;
    private double maxTime;

    Runner(double minTime, double maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    static Runner getFitnesLevel(double time) {
        Runner runner = BEGINNER;
        if (time >= INTERMEDIATE.minTime && time <= INTERMEDIATE.maxTime) {
            runner = INTERMEDIATE;
        } else if (time > ADVANCED.minTime && time <= ADVANCED.maxTime) {
            runner = ADVANCED;
        }
        return runner;
    }
}
