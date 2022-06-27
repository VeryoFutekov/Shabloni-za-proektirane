import java.util.List;

public class FitnessInstructor {
//    private Command exercise;
    private TrainingModel trainingModel;

    public FitnessInstructor(TrainingModel model) {
        trainingModel = model;
    }

    public void setExercise(Command exercise){
//        this.exercise = exercise;
        exercise.execute();
    }
//
//    public Command getExercise() {
//        return exercise;
//    }
}
