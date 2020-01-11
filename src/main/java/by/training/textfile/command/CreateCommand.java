package by.training.textfile.command;

public class CreateCommand implements Command {

    Receiver receiver;

    public CreateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.create();
    }
}
