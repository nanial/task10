package by.training.textfile.command;

public class DeleteCommand implements Command {

    Receiver receiver;

    public DeleteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.delete();
    }
}
