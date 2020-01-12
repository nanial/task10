package by.training.textfile.command;

import by.training.textfile.business.Receiver;

public class AddCommand implements Command {

    Receiver receiver;

    public AddCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addInfo();
    }
}
