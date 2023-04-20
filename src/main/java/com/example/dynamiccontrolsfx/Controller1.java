package com.example.dynamiccontrolsfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller1 {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        ArrayList<Reader> readers = generateRandomReaders(10);
        outputReaders(readers);
    }

    public void outputReaders(ArrayList<Reader> readers)
    {
        for (Reader r : readers  ) {
            System.out.println(r);
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
}