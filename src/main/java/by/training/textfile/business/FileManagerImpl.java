package by.training.textfile.business;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.bean.File;

import java.util.List;

public class FileManagerImpl implements FileManager {

    private FSDao dao;

    public FileManagerImpl(FSDao dao) {
        this.dao = dao;
    }

    @Override
    public void writeInFS(List<File> files) {

        dao.writeInFS(files);
    }

    @Override
    public List<File> files() {
        return dao.files();
    }

    @Override
    public File create() {
        return new File();
    }

    @Override
    public void rename() {

    }

    @Override
    public void printConsole() {

    }

    @Override
    public void addInfo(String s) {

    }

    @Override
    public void delete() {

    }
}
