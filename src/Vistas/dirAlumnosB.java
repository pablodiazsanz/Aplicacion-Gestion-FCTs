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

public class dirAlumnosB extends JFrame implements Vistas{

	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JPanel panelCabecera;
	private JLabel logoUEM;
	private JLabel lblUsuario;
	private JLabel lblDirector;
	private JLabel lblAlumnos;
	private JButton btnConsultar;
	private JButton btnBuscar;
	private JPanel panelBuscar;
	private JLabel lblBuscar;
	private JLabel lblquAlumnoDesea;
	private JTextField textField;
	private JButton btnNewButton;
	private JTable table;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public dirAlumnosB() {
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

		lblUsuario = new JLabel("");
		lblUsuario.setBounds(622, 16, 152, 16);
		panelCabecera.add(lblUsuario);

		lblAlumnos = new JLabel("ALUMNOS");
		lblAlumnos.setBounds(336, 6, 174, 65);
		panelCabecera.add(lblAlumnos);
		lblAlumnos.setFont(new Font("Lucida Grande", Font.PLAIN, 36));

		JButton btnExit_1 = new JButton("");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.volverDirector();
			}
		});
		btnExit_1.setIcon(new ImageIcon(dirAlumnosB.class.getResource("/img/volver.png")));
		btnExit_1.setBounds(780, 6, 67, 65);
		panelCabecera.add(btnExit_1);

		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorAlumno();
			}
		});
		btnConsultar.setBackground(Color.DARK_GRAY);
		btnConsultar.setIcon(new ImageIcon(dirAlumnos.class.getResource("/img/consultar.png")));
		btnConsultar.setBounds(22, 134, 175, 65);
		panel.add(btnConsultar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorAlumnoBuscar();
			}
		});
		btnBuscar.setIcon(new ImageIcon(dirAlumnos.class.getResource("/img/buscar.png")));
		btnBuscar.setBounds(22, 368, 175, 65);
		panel.add(btnBuscar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorAlumnoEditar();
			}
		});
		btnEditar.setIcon(new ImageIcon(dirAlumnos.class.getResource("/img/editar.png")));
		btnEditar.setBounds(22, 520, 175, 65);
		panel.add(btnEditar);
		
		JButton btnAnexos = new JButton("Anexos");
		btnAnexos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnexos.setIcon(new ImageIcon(dirAlumnos.class.getResource("/img/anexo.png")));
		btnAnexos.setBounds(22, 443, 175, 65);
		panel.add(btnAnexos);

		panelBuscar = new JPanel();
		panelBuscar.setLayout(null);
		panelBuscar.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBuscar.setBackground(Color.LIGHT_GRAY);
		panelBuscar.setBounds(254, 134, 602, 451);
		panel.add(panelBuscar);

		lblBuscar = new JLabel("BUSCAR");
		lblBuscar.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblBuscar.setBounds(265, 6, 80, 65);
		panelBuscar.add(lblBuscar);

		lblquAlumnoDesea = new JLabel("¿Qué alumno desea buscar?");
		lblquAlumnoDesea.setBounds(69, 91, 172, 16);
		panelBuscar.add(lblquAlumnoDesea);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(265, 88, 289, 21);
		panelBuscar.add(textField);

		btnNewButton = new JButton("Encontrar");
		btnNewButton.setBounds(237, 135, 141, 65);
		panelBuscar.add(btnNewButton);

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(36, 253, 535, 165);
		panelBuscar.add(table);
	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
}
