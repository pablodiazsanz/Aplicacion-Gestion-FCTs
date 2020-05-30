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

public class dirTutoresA extends JFrame implements Vistas{

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
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblquAtributoDesea;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblquAtributoDesea_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblquAtributoDesea_2;
	private JLabel lblquAtributoDesea_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public dirTutoresA() {
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

		lblAlumnos = new JLabel("TUTORES");
		lblAlumnos.setBounds(336, 6, 174, 65);
		panelCabecera.add(lblAlumnos);
		lblAlumnos.setFont(new Font("Lucida Grande", Font.PLAIN, 36));

		JButton btnExit_1 = new JButton("");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.volverDirector();
			}
		});
		btnExit_1.setIcon(new ImageIcon(dirTutores.class.getResource("/img/volver.png")));
		btnExit_1.setBounds(780, 6, 67, 65);
		panelCabecera.add(btnExit_1);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorTutores();
			}
		});
		btnConsultar.setBackground(Color.DARK_GRAY);
		btnConsultar.setIcon(new ImageIcon(dirTutores.class.getResource("/img/consultar.png")));
		btnConsultar.setBounds(22, 134, 175, 65);
		panel.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorTutoresEliminar();
			}
		});
		btnEliminar.setIcon(new ImageIcon(dirTutores.class.getResource("/img/eliminar.png")));
		btnEliminar.setBounds(22, 520, 175, 65);
		panel.add(btnEliminar);
		
		btnAnadir = new JButton("A�adir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorTutoresAnadir();
			}
		});
		btnAnadir.setIcon(new ImageIcon(dirTutores.class.getResource("/img/anadir.png")));
		btnAnadir.setBounds(22, 364, 175, 65);
		panel.add(btnAnadir);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorTutoresModificar();
			}
		});
		btnModificar.setIcon(new ImageIcon(dirTutores.class.getResource("/img/modificar.png")));
		btnModificar.setBounds(22, 443, 175, 65);
		panel.add(btnModificar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorTutoresBuscar();
			}
		});
		btnBuscar.setIcon(new ImageIcon(dirTutores.class.getResource("/img/buscar.png")));
		btnBuscar.setBounds(22, 287, 175, 65);
		panel.add(btnBuscar);
		
		panelAnadir = new JPanel();
		panelAnadir.setLayout(null);
		panelAnadir.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAnadir.setBackground(Color.LIGHT_GRAY);
		panelAnadir.setBounds(254, 134, 602, 451);
		panel.add(panelAnadir);
		
		lblAnadir = new JLabel("A�ADIR NUEVO TUTOR");
		lblAnadir.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblAnadir.setBounds(182, 6, 255, 65);
		panelAnadir.add(lblAnadir);
		
		lblNewLabel = new JLabel("N� de expediente:");
		lblNewLabel.setBounds(100, 119, 112, 16);
		panelAnadir.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(224, 200, 289, 21);
		panelAnadir.add(textField);
		
		lblquAtributoDesea = new JLabel("DNI:");
		lblquAtributoDesea.setBounds(184, 147, 28, 16);
		panelAnadir.add(lblquAtributoDesea);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(224, 116, 289, 21);
		panelAnadir.add(textField_1);
		
		btnNewButton = new JButton("Insertar");
		btnNewButton.setBounds(238, 357, 141, 65);
		panelAnadir.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(158, 175, 54, 16);
		panelAnadir.add(lblNewLabel_1);
		
		lblquAtributoDesea_1 = new JLabel("Apellidos:");
		lblquAtributoDesea_1.setBounds(149, 203, 63, 16);
		panelAnadir.add(lblquAtributoDesea_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(224, 144, 289, 21);
		panelAnadir.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(224, 172, 289, 21);
		panelAnadir.add(textField_3);
		
		lblquAtributoDesea_2 = new JLabel("Fecha de nacimiento:");
		lblquAtributoDesea_2.setBounds(79, 231, 133, 16);
		panelAnadir.add(lblquAtributoDesea_2);
		
		lblquAtributoDesea_3 = new JLabel("Nacionalidad:");
		lblquAtributoDesea_3.setBounds(126, 259, 86, 16);
		panelAnadir.add(lblquAtributoDesea_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(224, 256, 289, 21);
		panelAnadir.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(224, 228, 289, 21);
		panelAnadir.add(textField_5);
	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
}
