# IO��

## IO�ķ���

�������ݵ������Ϊ���������������

- �������������ݴ������豸�϶�ȡ���ڴ��е���
- ������������ݴ��ڴ�д���������豸�ϵ���

�������ݵ����ͷ�Ϊ���ֽ������ַ���

## �����ĸ���

|  | ������ | ����� |
| --- | --- | --- |
| �ֽ��� | �ֽ������� InputStream | �ֽ������ OutputStream |
| �ַ��� | �ַ������� Reader | �ַ������ Writer |

## �ֽ���

### һ�н�Ϊ�ֽ�

һ���ļ����ݣ��ı���ͼƬ����Ƶ�ȣ��ڴ洢ʱ�������Զ��������ֵ���ʽ���棬��һ��һ���ֽڣ���ô����ʱҲ����˵ġ����ԣ��ֽ������Դ��������ļ����ݡ��ڲ�������ʱ������ʹ��ʲô���������󣬵ײ㴫���ʼ��Ϊ����������

### �ֽ��������OutputStream��

java.io.OutputStream�������Ǳ�ʾ�ֽ��������������ĳ��࣬��ָ�����ֽ���Ϣд����Ŀ�ĵء��������ֽ�������Ļ������Թ��ܷ�����

- public void close()���رմ���������ͷ������������κ�ϵͳ��Դ
- public void flush()��ˢ�´��������ǿ���κλ��������ֽڱ�д��
- public void write(byte[] b)����b.length�ֽڴ�ָ�����ֽ�����д��������
- public void write(byte[] b,int off,int len)����ָ�����ֽ�����д��len�ֽڣ���ƫ����off��ʼ������������
- public abstract void write(int b)����ָ�����ֽ������

### FileOutputStream��

#### ���췽��

- FileOutputStream(String name)������һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ���
- FileOutputStream(File file)������һ����ָ��File�����ʾ���ļ���д�����ݵ��ļ������

������
- String name��Ŀ�ĵ���һ���ļ���·��
- File file��Ŀ�ĵ���һ���ļ�

���췽�������ã�
1. ����һ��FileOutputStream����
2. ���ݹ��췽���д��ݵ��ļ�/�ļ�·��������һ���յ��ļ�
3. ���FileOutputStream����ָ�򴴽��õ��ļ�


�ֽ��������ʹ�ò��裺

1. ����һ��FileOutputStream���󣬹��췽���д���д�����ݵ�Ŀ�ĵ�
2. ����FileOutputStream�����еķ���write��������д�뵽�ļ���
3. �ͷ���Դ

#### д���ֽ�����

1. д���ֽڣ�`write(int b)`������ÿ�ο���д��һ���ֽ�����

```java
public class FOSWrite {

    public static void main(String[] args) throws IOException {
        //ʹ���ļ����ƴ���������
        FileOutputStream fos=new FileOutputStream("fos.txt");
        //д������
        fos.write(97);
        fos.write(98);
        fos.write(99);
        //�ر���Դ
        fos.close();
    }
}
```

```java
public class FOSWrite {

    public static void main(String[] args) throws IOException {
        //ʹ���ļ����ƴ���������
        FileOutputStream fos = new FileOutputStream("fos.txt");
        /**
         * д������
         * - public void write(byte[] b)����b.length�ֽڴ�ָ�����ֽ�����д��������
         * ���д�ĵ�һ���ֽ���������0-127������ô��ʾ��ʱ����ѯASCII��
         * ���д��ĵ�һ���ֽ��Ǹ������ǵ�һ���ֽڻ�͵ڶ����ֽ����һ��������ʾ����ѯϵͳĬ�ϱ����GBK��
         */
        byte[] bytes={-97,-98,-99,100,69};
        fos.write(bytes);

        //�ر���Դ
        fos.close();
    }
}
```

#### ����׷����д

- public FileOutputStream(File file,boolean append)�������ļ��������д����ָ����File�����ʾ���ļ�
- public FileOutputStream(String name,boolean append)�������ļ��������ָ��������д���ļ�

���������췽���������ж���Ҫ����һ��`boolean`���͵�ֵ��`true`��ʾ׷�����ݣ�`false`��ʾ���ԭ�����ݡ�������������������󣬾Ϳ���ָ���Ƿ�׷����д��

~~~java
public class FOSWrite {

    public static void main(String[] args) throws IOException {
        //ʹ���ļ����ƴ���������
        FileOutputStream fos = new FileOutputStream("fos.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("abcde".getBytes());
        }
        //�ر���Դ
        fos.close();
    }
}
~~~

### �ֽ���������InputStream��

java.io.InputStream������ʱ��ʾ�ֽ���������������ĳ��࣬���Զ�ȡ�ֽ���Ϣ���ڴ��С����������ֽ��������Ļ������Թ��ܷ���
- public void close()���رմ����������ͷŴ�����������κ�ϵͳ��Դ
- public abstract int read()������������ȡ���ݵ���һ���ֽ�
- public int read(byte[] bytes)������������ȡһЩ�ֽ������������Ǵ洢���ֽ�����bytes��

close��������������Ĳ���ʱ��������ôη������ͷ�ϵͳ��Դ

### FileInputStream��

java.io.FileInputStream�����ļ������������ļ��ж�ȡ�ֽ�

#### ���췽��

- FileInputStream(File file)��ͨ������ʵ���ļ�������������һ��FileInputStream�����ļ����ļ�ϵͳ�е�File����file����
- FileInputStream(String name)��ͨ������ʵ���ļ�������������һ��FileInputStream�����ļ����ļ�ϵͳ�е�·����name����

#### ��ȡ�ֽ�����





