module Monopoly {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;

    opens monopoly.ui.custom_node;
    opens monopoly.ui.scene_controllers;
    opens monopoly.ui;
}