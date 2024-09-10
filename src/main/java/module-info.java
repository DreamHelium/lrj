module cn.dh.lrj {
    requires javafx.controls;
    requires javafx.fxml;


    opens cn.dh.lrj to javafx.fxml;
    exports cn.dh.lrj;
}