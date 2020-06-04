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

public class tutAlumnosEdM extends JFrame implements Vistas{

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
	private JComboBox comboBox;
	private JTextField txtExpediente;
	private JTextField txtModificacion;
	private JPanel panelInformacion;
	private JLabel lblInfo;
	private JLabel lblIncorrecto;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public tutAlumnosEdM() {
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
		
		JPanel panelModificar = new JPanel();
		panelModificar.setLayout(null);
		panelModificar.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelModificar.setBackground(Color.LIGHT_GRAY);
		panelModificar.setBounds(254, 134, 602, 451);
		panel.add(panelModificar);
		
		JLabel lblModificar = new JLabel("MODIFICAR");
		lblModificar.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblModificar.setBounds(255, 6, 125, 65);
		panelModificar.add(lblModificar);
		
		JLabel lblNewLabel = new JLabel("Introduzca el expediente del alumno a modificar");
		lblNewLabel.setBounds(51, 139, 304, 16);
		panelModificar.add(lblNewLabel);
		
		txtExpediente = new JTextField();
		txtExpediente.setColumns(10);
		txtExpediente.setBounds(374, 136, 180, 21);
		panelModificar.add(txtExpediente);
		
		JLabel lblquAtributoDesea = new JLabel("�Qu� atributo desea modificar?");
		lblquAtributoDesea.setBounds(51, 201, 207, 16);
		panelModificar.add(lblquAtributoDesea);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Apellido", "DNI", "Fecha de Nacimiento", "Nacionalidad"}));
		comboBox_1.setBounds(279, 200, 141, 21);
		panelModificar.add(comboBox_1);
		
		JLabel lblIntroduzcaLaModificacin = new JLabel("Introduzca la modificaci�n:");
		lblIntroduzcaLaModificacin.setBounds(51, 269, 190, 16);
		panelModificar.add(lblIntroduzcaLaModificacin);
		
		txtModificacion = new JTextField();
		txtModificacion.setColumns(10);
		txtModificacion.setBounds(253, 266, 301, 21);
		panelModificar.add(txtModificacion);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.setBounds(370, 334, 141, 65);
		panelModificar.add(btnCambiar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(100, 334, 141, 65);
		panelModificar.add(btnVolver);
		
		panelInformacion = new JPanel();
		panelInformacion.setLayout(null);
		panelInformacion.setBounds(103, 74, 424, 31);
		panelModificar.add(panelInformacion);
		
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
	
	public String getTxtExpediente(){
		return txtExpediente.getText();
	}
	
	public String getEleccion() {
		String item = (String) comboBox.getSelectedItem();
		if (item.equals("Nombre")) {
			return "nombre";
		} else if (item.equals("Apellido")) {
			return "apellido";
		} else if (item.equals("DNI")) {
			return "dni";
		} else if (item.equals("Fecha de Nacimiento")) {
			return "fecha_nacimiento";
		} else if (item.equals("Nacionalidad")) {
			return "nacionalidad";
		}
		return null;	
	}
	
	public String getTxtModificacion(){
		return txtModificacion.getText();
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
