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

        while (true) {

            System.out.println("For finish press 'exit', please");

           /* System.out.println("Input name of file that want to rename:");
            dispatcher.rename();*/

           System.out.println("Input name of file for print:");
            dispatcher.printConsole();

           // System.out.println(dispatcher.getCommand("print"));
           /* System.out.println("Input directory  and name of file to create:");
            dispatcher.create();*/
          /*  System.out.println("Input name of file and snippet for apply:");
            dispatcher.addInfo();*/

            /*System.out.println("Input name of file that want to delete:");
            dispatcher.delete();*/
            if(new Scanner(System.in).nextLine().equals("exit")){
                break;
            }
        }

    }
}
