package de.gui;

import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame{

    public Fenster() throws HeadlessException {

        setSize(300,300);

        addWindowListener(new MyWindowListener());
        Button button = new Button("Drück mich");
        button.addActionListener(e->ausgabe());
        add(button);
    }

    public static void main(String[] args) {
        new Fenster().setVisible(true);
    }

    private void ausgabe() {
        System.out.println("Button wurde gedrueckt");
    }

    private void beenden() {
        // Daten speichern;
        dispose();
    }

    class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(final WindowEvent e) {
            beenden();
        }
    }

//    class MyActionListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(final ActionEvent e) {
//            ausgabe();
//        }
//    }
}
