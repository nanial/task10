package by.training.textfile.apibusiness;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.business.FileManagerImpl;

public interface FileManagerBuilder {

    FileManagerImpl getFileManager();
}
