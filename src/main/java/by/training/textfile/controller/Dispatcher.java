package by.training.textfile.controller;

import by.training.textfile.bean.File;
import by.training.textfile.business.Receiver;
import by.training.textfile.command.*;

import java.util.EnumMap;
import java.util.Map;

public class Dispatcher {//developer

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
        map.put(CommandEnum.PRINT_CONSOLE, new PrintCommand(receiver));
        map.put(CommandEnum.RENAME, new RenameCommand(receiver));
    }

    public Command getCommand(String userCommand) {
        CommandEnum commandEnum;
        Command command;

        commandEnum = CommandEnum.valueOf(userCommand.toUpperCase().trim());
        command = map.get(commandEnum);
        return command;
    }

    public Dispatcher(Command create, Command rename, Command addInfo,
                      Command delete, Command print) {

        this.create = create;
        this.rename = rename;
        this.addInfo = addInfo;
        this.delete = delete;
        this.print = print;
    }
    public void create(){ create.execute(); }
    public void rename(){
        rename.execute();
    }
    public void printConsole(){ print.execute(); }
    public void addInfo(){ addInfo.execute(); }
    public void delete(){
        delete.execute();
    }
}
