package by.training.textfile.command;

import by.training.textfile.business.FileManagerFactory;
import by.training.textfile.business.FileManagerImpl;
import by.training.textfile.business.Receiver;

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
