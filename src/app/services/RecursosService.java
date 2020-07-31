package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {

    private Color colorNaranja, colorGrisOscuro, colorNegro;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo, fontBotones, fontBuscar;
    private Cursor cMano;
    private Border borderInferiorNaranja;
    private ImageIcon iCerrar;

    static private RecursosService servicio;

    private RecursosService() {
        colorNegro = new Color(44, 13, 10);
        colorNaranja = new Color(200, 42, 42);
        colorGrisOscuro = new Color(80, 80, 80);
        fontTPrincipal = new Font("Segoe UI", Font.PLAIN, 40);
        fontTitulo = new Font("Montserrat", Font.PLAIN, 18);
        fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
        fontBuscar = new Font("Calibri", Font.BOLD, 12);
        fontBotones = new Font("Calibri", Font.BOLD, 12);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        borderInferiorNaranja = BorderFactory.createMatteBorder(0, 0, 2, 0, colorNaranja);
        iCerrar = new ImageIcon("src/resources/Cerrar.png");

    }

    public Color getColorNegro() {
        return colorNegro;
    }

    public Color getColorNaranja() {
        return colorNaranja;
    }

    public Color getColorGrisOscuro() {
        return colorGrisOscuro;
    }

    public Font getFontTPrincipal() {
        return fontTPrincipal;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontSubtitulo() {
        return fontSubtitulo;
    }

    public Font getFontBuscar() {
        return fontBuscar;
    }

    public Cursor getCMano() {
        return cMano;
    }

    public Font getFontBotones() {
        return fontBotones;
    }

    public Border getBorderInferiorNaranja() {
        return borderInferiorNaranja;
    }

    public ImageIcon getIcerrar() {
        return iCerrar;
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }
}
