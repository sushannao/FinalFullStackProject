module com.example.fullstackproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fullstackproject to javafx.fxml;
    exports com.example.fullstackproject;
}