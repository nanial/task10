package by.training.textfile.view;

import by.training.textfile.business.Receiver;
import by.training.textfile.command.*;
import by.training.textfile.controller.Dispatcher;

public class Menu implements View {

    public void userService() {

        Receiver receiver = new Receiver();
        Dispatcher dispatcher = new Dispatcher(new CreateCommand(receiver),
                new RenameCommand(receiver),
                new AddCommand(receiver),
                new DeleteCommand(receiver),
                new PrintCommand(receiver));

        dispatcher.rename();//test
    }

}
