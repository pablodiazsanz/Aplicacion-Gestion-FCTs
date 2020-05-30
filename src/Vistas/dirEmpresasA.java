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
import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import Aplicacion.Controlador;
import Aplicacion.Modelo;
import Aplicacion.Vistas;

import javax.swing.JTextField;
import javax.swing.JComboBox;

public class dirEmpresasA extends JFrame implements Vistas{

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
	private JPanel panelAnadir;
	private JLabel lblAnadir;
	private JTextField txtEmail;
	private JTextField txtTelefono;
	private JTextField txtResponsableEmpresa;
	private JLabel lblResponsableEmpresa;
	private JLabel lblTelefono;
	private JTextField txtDireccion;
	private JTextField txtCIF;
	private JLabel lblLocalidad;
	private JLabel lblDireccion;
	private JTextField txtNombre;
	private JLabel lblCIF;
	private JTextField txtLocalidad;
	private JLabel lblNombre;
	private JButton btnNewButton;
	private JPanel panelInformacion;
	private JLabel lblInformacion;
	private JLabel lblIncorrecto;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public dirEmpresasA() {
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
		lblAlumnos.setBounds(327, 6, 183, 65);
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
		
		panelAnadir = new JPanel();
		panelAnadir.setLayout(null);
		panelAnadir.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAnadir.setBackground(Color.LIGHT_GRAY);
		panelAnadir.setBounds(254, 134, 602, 451);
		panel.add(panelAnadir);
		
		lblAnadir = new JLabel("A�ADIR NUEVA EMPRESA");
		lblAnadir.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblAnadir.setBounds(182, 6, 255, 65);
		panelAnadir.add(lblAnadir);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(158, 119, 54, 16);
		panelAnadir.add(lblNombre);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(224, 200, 289, 21);
		panelAnadir.add(txtLocalidad);
		
		lblCIF = new JLabel("CIF:");
		lblCIF.setBounds(184, 147, 28, 16);
		panelAnadir.add(lblCIF);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(224, 116, 289, 21);
		panelAnadir.add(txtNombre);
		
		btnNewButton = new JButton("Insertar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorInsertarEmpresa();
			}
		});
		btnNewButton.setBounds(238, 357, 141, 65);
		panelAnadir.add(btnNewButton);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(148, 175, 64, 16);
		panelAnadir.add(lblDireccion);
		
		lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(148, 203, 64, 16);
		panelAnadir.add(lblLocalidad);
		
		txtCIF = new JTextField();
		txtCIF.setColumns(10);
		txtCIF.setBounds(224, 144, 289, 21);
		panelAnadir.add(txtCIF);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(224, 172, 289, 21);
		panelAnadir.add(txtDireccion);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(152, 231, 60, 16);
		panelAnadir.add(lblTelefono);
		
		lblResponsableEmpresa = new JLabel("Responsable de Empresa:");
		lblResponsableEmpresa.setBounds(53, 287, 159, 16);
		panelAnadir.add(lblResponsableEmpresa);
		
		txtResponsableEmpresa = new JTextField();
		txtResponsableEmpresa.setColumns(10);
		txtResponsableEmpresa.setBounds(224, 284, 289, 21);
		panelAnadir.add(txtResponsableEmpresa);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(224, 228, 289, 21);
		panelAnadir.add(txtTelefono);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(224, 256, 289, 21);
		panelAnadir.add(txtEmail);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(174, 259, 38, 16);
		panelAnadir.add(lblEmail);
		
		panelInformacion = new JPanel();
		panelInformacion.setLayout(null);
		panelInformacion.setBounds(89, 68, 424, 31);
		panelAnadir.add(panelInformacion);
		
		lblInformacion = new JLabel("Introduzca los Datos");
		lblInformacion.setBounds(6, 5, 412, 20);
		panelInformacion.add(lblInformacion);
		
		lblIncorrecto = new JLabel("");
		lblIncorrecto.setBounds(6, 5, 412, 20);
		panelInformacion.add(lblIncorrecto);
	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
	
	public String getTxtLocalidad() {
		return txtLocalidad.getText();
	}

	public String getTxtNombre() {
		return txtNombre.getText();
	}

	public String getTxtCIF() {
		return txtCIF.getText();
	}

	public String getTxtDireccion() {
		return txtDireccion.getText();
	}

	public String getTxtResponsableEmpresa() {
		return txtResponsableEmpresa.getText();
	}

	public String getTxtTelefono() {
		return txtTelefono.getText();
	}
	
	public String getTxtEmail() {
		return txtEmail.getText();
	}
	
	public void actualizar() {
		txtNombre.setText("");
		txtLocalidad.setText("");
		txtTelefono.setText("");
		txtResponsableEmpresa.setText("");
		txtDireccion.setText("");
		txtCIF.setText("");
		txtEmail.setText("");
	}
}
