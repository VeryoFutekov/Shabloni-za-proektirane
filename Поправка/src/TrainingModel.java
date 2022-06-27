import java.util.List;

public class TrainingModel {
    private String exercise;
    private List<Spectator> spectators;

    public TrainingModel( List<Spectator> spectators) {
        this.spectators = spectators;
    }

    public void addSpectator(Spectator spectator){
        spectators.add(spectator);
    }

    public void removeSpectator(Spectator spectator){
        spectators.remove(spectator);
    }

    public String getExercise() {
        return exercise;
    }

    public void doPushUps () {
        this.exercise = "doing pushUps";
        System.out.println("model is doing pushUps");
        spectators.forEach(s -> s.update(exercise));
    }

    public void doPlank(){
        this.exercise = "doing plank";
        System.out.println("model is doing plank");
        spectators.forEach(s -> s.update(exercise));
    }
}
