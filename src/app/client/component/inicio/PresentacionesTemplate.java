/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component.inicio;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author ssrs_
 */
public class PresentacionesTemplate extends JPanel {

    private PresentacionesComponent presentacionesComponent;

    public PresentacionesTemplate(PresentacionesComponent presentacionesComponent) {
        this.presentacionesComponent = presentacionesComponent;
        this.presentacionesComponent.getClass();
        this.setSize(960, 640);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
    }
}
