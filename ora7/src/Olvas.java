import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Olvas {
    public static void main(String[] args) {
        if(args.length > 1){
            System.out.println("A beolvasandó fájl nevét adja meg!");
            return;
        }
        File file = new File("teszt.txt");
        try{
            Scanner olvas = new Scanner(file);
            while (olvas.hasNextLine()){
                Scanner sorOlvas = new Scanner(olvas.nextLine());
                sorOlvas.useDelimiter(";");
                if(sorOlvas.nextLine().equals("A")){
                    String faj = sorOlvas.next();
                    String eletter = sorOlvas.next();
                    boolean novenyevo = false;
                    if(sorOlvas.hasNext()){
                        if(sorOlvas.next().equals("N")){
                            novenyevo = true;
                        }
                    }
                    System.out.println(faj +" "+ eletter+" "+novenyevo);
                }
                else {
                    String faj;
                    boolean novenyevo = false;
                    if(sorOlvas.hasNext()){
                        if(sorOlvas.next().equals("N")){
                            novenyevo=true;
                        }
                    }
                    Double testhossz = sorOlvas.nextDouble();
                    Integer hossz = sorOlvas.nextInt();

                }


            }
        }catch (IOException e){
            System.out.println("Nincs ilyen állomány");
            return;
        }
    }
}
