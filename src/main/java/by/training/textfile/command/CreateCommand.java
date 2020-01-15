package by.training.textfile.command;

import by.training.textfile.business.Receiver;
import by.training.textfile.exception.FileException;

public class CreateCommand implements Command {

    Receiver receiver;


    public CreateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() throws FileException {

        receiver.create();
    }
}
