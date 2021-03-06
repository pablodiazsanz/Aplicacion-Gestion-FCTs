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

public class tutAlumnosEd extends JFrame implements Vistas{

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
	private JLabel lblquDeseaHacer;
	private JButton btnAnexos;
	private JButton btnEditar;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public tutAlumnosEd() {
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

		lblDirector = new JLabel("Tutor del centro");
		lblDirector.setBounds(667, 44, 101, 16);
		panelCabecera.add(lblDirector);

		lblUsuario = new JLabel("Usuario: Pedro Camacho");
		lblUsuario.setBounds(621, 16, 153, 16);
		panelCabecera.add(lblUsuario);

		lblAlumnos = new JLabel("ALUMNOS");
		lblAlumnos.setBounds(336, 6, 174, 65);
		panelCabecera.add(lblAlumnos);
		lblAlumnos.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		
		JButton btnExit_1 = new JButton("");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.volverTutor();
			}
		});
		btnExit_1.setIcon(new ImageIcon(tutAlumnos.class.getResource("/img/volver.png")));
		btnExit_1.setBounds(780, 6, 67, 65);
		panelCabecera.add(btnExit_1);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnos();
			}
		});
		btnConsultar.setBackground(Color.DARK_GRAY);
		btnConsultar.setIcon(new ImageIcon(tutAlumnos.class.getResource("/img/consultar.png")));
		btnConsultar.setBounds(22, 134, 175, 65);
		panel.add(btnConsultar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnosBuscar();
			}
		});
		btnBuscar.setIcon(new ImageIcon(tutAlumnos.class.getResource("/img/buscar.png")));
		btnBuscar.setBounds(22, 368, 175, 65);
		panel.add(btnBuscar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnosEditar();
			}
		});
		btnEditar.setIcon(new ImageIcon(tutAlumnos.class.getResource("/img/editar.png")));
		btnEditar.setBounds(22, 520, 175, 65);
		panel.add(btnEditar);
		
		JButton btnAnexos = new JButton("Anexos");
		btnAnexos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnexos.setIcon(new ImageIcon(tutAlumnos.class.getResource("/img/anexo.png")));
		btnAnexos.setBounds(22, 443, 175, 65);
		panel.add(btnAnexos);
		
		panelAnadir = new JPanel();
		panelAnadir.setLayout(null);
		panelAnadir.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAnadir.setBackground(Color.LIGHT_GRAY);
		panelAnadir.setBounds(254, 134, 602, 451);
		panel.add(panelAnadir);
		
		lblquDeseaHacer = new JLabel("�Qu� DESEA HACER?");
		lblquDeseaHacer.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblquDeseaHacer.setBounds(202, 6, 210, 65);
		panelAnadir.add(lblquDeseaHacer);
		
		btnEliminar = new JButton("Eliminar Alumno");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnosEditarEliminar();
			}
		});
		btnEliminar.setBounds(202, 313, 210, 65);
		panelAnadir.add(btnEliminar);
		btnEliminar.setIcon(new ImageIcon(tutAlumnosEd.class.getResource("/img/eliminar.png")));
		
		btnModificar = new JButton("Modificar Alumno");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnosEditarModificar();
			}
		});
		btnModificar.setBounds(202, 213, 210, 65);
		panelAnadir.add(btnModificar);
		btnModificar.setIcon(new ImageIcon(tutAlumnosEd.class.getResource("/img/modificar.png")));
		
		btnAnadir = new JButton("A�adir Alumno");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnosEditarAnadir();
			}
		});
		btnAnadir.setBounds(202, 115, 210, 65);
		panelAnadir.add(btnAnadir);
		btnAnadir.setIcon(new ImageIcon(tutAlumnosEd.class.getResource("/img/anadir.png")));
	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
}
