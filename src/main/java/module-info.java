module estructuras.emojimaker {
    requires javafx.controls;
    requires javafx.fxml;

    opens estructuras.emojimaker to javafx.fxml;
    exports estructuras.emojimaker;
}
