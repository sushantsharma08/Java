import java.io.FileOutputStream;
public class outputStream{
public static void main(String[] args) {
    try {
        FileOutputStream fout = new FileOutputStream("E:\\hello.txt");
        // String i="hello java";
        // byte b[]= i.getBytes();
        fout.write(65);
        fout.close();
           } catch (Exception e) {
        System.out.println(e);
    }
}
}