/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

public class Coach extends User {
    private List<Participant> participants;

    // Constructor
    public Coach(String username, String password, Profile profile, List<Participant> participants) {
        super(username, password, profile);
        this.participants = participants;
    }

    // Methods
    public void viewParticipantProfiles() {
        // Implement the logic to view participants' profiles
    }

    public void addWorkoutProgram(WorkoutProgram program) {
        // Implement the logic to add a workout program
    }

    public void addNutritionProgram(NutritionProgram program) {
        // Implement the logic to add a nutrition program
    }

    public void viewParticipantProgress(Participant participant) {
        // Implement the logic to view a participant's progress
    }
}
