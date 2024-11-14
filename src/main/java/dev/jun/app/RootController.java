package dev.jun.app;

import javafx.scene.control.TableView;

import dev.jun.Models.Employee;
import dev.sol.core.application.FXController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TreeTableView;

public class RootController extends FXController{
    @FXML
    private TreeTableView<Employee> employeeTable;

    @FXML
    private TableColumn<String, Employee> empIdColumn;
    @FXML
    private TableColumn<String, Employee> empFirstnameColumn;
    @FXML
    private TableColumn<String, Employee> empLastnameColumn;
    @FXML
    private TableColumn<String, Employee> empJobColumn;
    @FXML
    private TableColumn<String, Employee> empManagerColumn;
    @FXML
    private TableColumn<String,Employee> empDepartmentColumn;


    private ObservableList<Employee> employee_department;
    private ObservableList<Employee> employee_masterlist;


    @Override
    protected void load_bindings() {
        employee_masterlist = FXCollections.observableArrayList();
      
    }

    @Override
    protected void load_fields() {
     
        
    }

    @Override
    protected void load_listeners() {
      
        
    }
    
    
}
