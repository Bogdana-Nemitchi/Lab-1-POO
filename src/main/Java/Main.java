import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        String Nume_fisier = "src/main/Resources/text.txt" ;

        try{
            File file = new File(Nume_fisier);
            Scanner scan = new Scanner (file);
            while(scan.hasNextLine()){
                list1.add(scan.nextLine());
            }
            scan.close();

        } catch (FileNotFoundException e){
            System.out.println("Fisierul nu se deschide");
        }


        for(String nume : list1){
            System.out.println(nume);
        }

        System.out.println();

        //stream
        list1.stream ()
                .filter (nume -> nume.length() > 14)
                .map (nume ->nume.toUpperCase())
                .forEach (nume-> System.out.println(nume));

    }
}