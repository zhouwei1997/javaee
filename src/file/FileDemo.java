package file;

import org.junit.Test;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: file
 * ClassName: FileDemo
 * Author: hengyu
 * Date: 2020/8/19 20:22
 * project name: javase
 * Version:
 * Description:
 */
public class FileDemo {

    /**
     * public File(String pathname)
     * 通过将给定的路径名字字符串转换为抽象路径名来创建新的File实例
     */
    @Test
    public void pathnameTest(){
        File file=new File("E:\\workspace\\IntelIJ\\javase\\a.txt");
        System.out.println(file);
    }


}
