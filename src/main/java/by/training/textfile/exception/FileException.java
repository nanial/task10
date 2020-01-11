package by.training.textfile.exception;

import org.apache.log4j.Logger;


public class FileException extends Exception{

    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(FileException.class);

    public FileException() {
        super();
    }

    public FileException(String message) {
       logger.info(message);
    }

    public FileException(Exception e) {
        super(e);
    }

    public FileException(String message, Exception e) {
        super(message, e);
    }

}
