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

public class dirTutoresM extends JFrame implements Vistas {

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
	private JPanel panelModificar;
	private JButton btnBuscar;
	private JLabel lblModificar;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public dirTutoresM() {
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

		panelModificar = new JPanel();
		panelModificar.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelModificar.setBackground(Color.LIGHT_GRAY);
		panelModificar.setBounds(254, 134, 602, 451);
		panel.add(panelModificar);
		panelModificar.setLayout(null);

		lblModificar = new JLabel("MODIFICAR");
		lblModificar.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblModificar.setBounds(255, 6, 125, 65);
		panelModificar.add(lblModificar);

		lblNewLabel = new JLabel("�Qu� tutor desea modificar?");
		lblNewLabel.setBounds(67, 91, 174, 16);
		panelModificar.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(265, 88, 289, 21);
		panelModificar.add(textField);
		textField.setColumns(10);

		JLabel lblquAtributoDesea = new JLabel("�Qu� atributo desea modificar?");
		lblquAtributoDesea.setBounds(51, 159, 200, 16);
		panelModificar.add(lblquAtributoDesea);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(263, 158, 141, 21);
		panelModificar.add(comboBox);

		JLabel lblIntroduzcaLaModificacin = new JLabel("Introduzca la modificaci�n:");
		lblIntroduzcaLaModificacin.setBounds(69, 230, 172, 16);
		panelModificar.add(lblIntroduzcaLaModificacin);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(265, 227, 289, 21);
		panelModificar.add(textField_1);

		JButton btnNewButton = new JButton("Cambiar");
		btnNewButton.setBounds(239, 312, 141, 65);
		panelModificar.add(btnNewButton);
	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
}
