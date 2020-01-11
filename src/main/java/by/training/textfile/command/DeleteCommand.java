package by.training.textfile.command;

import by.training.textfile.business.Receiver;

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
