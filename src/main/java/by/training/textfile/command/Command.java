package by.training.textfile.command;

import by.training.textfile.exception.FileException;

public interface Command {

    void execute() throws FileException;
}
