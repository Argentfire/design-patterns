package designpatterns.commandobserver;

public class HomeAssistant {
    private Command command;

    public void SetCommand(Command command) {
        this.command = command;
    }

    public void PressButton() {
        System.out.println("Processing Command!");
        this.command.execute();
    }
}
