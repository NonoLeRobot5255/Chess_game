module chess.ia {
    requires javafx.controls;
    requires javafx.fxml;

    opens chess.ia to javafx.fxml;
    exports chess.ia;
}
