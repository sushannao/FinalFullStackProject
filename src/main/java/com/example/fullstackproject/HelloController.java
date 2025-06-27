package com.example.fullstackproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> idColumn;

    @FXML
    private TableColumn<Student, String> firstNameColumn;

    @FXML
    private TableColumn<Student, String> lastNameColumn;

    @FXML
    private TableColumn<Student, String> departmentColumn;

    @FXML
    private TableColumn<Student, String> majorColumn;

    @FXML
    private TableColumn<Student, String> emailColumn;

// Propert values
    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("Department"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("Major"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("Email"));
    }
}
