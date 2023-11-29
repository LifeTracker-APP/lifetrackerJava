
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class CardioProgram implements WorkoutProgram {
    private List<Exercise> exercises;

    // Constructor
    public CardioProgram() {
        this.exercises = new ArrayList<>();
    }

    // Implement the methods from the WorkoutProgram interface
    @Override
    public void addExercise(Exercise exercise) {
        // Implement the logic to add a cardio exercise to the program
    }

    @Override
    public void removeExercise(Exercise exercise) {
        // Implement the logic to remove a cardio exercise from the program
    }

    @Override
    public void viewProgram() {
        // Implement the logic to view the cardio program
    }

    // Additional methods specific to cardio exercises
    public void setIntensityLevel(int intensityLevel) {
        // Implement the logic to set the intensity level of the cardio program
    }

    public void setDuration(int duration) {
        // Implement the logic to set the duration of the cardio program
    }
}