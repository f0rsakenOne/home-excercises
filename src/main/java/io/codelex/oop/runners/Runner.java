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
        if (time >= INTERMEDIATE.minTime && time <= INTERMEDIATE.maxTime) {
            return INTERMEDIATE;
        } else if (time > ADVANCED.minTime && time <= ADVANCED.maxTime) {
            return ADVANCED;
        }
        return BEGINNER;
    }
}
