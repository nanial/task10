package by.training.textfile.business;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.bean.Directory;
import by.training.textfile.bean.File;
import by.training.textfile.bean.TextFile;
import java.util.List;
import java.util.Scanner;

public class FileManagerImpl implements FileManager {

    private FSDao dao;
    Scanner scanner = new Scanner(System.in);


    public FileManagerImpl() {
    }

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
    }//return fs

    @Override
    public File create() {
        Directory directory = new Directory(scanner.nextLine());
        String nameFile = scanner.nextLine();
        return new File(nameFile, directory);
    }

    @Override
    public void rename() {
        String nameFile = scanner.nextLine();
        String newNameFile = scanner.nextLine();
        File file = new TextFile(nameFile);

        if (this.files().contains(nameFile)) {

            if (file.getNameFile().equals(nameFile)) {

                file.setNameFile(newNameFile);
            }
        }
    }

    @Override
    public void printConsole() {

        String nameFile = scanner.nextLine();
        TextFile file = new TextFile(nameFile);

        if (this.files().contains(nameFile)) {
            System.out.println(file.getText().toString());
        }
    }

    @Override
    public void addInfo() {
        String nameFile = scanner.nextLine();
        String suppSnippet = scanner.nextLine();
        TextFile file = new TextFile(nameFile);

        if (this.files().contains(nameFile)) {
            file.getText().getContent().append(suppSnippet);
        }
    }

    @Override
    public void delete() {

        String nameFile = scanner.nextLine();
        if (this.files().contains(nameFile)) {
            this.files().remove(nameFile);
        }
    }
}
