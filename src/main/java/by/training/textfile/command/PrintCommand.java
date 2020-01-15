package by.training.textfile.command;

import by.training.textfile.business.Receiver;
import by.training.textfile.exception.FileException;

public class PrintCommand implements Command {

    Receiver receiver;

    public PrintCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() throws FileException {
        receiver.printConsole();
    }
}
