package com.example;

//write your class implementation here
public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int days;
    private int activeDays;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        totalSteps = 0;
        days = 0;
        activeDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        days++;
        if (steps >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalSteps == 0) {
            return 0;
        }
        return (double) totalSteps/days;
    }
    
}
