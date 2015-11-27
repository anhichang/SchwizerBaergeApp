package ch.fhnw.oop.PM;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by piotr on 27.11.15.
 */
public class MountainsPM {

    public static final String FILE_NAME = "mountains.csv";

    private static final String TAB = "\\t";

    private final StringProperty applicationTitle = new SimpleStringProperty("Schwizer Bärge App");

    private ObservableList<Mountains> mountains = FXCollections.observableArrayList();

    public MountainsPM(){
        mountains.addAll(readFromFile());
    }

    /*
    public void save() {
        try (BufferedWriter writer = Files.newBufferedWriter(getPath(FILE_NAME, true))) {
            writer.write("- die Headerzeile");
            writer.newLine();
            mountains.stream().forEach(resulat -> {
                try{
                    writer.write(mountains.);
                    writer.newLine();
                } catch (IOException e){
                    throw new IllegalStateException(e);
                }
            });
        } catch (IOException e){
            throw new IllegalStateException("save faile");
        }
    }
    */

    private List<Mountains> readFromFile() {
        try(Stream<String> stream = getStreamOfLines(FILE_NAME)){
            return stream.skip(1)
                    .map(s -> new Mountains(s.split(TAB))).collect(Collectors.toList());
        }
    }

    private Stream<String> getStreamOfLines(String fileName) {
        try {
            return Files.lines(getPath(fileName, true), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private Path getPath(String fileName, boolean locatedInSameFolder)  {
        try {
            if(!locatedInSameFolder) {
                fileName = "data/" + FILE_NAME;
            }
            return Paths.get(getClass().getResource(fileName).toURI());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String getApplicationTitle() {
        return applicationTitle.get();
    }

    public StringProperty applicationTitleProperty() {
        return applicationTitle;
    }

    public ObservableList<Mountains> getResulate() {
        return mountains;
    }

}
