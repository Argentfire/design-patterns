package designpatterns.commandobserver;

public class ActivateOvenCommand implements Command{

    private Oven oven;

    public ActivateOvenCommand(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void execute() {
        this.oven.ChangeStatus();
    }
}
