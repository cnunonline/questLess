package xx_personal.questless.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import xx_personal.questless.Launcher;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class FxmlHandler {
    private static URL findFXML(String name) {
        URL fxmlURL = Launcher.class.getResource("view/" + name);
        if (fxmlURL == null)
            ExceptionHandler.handleFileNotFound(new FileNotFoundException(name));
        return fxmlURL;
    }

    private static Parent loadFXML(URL url) {
        FXMLLoader loader = new FXMLLoader(url);
        Parent root = null;
        try {
            root = loader.load();
            if (root == null)
                throw new IOException(url.toString());
        } catch (IOException e) {
            ExceptionHandler.handleIOException(e);
        }
        return root;
    }

    public static Scene loadScene(String name) {
        URL url = findFXML(name);
        Parent root = loadFXML(url);
        return new Scene(root);
    }
}
