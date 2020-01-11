package by.training.textfile.command;

public class RenameCommand implements Command {

    Receiver receiver;

    public RenameCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.rename();
    }
}
