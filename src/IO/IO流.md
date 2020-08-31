# IO流

## IO的分类

根据数据的流向分为：输入流和输出流

- 输入流：把数据从其他设备上读取到内存中的流
- 输出流：把数据从内存写出到其他设备上的流

根据数据的类型分为：字节流和字符流

## 顶级的父类

|  | 输入流 | 输出流 |
| --- | --- | --- |
| 字节流 | 字节输入流 InputStream | 字节输出流 OutputStream |
| 字符流 | 字符输入流 Reader | 字符输出流 Writer |

## 字节流

### 一切皆为字节

一切文件数据（文本、图片、视频等）在存储时，都是以二进制数字的形式保存，都一个一个字节，那么传输时也是如此的。所以，字节流可以传输任意文件数据。在操作流的时候，无论使用什么样的流对象，底层传输的始终为二进制数据

### 字节输出流【OutputStream】

java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。定义了字节输出流的基本共性功能方法。

- public void close()：关闭此输出流并释放与此相关联的任何系统资源
- public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出
- public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流
- public void write(byte[] b,int off,int len)：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
- public abstract void write(int b)：将指定的字节输出流

### FileOutputStream类

#### 构造方法

- FileOutputStream(String name)：创建一个向具有指定名称的文件中写入数据的输出文件流
- FileOutputStream(File file)：创建一个向指定File对象表示的文件中写入数据的文件输出流

参数：
- String name：目的地是一个文件的路径
- File file：目的地是一个文件

构造方法的作用：
1. 创建一个FileOutputStream对象
2. 根据构造方法中传递的文件/文件路径，创建一个空的文件
3. 会把FileOutputStream对象指向创建好的文件


字节输出流的使用步骤：

1. 创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
2. 调用FileOutputStream对象中的方法write，把数据写入到文件中
3. 释放资源

#### 写出字节数据

1. 写出字节：`write(int b)`方法，每次可以写出一个字节数据

```java
public class FOSWrite {

    public static void main(String[] args) throws IOException {
        //使用文件名称创建流对象
        FileOutputStream fos=new FileOutputStream("fos.txt");
        //写出数据
        fos.write(97);
        fos.write(98);
        fos.write(99);
        //关闭资源
        fos.close();
    }
}
```

```java
public class FOSWrite {

    public static void main(String[] args) throws IOException {
        //使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        /**
         * 写出数据
         * - public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流
         * 如果写的第一个字节是正数（0-127），那么显示的时候会查询ASCII表
         * 如果写入的第一个字节是负数，那第一个字节会和第二个字节组成一个中文显示，查询系统默认编码表（GBK）
         */
        byte[] bytes={-97,-98,-99,100,69};
        fos.write(bytes);

        //关闭资源
        fos.close();
    }
}
``` 

#### 数据追加续写

- public FileOutputStream(File file,boolean append)：创建文件输出流以写入由指定的File对象表示的文件
- public FileOutputStream(String name,boolean append)：创建文件输出流以指定的名称写入文件



#### 写出换行

### 字节输入流【InputStream】

### FileInputStream类

#### 构造方法

#### 读取字节数据





