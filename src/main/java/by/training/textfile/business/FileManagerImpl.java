package by.training.textfile.business;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.bean.Directory;
import by.training.textfile.bean.FS;
import by.training.textfile.bean.File;
import by.training.textfile.bean.TextFile;

import java.util.List;
import java.util.Scanner;

public class FileManagerImpl implements FileManager {

    private FSDao dao;
    FS fs =  new FSFactory().getFSBuilder().getFS();
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
        File file = new File(nameFile);
        this.writeInFS(fs.addFS(file));
        return file;
    }

    @Override
    public void rename() {

        String nameFile = scanner.nextLine();
        String newNameFile = scanner.nextLine();
        File file = new File(nameFile);

        if (this.files().contains(file)) {

            file.setNameFile(newNameFile);
            this.writeInFS(fs.addFS(file));

        } else {
            System.out.println("file doesn't exists");
        }
    }

    @Override
    public void printConsole() {

        String nameFile = scanner.nextLine();
        File file = new File(nameFile);

        if (this.files().contains(file)) {
            System.out.println(file.getText());
        }
    }

    @Override
    public void addInfo() {
        String nameFile = scanner.nextLine();
        String suppSnippet = scanner.nextLine();
        TextFile file = new TextFile(nameFile);

        /*if (this.files().contains(file)) {
            file.getText().getContent().append(suppSnippet);
        }*/
    }

    @Override
    public void delete() {

        String nameFile = scanner.nextLine();
        TextFile file = new TextFile(nameFile);
        if (this.files().contains(file)) {
            this.files().remove(file);
        }
    }
}
