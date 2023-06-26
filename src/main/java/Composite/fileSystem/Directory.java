package Composite.fileSystem;

import org.testng.reporters.Files;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    //List<Object> objectList;
    List<FileSystem> fileSystemList;


    public Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }


    public void add(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    public void ls() {
        System.out.println("Directory name --" + directoryName);
      /*  for (Object obj : objectList) {
            if (obj instanceof File) {
                ((File) obj).ls();
            }
            if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }*/
        for (FileSystem fileSystemObj : fileSystemList) {
            fileSystemObj.ls();
        }
    }
}
