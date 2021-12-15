module com.cotrip.cotripjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cotrip.cotripjfx to javafx.fxml;
    exports com.cotrip.cotripjfx;
}