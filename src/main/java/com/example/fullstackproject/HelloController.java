package com.example.fullstackproject;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML private TableView<Student> studentTable;
    @FXML private TableColumn<Student, String> idColumn;
    @FXML private TableColumn<Student, String> firstNameColumn;
    @FXML private TableColumn<Student, String> lastNameColumn;
    @FXML private TableColumn<Student, String> departmentColumn;
    @FXML private TableColumn<Student, String> majorColumn;
    @FXML private TableColumn<Student, String> emailColumn;

    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField departmentField;
    @FXML private TextField majorField;
    @FXML private TextField emailField;
    @FXML private TextField imageUrlField;

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("major"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
    }

    @FXML
    private void handleAdd() {
        String id = String.valueOf(studentTable.getItems().size() + 1);
        Student student = new Student(
                id,
                firstNameField.getText(),
                lastNameField.getText(),
                departmentField.getText(),
                majorField.getText(),
                emailField.getText()
        );
        studentTable.getItems().add(student);
        handleClear();
    }

    @FXML
    private void handleDelete() {
        Student selected = studentTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            studentTable.getItems().remove(selected);
        }
    }

    @FXML
    private void handleEdit() {
        Student selected = studentTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.firstNameProperty().set(firstNameField.getText());
            selected.lastNameProperty().set(lastNameField.getText());
            selected.departmentProperty().set(departmentField.getText());
            selected.majorProperty().set(majorField.getText());
            selected.emailProperty().set(emailField.getText());
            studentTable.refresh();
            handleClear();
        }
    }

    @FXML
    private void handleClear() {
        firstNameField.clear();
        lastNameField.clear();
        departmentField.clear();
        majorField.clear();
        emailField.clear();
        imageUrlField.clear();
    }
}
