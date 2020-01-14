package by.training.textfile.business;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.bean.*;

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
    public void create() {
       // Directory directory = new Directory(scanner.nextLine());
        String nameFile = scanner.nextLine();
        List<File> temp = this.files();
        File newFile = new File(nameFile);

        if (temp.contains(newFile)) {
            System.out.println("This file is already exists");
        } else {
            temp.add(newFile);
        }

        this.writeInFS(temp);
    }

    @Override
    public void rename() {

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
    public void printConsole() {

        String nameFile = scanner.nextLine();

        for (File s : this.files()){

            if(s.getNameFile().equals(nameFile)){

                System.out.println("File contents " + s.getText().getTitle()
                        + " " + s.getText().getContent());
            }
        }
    }

    @Override
    public void addInfo() {
        String nameFile = scanner.nextLine();
        String suppSnippet = scanner.nextLine();

        List<File> temp = this.files();

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
    public void delete() {

        String nameFile = scanner.nextLine();
        List<File> temp = this.files();

        for (File s : temp){

            if(s.getNameFile().equals(nameFile)){

                temp.remove(s);
            }
        }
        this.writeInFS(temp);
    }

}

