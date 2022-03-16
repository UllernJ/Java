package hiof.januj.oblig4.interfaces;
import hiof.januj.oblig4.models.Star;

import java.io.IOException;
import java.util.List;

public interface ObjectFileHandler<T extends Object> {
    void writeObjectsToFile(List<T> objetcs);
    List<T> readObjectsFromFile();
}
