package by.training.textfile.command;

import by.training.textfile.business.Receiver;
import by.training.textfile.exception.FileException;

public class RenameCommand implements Command {

    Receiver receiver;

    public RenameCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() throws FileException {
        receiver.rename();
    }
}
