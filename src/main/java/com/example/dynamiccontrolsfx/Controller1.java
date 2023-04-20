package com.example.dynamiccontrolsfx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Controller1 {
    @FXML
    private Label welcomeText;
    @FXML
    VBox boxReaders;

    @FXML
    protected void onHelloButtonClick() {
        ArrayList<Reader> readers = generateRandomReaders(7);
        outputReaders(readers);
    }

    public void outputReaders(ArrayList<Reader> readers)
    {
        boxReaders.getChildren().clear();
        for (Reader curReader : readers  ) {
            //System.out.println(curReader);
            Label rlab = new Label(curReader.toString());

            Button rbut = new Button("Нажми на "+curReader.fio);
            rbut.setOnAction(a -> readerButtonClicker(curReader));
            boxReaders.getChildren().add(rlab);
            boxReaders.getChildren().add(rbut);


        }
    }
    public ArrayList<Reader> generateRandomReaders(int amount)
    {
        ArrayList<Reader> readers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Reader reader = new Reader();
           // System.out.println(reader);
            readers.add(reader);
        }
        return readers;
    }

    public void readerButtonClicker(Reader r)
    {
        System.out.println("нажата кнопка для читателя "+r);

    }
}