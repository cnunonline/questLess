module xx_personal.questless {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens xx_personal.questless to javafx.fxml;
    opens xx_personal.questless.controller to javafx.fxml;
    exports xx_personal.questless;
}