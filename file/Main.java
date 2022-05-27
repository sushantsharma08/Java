import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Sushant Sharma");
        System.out.println("EN20CS301457");
        int ch;
        String text = "Hello java!";
        Path fileName = Path.of("file.txt");
        Files.writeString(fileName, text);
        String file_content = Files.readString(fileName);
        System.out.println(file_content);
        System.out.println();
        System.out.println("Reading File");
        System.out.println();
        FileReader fr = null;
        try {
            fr = new FileReader("file.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);
        fr.close();
    }
}