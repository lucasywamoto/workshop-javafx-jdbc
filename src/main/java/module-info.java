module com.cheftime.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cheftime.workshopjavafxjdbc to javafx.fxml;
    exports com.cheftime.workshopjavafxjdbc;
}