package file;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: file
 * ClassName: FileFor
 * Author: hengyu
 * Date: 2020/8/20 20:30
 * project name: javase
 * Version:
 * Description:
 */
public class FileFor {

    public static void main(String[] args) {

        File dir = new File("D:\\Navicat Premium 15");

        //获取当前目录下的文件以及文件夹的名称
        String[] names = dir.list();
        for (String name : names) {
            System.out.println(name);
        }

        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么久可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
