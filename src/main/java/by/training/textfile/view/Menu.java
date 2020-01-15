package by.training.textfile.view;

import by.training.textfile.business.Receiver;
import by.training.textfile.command.*;
import by.training.textfile.controller.Dispatcher;
import by.training.textfile.exception.FileException;

import java.util.Scanner;

public class Menu implements View {

    public void userService() throws FileException {


        Receiver receiver = new Receiver();
        Dispatcher dispatcher = new Dispatcher(new CreateCommand(receiver),
                new RenameCommand(receiver),
                new AddCommand(receiver),
                new DeleteCommand(receiver),
                new PrintCommand(receiver));


    /*    System.out.println("Input name of file that want to rename:");
        dispatcher.rename();*/

          /*  System.out.println("Input name of file for print:");
            dispatcher.printConsole();*/

/*
        System.out.println("Input name of file that want to delete:");
        dispatcher.delete();
*/
       /* System.out.println("Input name and directory of file to create:");
        dispatcher.create();*/

       /* System.out.println("Input name of file and snippet for apply:");
        dispatcher.addInfo();*/

            dispatcher.getCommand("rename").execute();

    }
}
