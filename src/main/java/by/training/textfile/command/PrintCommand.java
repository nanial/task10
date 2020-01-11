package by.training.textfile.command;

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
