    package ch.fhnw.oop.PM;

    import javafx.collections.FXCollections;
    import javafx.collections.ObservableList;
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
    * Created by scatman on 21.12.15.
    */

    public class KantonePM {
        private static final String FILE_NAME = "cantons.csv";

        private static final String TAB = "\\t";

        private final ObservableList<Kantone> resulate = FXCollections.observableArrayList();

        public KantonePM() {
            resulate.addAll(readFromFile());
        }

        private List<Kantone> readFromFile() {
            try (Stream<String> stream = getStreamOfLines(FILE_NAME)) {
                return stream.skip(1)
                        .map(s -> new Kantone(s.split(TAB)))
                        .collect(Collectors.toList());
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
                    fileName = "/" + fileName;
                }
                return Paths.get(getClass().getResource(fileName).toURI());
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(e);
            }
        }
        public ObservableList<Kantone> getResulate() {
            return resulate;
        }

    }



