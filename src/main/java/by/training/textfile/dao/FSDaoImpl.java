package by.training.textfile.dao;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.bean.File;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FSDaoImpl implements FSDao {
    @Override
    public void writeInFS(List<File> files) {

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\by.training.task10\\fs.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        encoder.writeObject(files);
        encoder.close();
    }

    @Override
    public List<File> files() {

        List<File> files = new ArrayList<>();

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\by.training.task10\\fs.txt")));

            files = (List<File>) decoder.readObject();


        } catch (FileNotFoundException io) {
            io.getMessage();
        }
        return files;
    }
}
