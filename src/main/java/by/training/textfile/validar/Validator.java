package by.training.textfile.validar;

import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.bean.File;
import by.training.textfile.business.FileManagerImpl;
import by.training.textfile.dao.FSDaoImpl;

import java.util.List;

public class Validator {


    public  boolean exists(File file, List<File> list){

        for( File f : list){
            if(f.getNameFile().equals(file.getNameFile())){
                return true;
            }
        }
        return false;
    }
}
