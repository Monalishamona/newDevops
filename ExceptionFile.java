import java.io.*;
public class ExceptionFile{
   public static void findFile() throws IOException{
     File newFile= new File("test.java");
     FileInputStream stream = new FileInputStream(newFile);
}
public static void main(String[] args){
try{
    findFile();

}
catch (IOException e){
   System.out.println(e);
}
}
}