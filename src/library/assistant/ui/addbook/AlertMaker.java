package library.assistant.ui.addbook;

import javafx.scene.control.Alert;

class AlertMaker {
   public static void showErrorMessage(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void showSimpleAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
