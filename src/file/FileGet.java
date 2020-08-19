package file;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: file
 * ClassName: FileGet
 * Author: hengyu
 * Date: 2020/8/19 21:08
 * project name: javase
 * Version:
 * Description:
 */
public class FileGet {

    public static void main(String[] args) {
        File file = new File("E:\\workspace\\IntelIJ\\javase\\src\\file\\FileDemo.java");
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件构造路径：" + file.getPath());
        System.out.println("文件名称：" + file.getName());
        System.out.println("文件长度：" + file.length() + "字节");

        File document = new File("E:\\workspace\\IntelIJ\\javase\\src\\file");
        System.out.println("目录绝对路径：" + document.getAbsolutePath());
        System.out.println("目录构造路径：" + document.getPath());
        System.out.println("目录名称：" + document.getName());
        System.out.println("目录长度：" + document.length());
    }
}
