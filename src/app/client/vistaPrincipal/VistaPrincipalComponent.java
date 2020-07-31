package app.client.vistaPrincipal;

//@author AndresFWilt
import app.client.component.NavegacionEstilosComponent;
import app.client.component.BarraRecientesComponent;
import app.client.component.inicio.PresentacionesComponent;
import app.client.component.inicio.TemasComponent;
import app.client.component.inicio.EducacionComponent;
import app.client.component.inicio.GraficosComponent;
import app.client.component.inicio.DiagramasComponent;
import app.client.component.inicio.EmpresaComponent;
import app.client.component.inicio.InfografiaComponent;
import app.client.login.LoginComponent;

public class VistaPrincipalComponent {

    private VistaPrincipalTemplate vistaPrincipalTemplate;

    //Declaclaracion Componentes
    private NavegacionEstilosComponent navegacionEstilosComponent;
    private BarraRecientesComponent barraRecientesComponent;
    private LoginComponent loginComponent;

    public VistaPrincipalComponent(LoginComponent loginComponent) {
        
        vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        navegacionEstilosComponent = new NavegacionEstilosComponent(this);
        barraRecientesComponent = new BarraRecientesComponent(); 
        this.loginComponent = loginComponent;
        vistaPrincipalTemplate.getPNavegacion().add(
                navegacionEstilosComponent.getBattaTituloTemplate()
        );

        vistaPrincipalTemplate.getPRecientes().add(barraRecientesComponent.getNavegacionUsuarioTemplate()
        );
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }

    public void mostrarComponente(String comando) {
        vistaPrincipalTemplate.getPPrincipal().removeAll();
        switch (comando) {
            case "Presentaciones":
                vistaPrincipalTemplate.getPPrincipal().add(
                        new PresentacionesComponent().getPresentacionTemplate()
                );
                break;
            case "Temas":
                vistaPrincipalTemplate.getPPrincipal().add(
                        new TemasComponent().getTemasTemplate()
                );

                break;
            case "Educacion":
                vistaPrincipalTemplate.getPPrincipal().add(
                        new EducacionComponent().getEducacionTemplate()
                );
                break;
            case "Graficos":
                vistaPrincipalTemplate.getPPrincipal().add(
                        new GraficosComponent().getGraficosTemplate()
                );
                break;
            case "Diagramas":
                vistaPrincipalTemplate.getPPrincipal().add(
                        new DiagramasComponent().getDiagramasTemplate()
                );
                break;
            case "Empresa":
                vistaPrincipalTemplate.getPPrincipal().add(
                        new EmpresaComponent().getEmpresaTemplate()
                );
                break;
            case "Infografia":
                
                vistaPrincipalTemplate.getPPrincipal().add(
                        new InfografiaComponent().getInfografiaTemplate()
                );
                break;
            case "Cambiar de cuenta":
                loginComponent.getLoginTemplate().setVisible(true);
                this.vistaPrincipalTemplate.setVisible(false);
                break;
            case "":
                System.exit(0);
                break;
        }
        this.vistaPrincipalTemplate.repaint();
    }
}
