
package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;


public class VentanaRegistro extends JDialog {
    private JLabel lCedula, lNombre, lApellido, lPerfil, lPosicion, lAltura, lEdad, lValor;
    private JTextField tCedula, tNombre, tApellido, tAltura, tEdad, tValor;
    private JComboBox cPosicion;
    private JRadioButton rIzquierdo, rDerecho;
    private ButtonGroup grupoRadio;
    private JButton bGuardar, bCancelar, bNuevo, bBuscar, bEliminar;
    
    private JPanel panelDatos, panelBotones;
    
    private Container contenedor;

    public VentanaRegistro(JFrame frame, boolean bln) {
        super(frame, bln);
        this.setTitle("Formulario Registro de Jugadores - V1");
        //this.setSize(400, 500);
        this.iniciarComponentes();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){
       this.contenedor = this.getContentPane();
       this.contenedor.setLayout(new BorderLayout());
       this.iniciarPanelDatos();
       this.iniciarPanelBotones();
       
    }
    
    public void iniciarPanelDatos(){
        this.panelDatos = new JPanel();
        this.panelDatos.setLayout(new GridLayout(9, 2, 5,5));
        
        this.lCedula = new JLabel("No cedula: ");
        this.lNombre = new JLabel("Nombre: ");
        this.lApellido= new JLabel("Apellido: ");
        this.lPerfil = new JLabel("Perfil: ");
        this.lPosicion= new JLabel("Posicio: ");
        this.lEdad= new JLabel("Edad: ");
        this.lAltura= new JLabel("Altura: ");
        this.lValor= new JLabel("Valor: ");
        
        this.tCedula = new JTextField(null);
        this.tNombre= new JTextField(null);
        this.tApellido= new JTextField(null);
        this.tEdad= new JTextField(null);
        this.tAltura= new JTextField(null);
        this.tValor= new JTextField(null);
        
        this.cPosicion = new JComboBox();
        this.cPosicion.addItem("Portero");
        this.cPosicion.addItem("Defensa");
        this.cPosicion.addItem("Volante");
        this.cPosicion.addItem("Delantero");
        
        this.rIzquierdo = new JRadioButton("Izquierdo");
        this.rIzquierdo.setSelected(true);
        this.rDerecho = new JRadioButton("Derecho");
        this.grupoRadio = new ButtonGroup();
        this.grupoRadio.add(this.rIzquierdo);
        this.grupoRadio.add(this.rDerecho);
        
        this.bGuardar = new JButton("Guardar");
        this.bCancelar = new JButton("Cancelar");
        
        this.panelDatos.add(this.lCedula);
        this.panelDatos.add(this.tCedula);
        
        this.panelDatos.add(this.lNombre);
        this.panelDatos.add(this.tNombre);
        
        this.panelDatos.add(this.lApellido);
        this.panelDatos.add(this.tApellido);
        
        
        JPanel panelRadio = new JPanel();
        panelRadio.setLayout(new FlowLayout());
        
        panelRadio.add(this.rIzquierdo);
        panelRadio.add(this.rDerecho);
        
        this.panelDatos.add(this.lPerfil);
        this.panelDatos.add(panelRadio);
        
        this.panelDatos.add(this.lPosicion);
        this.panelDatos.add(this.cPosicion);
        
        this.panelDatos.add(this.lEdad);
        this.panelDatos.add(this.tEdad);
        
        this.panelDatos.add(this.lAltura);
        this.panelDatos.add(this.tAltura);
        
        this.panelDatos.add(this.lValor);
        this.panelDatos.add(this.tValor);
        
        this.panelDatos.add(this.bGuardar);
        this.panelDatos.add(this.bCancelar);
        
        this.contenedor.add(this.panelDatos, BorderLayout.CENTER);
        
    }
    
    public void iniciarPanelBotones(){
        
        this.panelBotones = new JPanel();
        this.panelBotones.setLayout(new GridLayout(3,1, 5,5));
        
        this.bNuevo = new JButton("Nuevo");
        this.bBuscar = new JButton("Buscar");
        this.bEliminar= new JButton("Eliminar");
        
        this.panelBotones.add(this.bNuevo);
        this.panelBotones.add(this.bBuscar);
        this.panelBotones.add(this.bEliminar);
        
        JPanel panel = new JPanel();
        panel.add(this.panelBotones);
        
        this.contenedor.add(panel, BorderLayout.EAST);
    
    }
    
    
    
}

