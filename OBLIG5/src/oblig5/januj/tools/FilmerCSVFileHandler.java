package oblig5.januj.tools;
import oblig5.januj.interfaces.ObjectFileHandler;
import oblig5.januj.models.Film;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmerCSVFileHandler implements ObjectFileHandler<Film> {
    List<Film> filmer = new ArrayList<>();
    public void writeObjectsToFile(Film...filmer) {
        writeObjectsToFile(Arrays.asList(filmer));
    }

    @Override
    public void writeObjectsToFile(List<Film> objects) {
        try(BufferedWriter write = new BufferedWriter(new FileWriter("src/oblig5/januj/tools/data.csv", true))) {
            for(Film film : objects) {
                write.write(film.serializer());
                write.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Film> readObjectsFromFile() {
        List<Film>filmer = new ArrayList<>();
        try {
            File myData = new File("src/oblig5/januj/tools/data.csv");
            Scanner read = new Scanner(myData);
            while(read.hasNextLine()) {
                String data = read.nextLine();
                String[] k = data.split(",");
                String navn = k[0];
                double rating = Double.valueOf(k[1]);
                String sjanger = k[2];
                Film film = new Film(navn, rating, sjanger);
                filmer.add(film);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return filmer;
    }
    }

