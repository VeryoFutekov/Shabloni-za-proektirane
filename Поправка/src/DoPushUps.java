public class DoPushUps implements Command{
    private TrainingModel model;

    public DoPushUps(TrainingModel model) {
        this.model = model;
    }

    @Override
    public void execute(){
        this.model.doPushUps();
    }
}
