import java.nio.File.*;
import java.io.IOException;
public class FilesUtility{
public static void main(String[] args)
{
    try{
 Path sourcePath = Path.get("C:\Users\mona\Desktop\name.txt");
 Path targetPath = Path.get("name.txt");
Files.copy(sourcePath, targetPath,StandardCopyOption.REPLACE_EXISTING);
System.out.println("File copies successfully");

 Path filePath = Path.get("text.txt");
String data = "Hello, this is s  string";
byte[] bytes = data.getBytes();
Files.write(filePath,bytes,StandardOpenOption.CREATE,StandardOpenOption.TRUNCATE_EXISTING);
System.out.println("Data written");

 byte[] readBytes = Files.readAllBytes(filePath);
String readData = new String(readBytes);
System.out.println("Read data from the file: " + readData);
}catch(IOException e){
System.out.println("Error: " + e.getMessage());
}
   }
}