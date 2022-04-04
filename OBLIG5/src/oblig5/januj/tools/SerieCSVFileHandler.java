package oblig5.januj.tools;
import oblig5.januj.interfaces.ObjectFileHandler;
import oblig5.januj.models.Serie;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SerieCSVFileHandler implements ObjectFileHandler<Serie> {
    List<Serie> filmer = new ArrayList<>();

    public void writeObjectsToFile(Serie... serier) {
        writeObjectsToFile(Arrays.asList(serier));
    }

    @Override
    public void writeObjectsToFile(List<Serie> objects) {
        try (BufferedWriter write = new BufferedWriter(new FileWriter("src/oblig5/januj/tools/serier.csv", true))) {
            for (Serie serier : objects) {
                write.write(serier.serializer());
                write.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Serie> readObjectsFromFile() {
        List<Serie> serier = new ArrayList<>();
        try {
            File myData = new File("src/oblig5/januj/tools/serier.csv");
            Scanner read = new Scanner(myData);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                String[] k = data.split(",");
                String navn = k[0];
                double rating = Double.valueOf(k[1]);
                String sjanger = k[2];
                String utgivelsesdato = k[3];
                int antallEpisoder = Integer.parseInt(k[4]);
                Serie serie = new Serie(navn, rating, sjanger, utgivelsesdato, antallEpisoder);
                serier.add(serie);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return serier;
    }
}
