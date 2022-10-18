import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        try {
            //file létrehozás
            File file = new File("filename.txt");
            if(file.createNewFile()){
                System.out.println("File created: "+ file.getName());
            }
            else System.out.println("Az állomány már létezik");

            //fileba írás
            FileWriter fw = new FileWriter("filename.txt", true); //true: bővít, false: ujra létrehozza mindig
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hungary");
            bw.newLine();
            bw.close();
            fw.close();

            //beolvasás
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();


            //törlés
            if(file.delete()){
                System.out.println("Az állomány törölve lett:" + file.getName());
            }
            else System.out.println("Nem sikerült törölni az állományt");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
