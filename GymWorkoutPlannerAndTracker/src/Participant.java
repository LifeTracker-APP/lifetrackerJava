/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Participant extends User {
    private Coach coach;

    // Constructor
    public Participant(String username, String password, Profile profile) {
        super(username, password, profile);
    }

    // Methods
    public void addHealthInformation() {
        // Implement the logic to add/update health information
    }

    public void selectCoach(Coach coach) {
        // Implement the logic to select a coach
    }

    public void viewWorkoutProgram() {
        // Implement the logic to view the workout program
    }

    public void viewNutritionProgram() {
        // Implement the logic to view the nutrition program
    }

    public void confirmDailyAchievements() {
        // Implement the logic to confirm daily achievements
    }

    public void viewPersonalProgress() {
        // Implement the logic to view personal progress
    }

    public void viewFitnessProgressHistory() {
        // Implement the logic to view fitness progress history
    }
}