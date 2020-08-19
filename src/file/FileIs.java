package file;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: file
 * ClassName: FileIs
 * Author: hengyu
 * Date: 2020/8/19 22:11
 * project name: javase
 * Version:
 * Description:
 */
public class FileIs {

    public static void main(String[] args) {
        File file = new File("E:\\workspace\\IntelIJ\\javase\\src\\file\\FileDemo.java");
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("是否为文件：" + file.exists());


        File document = new File("E:\\workspace\\IntelIJ\\javase\\src\\file");
        System.out.println("目录是否存在：" + document.exists());
        System.out.println("是否为目录：" + document.exists());
    }
}
