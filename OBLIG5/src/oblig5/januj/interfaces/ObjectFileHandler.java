package oblig5.januj.interfaces;
import java.io.IOException;
import java.util.List;

public interface ObjectFileHandler<T extends Object> {
    void writeObjectsToFile(List<T> objetcs);
    List<T> readObjectsFromFile();
}
