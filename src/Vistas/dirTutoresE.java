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

public class dirTutoresE extends JFrame implements Vistas{

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
	private JPanel panelEliminar;
	private JLabel lblEliminar;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public dirTutoresE() {
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
		
		panelEliminar = new JPanel();
		panelEliminar.setLayout(null);
		panelEliminar.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEliminar.setBackground(Color.LIGHT_GRAY);
		panelEliminar.setBounds(254, 134, 602, 451);
		panel.add(panelEliminar);
		
		lblEliminar = new JLabel("ELIMINAR");
		lblEliminar.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblEliminar.setBounds(259, 6, 95, 65);
		panelEliminar.add(lblEliminar);
		
		lblNewLabel = new JLabel("¿Qué tutor desea eliminar?");
		lblNewLabel.setBounds(76, 91, 165, 16);
		panelEliminar.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(265, 88, 289, 21);
		panelEliminar.add(textField);
		
		btnNewButton = new JButton("Borrar");
		btnNewButton.setBounds(235, 222, 141, 65);
		panelEliminar.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Confirme el id del tutor que desea borrar");
		lblNewLabel_1.setBounds(58, 152, 256, 16);
		panelEliminar.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(339, 149, 186, 21);
		panelEliminar.add(textField_1);
		textField_1.setColumns(10);
	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
}
