
import java.io.*;
public class ReadData {
    public static void main(String[] args){
        try{
FileInputStream fs = new FileInputStream("File.txt");
int i;
while((i = fs.read())!= -1){
    System.out.print((char)i);
}
fs.close();
        }
        catch(IOException e){
            System.out.print(e);
        }

    }
}
