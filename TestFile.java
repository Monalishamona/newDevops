import java.nio.File.*;

public class TestFile{
public static void main(String[] args)
{
    File file = new File("C:\\Users\\mona\\Desktop\name.txt");
    FileReader reader = new FileReader(file);
    int character;
    while((character = reader.read())!=-1){
        System.out.print((char)character);
}reader.close();

   }
}