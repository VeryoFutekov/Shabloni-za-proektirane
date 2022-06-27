public class DoPlank implements Command{
   private TrainingModel model;

    public DoPlank(TrainingModel model) {
        this.model = model;
    }

    @Override
    public void execute() {
        this.model.doPlank();
    }
}
