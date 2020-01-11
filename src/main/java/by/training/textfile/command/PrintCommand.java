package by.training.textfile.command;

import by.training.textfile.business.Receiver;

public class PrintCommand implements Command {

    Receiver receiver;

    public PrintCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.printConsole();
    }
}
