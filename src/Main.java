import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.collections.*;

public class Main extends Application {

    TableView<Student> table;

    @Override
    public void start(Stage primaryStage) {

// Menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getStyleClass().add("menu-bar-style");
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu themeMenu = new Menu("Theme");
        Menu helpMenu = new Menu("Help");
        menuBar.getMenus().addAll(fileMenu, editMenu, themeMenu, helpMenu);

// Profile picture
        ImageView profileImage = new ImageView(new Image("https://via.placeholder.com/100"));
        profileImage.setFitWidth(100);
        profileImage.setFitHeight(100);
        VBox profileBox = new VBox(profileImage);
        profileBox.setPadding(new Insets(10));
        profileBox.setAlignment(Pos.TOP_CENTER);
        profileBox.setStyle("-fx-background-color: #b17400;");

// TableView
        table = new TableView<>();
        table.setPlaceholder(new Label("No content in table"));

        TableColumn<Student, String> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Student, String> firstNameColumn = new TableColumn<>("First Name");
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Student, String> lastNameColumn = new TableColumn<>("Last Name");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Student, String> deptColumn = new TableColumn<>("Department");
        deptColumn.setCellValueFactory(new PropertyValueFactory<>("department"));

        TableColumn<Student, String> majorColumn = new TableColumn<>("Major");
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("major"));

        TableColumn<Student, String> emailColumn = new TableColumn<>("Email");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        table.getColumns().addAll(idColumn, firstNameColumn, lastNameColumn, deptColumn, majorColumn, emailColumn);

// Input boxes
        VBox inputBox = new VBox(10);
        inputBox.setPadding(new Insets(15));
        inputBox.setStyle("-fx-background-color: #66cc00;");

        TextField LastNameInput = new TextField();
        LastNameInput.setPromptText("Last Name");

        TextField DeptInput = new TextField();
        DeptInput.setPromptText("Department");

        TextField MajorInput = new TextField();
        MajorInput.setPromptText("Major");

        TextField EmailInput = new TextField();
        EmailInput.setPromptText("Email");

        TextField ImageInput = new TextField();
        ImageInput.setPromptText("imageURL");

        Button Clear = new Button("Clear");
        Button Add = new Button("Add");
        Button Delete = new Button("Delete");
        Button Edit = new Button("Edit");

        inputBox.getChildren().addAll(LastNameInput, DeptInput, MajorInput, EmailInput, ImageInput, Clear, Add, Delete, Edit);

        // Layout
        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setLeft(profileBox);
        layout.setCenter(table);
        layout.setRight(inputBox);

        Scene scene = new Scene(layout, 1000, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setTitle("FSC CSC325 — Full Stack Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}