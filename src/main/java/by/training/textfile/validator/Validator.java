package by.training.textfile.validator;

import by.training.textfile.bean.File;

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
