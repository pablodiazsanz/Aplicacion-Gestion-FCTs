package Vistas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import Aplicacion.Controlador;
import Aplicacion.Modelo;
import Aplicacion.Vistas;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class dirEmpresasM extends JFrame implements Vistas{

	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JPanel panelCabecera;
	private JLabel logoUEM;
	private JLabel lblUsuario;
	private JLabel lblDirector;
	private JLabel lblAlumnos;
	private JButton btnAnadir;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnBuscar;
	private JTextField txtCIF;
	private JTextField txtModificacion;
	private JComboBox comboBox;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public dirEmpresasM() {
		setTitle("Aplicacion de Gestion de FCTs - UEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 886, 617);
		contentPane.add(panel);
		panel.setLayout(null);

		panelCabecera = new JPanel();
		panelCabecera.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCabecera.setBackground(new Color(255, 255, 255));
		panelCabecera.setBounds(16, 16, 854, 77);
		panel.add(panelCabecera);
		panelCabecera.setLayout(null);

		logoUEM = new JLabel("");
		logoUEM.setBounds(6, 6, 67, 65);
		panelCabecera.add(logoUEM);
		logoUEM.setIcon(new ImageIcon(director.class.getResource("/img/logoUEM.jpg")));

		lblDirector = new JLabel("Directora del centro");
		lblDirector.setBounds(643, 44, 125, 16);
		panelCabecera.add(lblDirector);

		lblUsuario = new JLabel("Usuario: Ana Manzanero");
		lblUsuario.setBounds(622, 16, 152, 16);
		panelCabecera.add(lblUsuario);

		lblAlumnos = new JLabel("EMPRESAS");
		lblAlumnos.setBounds(333, 6, 177, 65);
		panelCabecera.add(lblAlumnos);
		lblAlumnos.setFont(new Font("Lucida Grande", Font.PLAIN, 36));

		JButton btnExit_1 = new JButton("");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.volverDirector();
			}
		});
		btnExit_1.setIcon(new ImageIcon(dirEmpresas.class.getResource("/img/volver.png")));
		btnExit_1.setBounds(780, 6, 67, 65);
		panelCabecera.add(btnExit_1);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorEmpresas();
			}
		});
		btnConsultar.setBackground(Color.DARK_GRAY);
		btnConsultar.setIcon(new ImageIcon(dirEmpresas.class.getResource("/img/consultar.png")));
		btnConsultar.setBounds(22, 134, 175, 65);
		panel.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorEmpresasEliminar();
			}
		});
		btnEliminar.setIcon(new ImageIcon(dirEmpresas.class.getResource("/img/eliminar.png")));
		btnEliminar.setBounds(22, 520, 175, 65);
		panel.add(btnEliminar);
		
		btnAnadir = new JButton("A�adir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorEmpresasAnadir();
			}
		});
		btnAnadir.setIcon(new ImageIcon(dirEmpresas.class.getResource("/img/anadir.png")));
		btnAnadir.setBounds(22, 364, 175, 65);
		panel.add(btnAnadir);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorEmpresasModificar();
			}
		});
		btnModificar.setIcon(new ImageIcon(dirEmpresas.class.getResource("/img/modificar.png")));
		btnModificar.setBounds(22, 443, 175, 65);
		panel.add(btnModificar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorEmpresasBuscar();
			}
		});
		btnBuscar.setIcon(new ImageIcon(dirEmpresas.class.getResource("/img/buscar.png")));
		btnBuscar.setBounds(22, 287, 175, 65);
		panel.add(btnBuscar);
		
		JPanel panelModificar = new JPanel();
		panelModificar.setBounds(254, 134, 602, 451);
		panel.add(panelModificar);
		panelModificar.setLayout(null);
		panelModificar.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelModificar.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblModificar_1 = new JLabel("MODIFICAR");
		lblModificar_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblModificar_1.setBounds(255, 6, 125, 65);
		panelModificar.add(lblModificar_1);
		
		JLabel lblNewLabel_1 = new JLabel("Introduzca el CIF de la empresa a modificar:");
		lblNewLabel_1.setBounds(51, 91, 277, 16);
		panelModificar.add(lblNewLabel_1);
		
		txtCIF = new JTextField();
		txtCIF.setColumns(10);
		txtCIF.setBounds(340, 88, 214, 21);
		panelModificar.add(txtCIF);
		
		JLabel lblquAtributoDesea_1 = new JLabel("�Qu� atributo desea modificar?");
		lblquAtributoDesea_1.setBounds(51, 159, 200, 16);
		panelModificar.add(lblquAtributoDesea_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Direccion", "Localidad", "Telefono", "Email", "Responsable de empresa"}));
		comboBox.setBounds(263, 158, 141, 21);
		panelModificar.add(comboBox);
		
		JLabel lblIntroduzcaLaModificacin_1 = new JLabel("Introduzca la modificaci�n:");
		lblIntroduzcaLaModificacin_1.setBounds(51, 230, 190, 16);
		panelModificar.add(lblIntroduzcaLaModificacin_1);
		
		txtModificacion = new JTextField();
		txtModificacion.setColumns(10);
		txtModificacion.setBounds(253, 227, 301, 21);
		panelModificar.add(txtModificacion);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorModificarEmpresa();
			}
		});
		btnCambiar.setBounds(229, 322, 141, 65);
		panelModificar.add(btnCambiar);
	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
	
	public String getTxtCIF(){
		return txtCIF.getText();
	}
	
	public String getEleccion() {
		String item = (String) comboBox.getSelectedItem();
		if (item.equals("Nombre")) {
			return "nombre";
		} else if (item.equals("Direccion")) {
			return "direccion";
		} else if (item.equals("Localidad")) {
			return "localidad";
		} else if (item.equals("Telefono")) {
			return "telefono";
		} else if (item.equals("Email")) {
			return "email";
		} else if (item.equals("Responsable de empresa")) {
			return "responsable_empresa";
		}
		return null;		
	}
	
	public String getTxtModificacion(){
		return txtModificacion.getText();
	}

	public void actualizar() {
		txtCIF.setText("");
		txtModificacion.setText("");
	}
}
