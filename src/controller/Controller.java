/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JRadioButton;
import model.DolgozokModel;
import view.DolgozokView;

/**
 *
 * @author g
 */
public class Controller {
    private DolgozokModel model;
    private DolgozokView view;

    public Controller() throws IOException {
        this.model = new DolgozokModel();
        this.view = new DolgozokView();
        this.view.addRadioBtListeners(new NemValasztasListener());
    }
    public class NemValasztasListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JRadioButton rGomb =  (JRadioButton) e.getSource();
            String nem = rGomb.getText().equals("fiú") ? "F" : "L";
            view.setLegidosebb(model.legidosebb(nem));
            view.setOsszesKor(model.osszes(nem));
            view.setHatEve(model.hatEve(nem));
        }
    
    }
    
}
