/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ssrs_
 */
public class NavegacionEstilosTemplate extends JPanel {

    private NavegacionEstilosComponent navegacionEstilosComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private JPanel pDerecha, pIzquierda;
    private JLabel ILogoApp, IBusquedasApp, lIconoUsuario, lNombreUsusario;
    private JButton bCerrar;
    private JTextField tBuscar;
    private ImageIcon iLogoApp, iDimAux, iFondo, iLogo, iUsuario, iClave, iOnedrive;
    private Font fontTituloBarra;
    private JButton bPresentaciones, bTemas, bEducacion, bGraficos, bDiagramas, bEmpresa, bInfografia, bCCuenta;

    public NavegacionEstilosTemplate(NavegacionEstilosComponent navegacionEstilosComponent) {
        this.navegacionEstilosComponent = navegacionEstilosComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        this.crearJPanels();
        this.crearObjetosDecoradores();
        this.crearJTexts();
        this.crearJButtons();
        this.crearJLabels();
        this.setSize(960, 120);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setVisible(true);

    }

    public void crearObjetosDecoradores() {
        iFondo = new ImageIcon("src/resources/Fondo.jpg");
        iLogo = new ImageIcon("src/resources/Logo.jpg");
        iUsuario = new ImageIcon("src/resources/usuario.jpg");
        iClave = new ImageIcon("src/resources/Clave.jpg");
        iOnedrive = new ImageIcon("src/resources/OneDrive.png");
        iLogoApp = new ImageIcon("src/resources/Logo.jpg");
        fontTituloBarra = new Font("Britanic Bold", Font.PLAIN, 15);
    }

    public void crearJPanels() {

        this.pIzquierda = sObjGraficos.construirJPanel(
                0, 0, 760, 300, sRecursos.getColorNaranja(), null
        );
        this.add(pIzquierda);

        this.pDerecha = sObjGraficos.construirJPanel(
                760, 0, 200, 300, sRecursos.getColorNaranja(), null
        );
        this.add(pDerecha);
    }

    public void crearJTexts() {
        this.tBuscar = sObjGraficos.construirJTextField(
                "Buscar plantillas y temas en linea", 10, 45,
                680, 25, Color.WHITE, Color.BLACK, Color.BLACK, null,
                null, "c");
        this.pIzquierda.add(tBuscar);
    }

    private void crearJLabels() {
        // LABEL ICONO USUARIO--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iUsuario.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)
        );
        lIconoUsuario = sObjGraficos.construirJLabel(
                null, 140, 50, 50, 50, iDimAux, null, null, null, "c"
        );
        this.pDerecha.add(lIconoUsuario);

        // LABEL NOMBER USUARIO--------------------------------------------------------------------
        this.lNombreUsusario = sObjGraficos.construirJLabel(
                "<html><div align='center'> Sergio Ramirez</div></html>",
                10, 50, 120, 40, null, Color.WHITE, null, sRecursos.getFontBuscar(), "c"
        );
        this.pDerecha.add(lNombreUsusario);

        //LABEL BUSQUEDAS-----------------------------------------------------------------------------
        IBusquedasApp = sObjGraficos.construirJLabel(
                "Busquedas recomendadas:", 10, 70, 150, 40, null, sRecursos.getColorGrisOscuro(),
                null, sRecursos.getFontBuscar(), "c"
        );
        this.pIzquierda.add(IBusquedasApp);

    }

    public void crearJButtons() {

        // BOTÓN PRESENTACIONES--------------------------------------------------------------------
        this.bPresentaciones = sObjGraficos.construirJButton(
                "Presentaciones", 170, 70, 100, 40, sRecursos.getCMano(),
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bPresentaciones.addActionListener(navegacionEstilosComponent);
        this.pIzquierda.add(bPresentaciones);

        // BOTÓN TEMAS--------------------------------------------------------------------
        this.bTemas = sObjGraficos.construirJButton(
                "Temas", 270, 70, 100, 40, sRecursos.getCMano(),
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bTemas.addActionListener(navegacionEstilosComponent);
        this.pIzquierda.add(bTemas);

        // BOTÓN EDUCACION--------------------------------------------------------------------
        this.bEducacion = sObjGraficos.construirJButton(
                "Educacion", 350, 70, 100, 40, sRecursos.getCMano(),
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bEducacion.addActionListener(navegacionEstilosComponent);
        this.pIzquierda.add(bEducacion);

        // BOTÓN GRAFICOS--------------------------------------------------------------------
        this.bGraficos = sObjGraficos.construirJButton(
                "Graficos", 420, 70, 100, 40, sRecursos.getCMano(),
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bGraficos.addActionListener(navegacionEstilosComponent);
        this.pIzquierda.add(bGraficos);

        // BOTÓN Diagramas--------------------------------------------------------------------
        this.bDiagramas = sObjGraficos.construirJButton(
                "Diagramas", 510, 70, 100, 40, sRecursos.getCMano(),
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bDiagramas.addActionListener(navegacionEstilosComponent);
        this.pIzquierda.add(bDiagramas);

        // BOTÓN EMPRESA--------------------------------------------------------------------
        this.bEmpresa = sObjGraficos.construirJButton(
                "Empresa", 600, 70, 100, 40, sRecursos.getCMano(),
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bEmpresa.addActionListener(navegacionEstilosComponent);
        this.pIzquierda.add(bEmpresa);

        // BOTÓN INFOGRAFIA--------------------------------------------------------------------
        this.bInfografia = sObjGraficos.construirJButton(
                "Infografia", 700, 70, 100, 40, sRecursos.getCMano(),
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bInfografia.addActionListener(navegacionEstilosComponent);
        this.pIzquierda.add(bInfografia);

        // BOTÓN CERRAR SESION--------------------------------------------------------------------
        this.bCCuenta = sObjGraficos.construirJButton(
                "Cambiar de cuenta", 25, 70, 120, 40, sRecursos.getCMano(),
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bCCuenta.addActionListener(navegacionEstilosComponent);
        this.pDerecha.add(bCCuenta);

        // BOTÓN CERRAR--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                sRecursos.getIcerrar().getImage().getScaledInstance(
                        23, 23, Image.SCALE_AREA_AVERAGING));
        bCerrar = sObjGraficos.construirJButton("", 155, 5, 45, 30, sRecursos.getCMano(),
                iDimAux, null, null, null, null, "c", false
        );
        bCerrar.addActionListener(navegacionEstilosComponent);
        this.pDerecha.add(bCerrar);
    }
}
