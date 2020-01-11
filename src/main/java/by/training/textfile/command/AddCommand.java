package by.training.textfile.command;

public class AddCommand implements Command {

    Receiver receiver;

    public AddCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addInfo("n");
    }
}
