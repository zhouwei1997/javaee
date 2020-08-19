# File类

java.io.File类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作

## 构造方法

public File(String pathname)：通过将给定的路径名字字符串转换为抽象路径名来创建新的File实例
~~~
String pathname :字符串的路径名称
1、路径可以是文件结尾，也可以是文件夹结尾
2、路径可以是相对路径，也可以是绝对路径
3、路径可以是存在的，也可以是不存在的
4、创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
~~~

public File(String parent,String child)：从父路径名字符串和子路径名字字符串创建新的File类实例
~~~
String parent：父路径
String child：子路径
1、父路径和子路径可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
~~~

public File(File parent.String child)：从父抽象路径名和子路径字符串创建新的File类实例
~~~
File parent：父路径
String child：子路径
1、父路径和子路径可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
2、父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象
~~~

## 获取功能的方法

public String getAbsolutePath()：返回此File的绝对路径名字符串

public String getPath()：将此File转换为路径名字符串

public String getName()：返回由此File表示的文件或目录的名称

public long length()：返回由此File表示的文件的长度

```java
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
```

## 判断功能的方法

public boolean exists()：此File表示的文件或目录是否存在

public boolean isDirectory()：此File表示的是否为目录

public boolean isFile()：此File表示的是否为文件

```java 
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
```

## 创建删除功能的方法

public boolean createNewFile()：当且仅当具有该名称的文件尚不存在的，创建一个新的空文件

public boolean delete()：删除此File表示的文件或目录

public boolean mkdir()：创建由此File表示的目录

public boolean mkdirs()：创建由此File表示的目录，包括任何必须但不存在的父目录