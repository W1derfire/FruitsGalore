package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.ArrayList;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;


public class Controller {

    //public ComboBox box;
    public Button button;
    public TableView <Fruits> table;
    public Button addFruitButton;
    //public Button goAwayButton;

    public TableColumn col1;
    public TableColumn col2;
    public TableColumn col3;
    public TableColumn col4;
    public TableColumn col5;
    public TableColumn col6;
    public TableColumn col7;
    public TableColumn col8;
    public TableColumn col9;
    public TableColumn col10;
    public TableColumn col11;
    public TableColumn col12;
    public TableColumn col13;
    public TableColumn col14;


    public void initialize(){



        Fruits.readFruits();

        col1.setCellValueFactory(new PropertyValueFactory<Fruits, String>("name"));

        col1.setCellFactory(TextFieldTableCell.forTableColumn());
        col1.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, String>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, String> t) {
                        ((Fruits) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
                    }
                }
        );


        col2.setCellValueFactory(new PropertyValueFactory<>("servingSize"));

        col2.setCellFactory(TextFieldTableCell.forTableColumn());
        col2.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, String>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, String> t) {
                        ((Fruits) t.getTableView().getItems().get(t.getTablePosition().getRow())).setServingSize(t.getNewValue());
                    }
                }
        );

        col3.setCellValueFactory(new PropertyValueFactory<>("calories"));

        col3.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col3.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setCalories(t.getNewValue());
                    }
                }
        );

                col4.setCellValueFactory(new PropertyValueFactory<>("totalFat"));

        col4.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
        col4.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Double>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Double> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setTotalFat(t.getNewValue());
                    }
                }
        );

                col5.setCellValueFactory(new PropertyValueFactory<>("sodium"));

        col5.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col5.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setSodium(t.getNewValue());
                    }
                }
        );

                col6.setCellValueFactory(new PropertyValueFactory<>("carbs"));

        col6.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col6.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setCarbs(t.getNewValue());
                    }
                }
        );
                col7.setCellValueFactory(new PropertyValueFactory<>("potassium"));

        col7.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col7.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setPotassium(t.getNewValue());
                    }
                }
        );

                col8.setCellValueFactory(new PropertyValueFactory<>("fiber"));

        col8.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col8.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setFiber(t.getNewValue());
                    }
                }
        );

                col9.setCellValueFactory(new PropertyValueFactory<>("sugar"));

        col9.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col9.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setSugar(t.getNewValue());
                    }
                }
        );

                col10.setCellValueFactory(new PropertyValueFactory<>("protein"));

        col10.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col10.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setProtein(t.getNewValue());
                    }
                }
        );

                col11.setCellValueFactory(new PropertyValueFactory<>("vitaminA"));

        col11.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col11.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setVitaminA(t.getNewValue());
                    }
                }
        );

                col12.setCellValueFactory(new PropertyValueFactory<>("vitaminC"));

        col12.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col12.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setVitaminC(t.getNewValue());
                    }
                }
        );

                col13.setCellValueFactory(new PropertyValueFactory<>("calcium"));

        col13.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col13.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setCalcium(t.getNewValue());
                    }
                }
        );

                col14.setCellValueFactory(new PropertyValueFactory<>("iron"));

        col14.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        col14.setOnEditCommit(
                new EventHandler<CellEditEvent<Fruits, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Fruits, Integer> t) {
                        ((Fruits) t.getTableView().getItems().get( t.getTablePosition().getRow())).setIron(t.getNewValue());
                    }
                }
        );


                table.setItems(Fruits.getFruitList());
                table.setEditable(true);


                table.setEditable(true);
                table.getSelectionModel().cellSelectionEnabledProperty().set(true);




    }

    public void addRow() {
        // Update model
        System.out.println("This is happening!");
        Fruits.addEmptyFruit();
        // Update status
        //statusLabel.setText("Added empty album.  Go ahead and edit its data.");
    }



}
