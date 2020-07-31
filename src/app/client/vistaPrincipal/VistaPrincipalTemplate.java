/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.vistaPrincipal;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author AndresFWilT
 */
public class VistaPrincipalTemplate extends JFrame {

    private static final long serialVersionUID = 8914150529633029064L;

    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    private VistaPrincipalComponent vistaPrincipalComponent;

    private JPanel pRecientes, pNavegacion, pPrincipal;

    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent) {
        super("Vista Principal");
        this.setResizable(false);
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        crearJPanels();
        //getContentPane().setBackground(sRecursos.getColorNaranja());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 1360, 760);
        //setSize(1360, 660);
        System.out.println(screenSize.width + " " + screenSize.height);
        setLocationRelativeTo(this);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);

    }

    public void crearJPanels() {
        pRecientes = sObjGraficos.construirJPanel(0, 0, 400, 760, null, null);
        this.add(pRecientes);

        pNavegacion = sObjGraficos.construirJPanel(400, 0, 960, 120, null, null);
        this.add(pNavegacion);

        pPrincipal = sObjGraficos.construirJPanel(400, 120, 960, 640, null, null);
        this.add(pPrincipal);
    }

    public JPanel getPRecientes() {
        return pRecientes;
    }

    public JPanel getPPrincipal() {
        return pPrincipal;
    }

    public JPanel getPNavegacion() {
        return pNavegacion;
    }

    public void saludar() {
        String mensaje = "Hola mundo";
        System.out.println(mensaje);
    }

}
