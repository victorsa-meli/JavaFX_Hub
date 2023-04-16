module com.exercicios.treinos {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;

    opens com.exercicios.treinos to javafx.fxml;
    exports com.exercicios.treinos;
}