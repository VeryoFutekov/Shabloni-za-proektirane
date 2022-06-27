public class Spectator {
    private String exercise;


    public void update(String exercise){
        this.exercise = exercise;
    }

    public String getExercise() {
        return String.format("spectator is %s", exercise);
    }
}
