package com.example;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class mainSceneController {

    @FXML
    private TableColumn<Employee, String> cityCol;

    @FXML
    private TextField cityInput;

    @FXML
    private TableView<?> empTable;

    @FXML
    private TableColumn<Employee, Integer> idCol;

    @FXML
    private TextField idInput;

    @FXML
    private TableColumn<Employee, String> nameCol;

    @FXML
    private TextField nameInput;

    @FXML
    private TableColumn<Employee, Integer> salaryCol;

    @FXML
    private TextField salaryInput;

    @FXML
    void onClickAdd(ActionEvent event) {

    }

    @FXML
    void onClickDelete(ActionEvent event) {

    }

    @FXML
    void onClickEdit(ActionEvent event) {

    }

    @FXML
    void onClickSave(ActionEvent event) {

    }

    @FXML 
    void initialize(){
        System.out.println("start...");

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        EmployeeRepository repo = new EmployeeRepository();
        List<Employee> empList = repo.readEmployee();
    }

}
