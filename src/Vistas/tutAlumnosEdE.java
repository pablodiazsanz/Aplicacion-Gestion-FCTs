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

public class tutAlumnosEdE extends JFrame implements Vistas{

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
	private JPanel panelEliminar;
	private JLabel lblEliminar;
	private JLabel lblNewLabel;
	private JTextField txtNombre;
	private JButton btnBorrar;
	private JLabel lblNewLabel_1;
	private JTextField txtId;
	private JButton btnVolver;
	private JPanel panelInformacion;
	private JLabel lblInfo;
	private JLabel lblIncorrecto;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public tutAlumnosEdE() {
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
		
		lblNewLabel = new JLabel("Nombre del alumno que desea eliminar");
		lblNewLabel.setBounds(46, 166, 246, 16);
		panelEliminar.add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(313, 163, 240, 21);
		panelEliminar.add(txtNombre);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorBorrarAlumno();
			}
		});
		btnBorrar.setBounds(364, 325, 141, 65);
		panelEliminar.add(btnBorrar);
		
		lblNewLabel_1 = new JLabel("Confirme el expediente del alumno que desea borrar");
		lblNewLabel_1.setBounds(30, 227, 335, 16);
		panelEliminar.add(lblNewLabel_1);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(377, 224, 176, 21);
		panelEliminar.add(txtId);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnosEditar();
			}
		});
		btnVolver.setBounds(100, 325, 141, 65);
		panelEliminar.add(btnVolver);
		
		panelInformacion = new JPanel();
		panelInformacion.setLayout(null);
		panelInformacion.setBounds(102, 83, 424, 31);
		panelEliminar.add(panelInformacion);
		
		lblInfo = new JLabel("Introduzca los Datos");
		lblInfo.setBounds(6, 5, 412, 20);
		panelInformacion.add(lblInfo);
		
		lblIncorrecto = new JLabel("");
		lblIncorrecto.setForeground(new Color(220, 20, 60));
		lblIncorrecto.setBounds(6, 5, 412, 20);
		panelInformacion.add(lblIncorrecto);
	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
	
	public String getTxtNombre() {
		return txtNombre.getText();
	}

	public String getTxtId() {
		return txtId.getText();
	}

	public void actualizar() {
		String resultado = miModelo.getResultado();
		if (resultado.equals("Correcto")) {
			miControlador.tutorAlumnosEditar();
			lblInfo.setText("Introduzca los Datos");
			lblIncorrecto.setText("");
		}
		else {
			lblInfo.setText("");
			lblIncorrecto.setText("Algun dato es incorrecto. Vuelva a intentarlo.");
		}
	}
}
