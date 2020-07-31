/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ssrs_
 */
public class NavegacionEstilosComponent implements ActionListener {

    private NavegacionEstilosTemplate barraTituloTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;

    public NavegacionEstilosComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        barraTituloTemplate = new NavegacionEstilosTemplate(this);
        this.vistaPrincipalComponent = vistaPrincipalComponent;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand().trim());
        vistaPrincipalComponent.mostrarComponente(ae.getActionCommand().trim());

    }

    public NavegacionEstilosTemplate getBattaTituloTemplate() {
        return barraTituloTemplate;
    }
}
