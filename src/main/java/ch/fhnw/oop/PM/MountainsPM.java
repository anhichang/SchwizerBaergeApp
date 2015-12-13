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

    private final StringProperty greeting         = new SimpleStringProperty("Speichere");//aus PresentationModel eingefügt

    public static final String FILE_NAME = "mountains.csv";

    private static final String SEMICOLON = ";";

    private final StringProperty applicationTitle = new SimpleStringProperty("Schwizer Bärge App");

    private ObservableList<Mountains> mountains = FXCollections.observableArrayList();

    public MountainsPM(){
        mountains.addAll(readFromFile());
    }

    public void save() {
        try (BufferedWriter writer = Files.newBufferedWriter(getPath(FILE_NAME, true))) {
            writer.write("bergNr\tBergName\tbergHoehe\tbergGipfelArt\tbergGebiet\tbergKantone\tbergRegion\tbergDominanz\tbergDominanzGipfel\tbergScharte\tbergSchartenGipfel\tBildunterschrift");
            writer.newLine();
            mountains.stream().forEach(resultat -> {
                try {
                    writer.write(resultat.infoAsLine());
                    writer.newLine();
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            });
        } catch (IOException e) {
            throw new IllegalStateException("save failed");
        }
    }


    private List<Mountains> readFromFile() {
        try(Stream<String> stream = getStreamOfLines(FILE_NAME)){
            return stream.skip(1)
                    .map(s -> new Mountains(s.split(SEMICOLON))).collect(Collectors.toList());
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
                fileName = "/" + FILE_NAME ;
            }
            else{
                fileName = "data/" + FILE_NAME ;
            }
            return Paths.get(getClass().getClassLoader().getResource(fileName).toURI());

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

    public ObservableList<Mountains> getResultate() {
        return mountains;
    }

    public StringProperty greetingProperty() {   //aus PresentationModel eingefügt
        return greeting;
    }

}
