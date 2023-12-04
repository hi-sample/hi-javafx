module net.hifor.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.hifor.demo to javafx.fxml;
    exports net.hifor.demo;
}