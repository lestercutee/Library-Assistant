package library.assistant.util;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LibraryAssistantUtil {

    public static final String ICON_IMAGE_LOC = "/library/assistant/ui/icons/icon.png";

    public static void setStageIcon(Stage stage) {
        stage.getIcons().add(new Image(ICON_IMAGE_LOC));
    }

}
