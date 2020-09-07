# ������ ���Լ�

## 5.1 ����

`java.util.Properties ` �̳���` Hashtable` ������ʾһ���־õ����Լ�����ʹ�ü�ֵ�ṹ�洢���ݣ�ÿ���������Ӧֵ����һ���ַ���������Ҳ�����Java��ʹ�ã������ȡϵͳ����ʱ��`System.getProperties` �������Ƿ���һ��`Properties`����

## 5.2 Properties��

### ���췽��

- `public Properties()` :����һ���յ������б�

### �����Ĵ洢����

- `public Object setProperty(String key, String value)` �� ����һ�����ԡ�  
- `public String getProperty(String key) ` ��ʹ�ô������б���ָ���ļ���������ֵ��
- `public Set<String> stringPropertyNames() ` �����м������Ƶļ��ϡ�

```java
public class ProDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // �������Լ�����
        Properties properties = new Properties();
        // ��Ӽ�ֵ��Ԫ��
        properties.setProperty("filename", "a.txt");
        properties.setProperty("length", "209385038");
        properties.setProperty("location", "D:\\a.txt");
        // ��ӡ���Լ�����
        System.out.println(properties);
        // ͨ����,��ȡ����ֵ
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));

        // �������Լ�,��ȡ���м��ļ���
        Set<String> strings = properties.stringPropertyNames();
        // ��ӡ��ֵ��
        for (String key : strings ) {
          	System.out.println(key+" -- "+properties.getProperty(key));
        }
    }
}
��������
{filename=a.txt, length=209385038, location=D:\a.txt}
a.txt
209385038
D:\a.txt
filename -- a.txt
length -- 209385038
location -- D:\a.txt
```

### ������صķ���

- `public void load(InputStream inStream)`�� ���ֽ��������ж�ȡ��ֵ�ԡ� 

������ʹ�����ֽ���������ͨ�������󣬿��Թ�����ĳ�ļ��ϣ��������ܹ������ı��е������ˡ��ı����ݸ�ʽ:

```
filename=a.txt
length=209385038
location=D:\a.txt
```

���ش�����ʾ��

```java
public class ProDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        // �������Լ�����
        Properties pro = new Properties();
        // �����ı�����Ϣ�����Լ�
        pro.load(new FileInputStream("read.txt"));
        // �������ϲ���ӡ
        Set<String> strings = pro.stringPropertyNames();
        for (String key : strings ) {
          	System.out.println(key+" -- "+pro.getProperty(key));
        }
     }
}
```

> С��ʿ���ı��е����ݣ������Ǽ�ֵ����ʽ������ʹ�ÿո񡢵Ⱥš�ð�ŵȷ��ŷָ���