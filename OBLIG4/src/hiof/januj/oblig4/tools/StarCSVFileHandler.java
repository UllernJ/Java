package hiof.januj.oblig4.tools;
import hiof.januj.oblig4.interfaces.ObjectFileHandler;
import hiof.januj.oblig4.models.Star;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StarCSVFileHandler implements ObjectFileHandler<Star> {
    public void writeObjectsToFile(Star...stars) {
        writeObjectsToFile(Arrays.asList(stars));
    }

    @Override
    public void writeObjectsToFile(List<Star> objects) {
        try(BufferedWriter write = new BufferedWriter(new FileWriter("src/hiof/januj/oblig4/tools/data.csv"))) {
            for(Star star : objects) {
                write.write(star.serializer());
                write.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Star> readObjectsFromFile() {
        List<Star>stjerner = new ArrayList<>();
        try {
            File myData = new File("src/hiof/januj/oblig4/tools/data.csv");
            Scanner read = new Scanner(myData);
            while(read.hasNextLine()) {
                String data = read.nextLine();
                String[] k = data.split(",");
                String navn = k[0];
                double radius = Double.valueOf(k[1]);
                double masse = Double.valueOf(k[2]);
                double effectiveTemp = Double.valueOf(k[3]);
                Star star = new Star(navn,  radius,  masse,  effectiveTemp);
                stjerner.add(star);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stjerner;
    }

}
