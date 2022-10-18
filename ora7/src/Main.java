import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Person> szemelyek = new ArrayList<Person>();

            //beolvasás
            File file = new File("szemely.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                Scanner lineReader = new Scanner(reader.nextLine());
                lineReader.useDelimiter(";");
                String name = lineReader.next();
                Integer age = lineReader.nextInt();
                Double weight = lineReader.nextDouble();
                Integer height = lineReader.nextInt();
                szemelyek.add(new Person(name, age, weight, height));
            }
            reader.close();
            System.out.println(szemelyek);

            //sortby
            Comparator<Person> compare = Comparator.comparing(Person::getKor).thenComparing(Person::getTestsuly);
            szemelyek.sort(compare);
            System.out.println("\n" + szemelyek);


            //átlagkor, átlagsúly, átlagmagasság
            Double avgKor=0.0;
            for(Person p:szemelyek){
                avgKor /= szemelyek.size();
            }
            System.out.println(avgKor);

            //kiírás fájlba
            
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
