import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Spectator spectator1 = new Spectator();
        Spectator spectator2 = new Spectator();
        Spectator spectator3 = new Spectator();
        List<Spectator> spectators = new ArrayList<>();
        spectators.add(spectator1);
        spectators.add(spectator2);
        spectators.add(spectator3);

        TrainingModel model = new TrainingModel(spectators);
        FitnessInstructor instructor = new FitnessInstructor(model);
        DoPlank doPlank = new DoPlank(model);
        DoPushUps doPushUps = new DoPushUps(model);

        instructor.setExercise(doPlank);
        System.out.println(spectator1.getExercise());
        System.out.println(spectator2.getExercise());
        System.out.println(spectator3.getExercise());

        instructor.setExercise(doPushUps);
        System.out.println(spectator1.getExercise());
        System.out.println(spectator2.getExercise());
        System.out.println(spectator3.getExercise());
    }
}
