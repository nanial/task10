package by.training.textfile.controller;

import by.training.textfile.bean.File;
import by.training.textfile.business.Receiver;
import by.training.textfile.command.*;
import by.training.textfile.exception.FileException;

import java.util.EnumMap;
import java.util.Map;

public class Dispatcher {//invoker

    Receiver receiver;
    Command create;
    Command rename;
    Command addInfo;
    Command delete;
    Command print;
    private final Map<CommandEnum, Command> map =
            new EnumMap<CommandEnum, Command>(CommandEnum.class);

    public Dispatcher() {

        map.put(CommandEnum.ADD_INFO, new AddCommand(receiver));
        map.put(CommandEnum.CREATE, new CreateCommand(receiver));
        map.put(CommandEnum.DELETE, new DeleteCommand(receiver));
        map.put(CommandEnum.PRINT, new PrintCommand(receiver));
        map.put(CommandEnum.RENAME, new RenameCommand(receiver));
    }

    public Dispatcher(Command create, Command rename, Command addInfo,
                      Command delete, Command print) {

        this.create = create;
        this.rename = rename;
        this.addInfo = addInfo;
        this.delete = delete;
        this.print = print;
    }

    public Command getCommand(String userCommand) {
        CommandEnum commandEnum;
        Command command;

        commandEnum = CommandEnum.valueOf(userCommand.toUpperCase().trim());
        command = map.get(commandEnum);
        return command;
    }

    public void create() throws FileException { create.execute(); }
    public void rename() throws FileException {
        rename.execute();
    }
    public void printConsole() throws FileException { print.execute(); }
    public void addInfo() throws FileException { addInfo.execute(); }
    public void delete() throws FileException {
        delete.execute();
    }
}