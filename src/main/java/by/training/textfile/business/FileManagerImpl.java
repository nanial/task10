package by.training.textfile.business;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.bean.*;
import by.training.textfile.exception.FileException;

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
    public void create() throws FileException {

        Directory directory = new Directory(scanner.nextLine());
        String nameFile = scanner.nextLine();
        List<File> temp = this.files();
        File tempFile = new File(nameFile, directory);

        if (temp.contains(tempFile)) {

            throw new FileException("Attempt to create file already exists");
        }
        else {

            temp.add(tempFile);
        }
        this.writeInFS(temp);
    }

    @Override
    public void rename() throws FileException {

        String nameFile = scanner.nextLine();
        String newNameFile = scanner.nextLine();

        List<File> temp = this.files();

        for (File s : temp){

            if(s.getNameFile().equals(nameFile)){

                s.setNameFile(newNameFile);
            }
        }
        this.writeInFS(temp);
    }

    @Override
    public void printConsole() throws FileException {

        String nameFile = scanner.nextLine();
        File check = new File(nameFile);

        if(!this.exists(check)){

            throw new FileException("Attempt print non-existent file");
        }

        for (File s : this.files()){

            if(s.getNameFile().equals(nameFile)){

                System.out.println("File contents " + s.getText().getTitle()
                        + " " + s.getText().getContent());
            }
        }
    }

    @Override
    public void addInfo() throws FileException {

        String nameFile = scanner.nextLine();
        String suppSnippet = scanner.nextLine();

        List<File> temp = this.files();
        File check = new File(nameFile);

        if(!this.exists(check)){

            throw new FileException("Attempt add info into non-existent file");
        }

        for (File s : temp){

            if(s.getNameFile().equals(nameFile)){

                String content =  s.getText().getContent();
                String strTemp = content + " " + suppSnippet;
                s.getText().setContent(strTemp);
            }
        }
        this.writeInFS(temp);
    }

    @Override
    public void delete() throws FileException {

        String nameFile = scanner.nextLine();
        List<File> temp = this.files();

        for (File s : temp){

            if(s.getNameFile().equals(nameFile)){

                temp.remove(s);
            }
            else {
                throw new FileException("Attempt remove non-existent file");
            }
        }

        this.writeInFS(temp);
    }

    boolean exists(File file){

        for( File f : this.files()){
            if(f.getNameFile().equals(file.getNameFile())){
                return true;
            }
        }
        return false;
    }
}

