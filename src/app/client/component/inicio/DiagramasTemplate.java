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
public class DiagramasTemplate extends JPanel {

    private DiagramasComponent diagramasComponent;

    public DiagramasTemplate(DiagramasComponent diagramasComponent) {
        this.diagramasComponent = diagramasComponent;
        this.diagramasComponent.getClass();
        this.setSize(960, 640);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setVisible(true);
    }

}
