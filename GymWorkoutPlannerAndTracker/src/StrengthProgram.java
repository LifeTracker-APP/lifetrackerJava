
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class StrengthProgram implements WorkoutProgram {
    private List<Exercise> exercises;

    // Constructor
    public StrengthProgram() {
        this.exercises = new ArrayList<>();
    }

    // Implement the methods from the WorkoutProgram interface
    @Override
    public void addExercise(Exercise exercise) {
        // Implement the logic to add a strength exercise to the program
    }

    @Override
    public void removeExercise(Exercise exercise) {
        // Implement the logic to remove a strength exercise from the program
    }

    @Override
    public void viewProgram() {
        // Implement the logic to view the strength program
    }

    // Additional methods specific to strength exercises
    public void setWeight(int weight) {
        // Implement the logic to set the weight of the strength program
    }

    public void setReps(int reps) {
        // Implement the logic to set the reps of the strength program
    }
}