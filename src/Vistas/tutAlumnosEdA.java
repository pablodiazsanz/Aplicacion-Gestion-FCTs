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

public class tutAlumnosEdA extends JFrame implements Vistas{

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
	private JPanel panelAnadir;
	private JLabel lblAnadir;
	private JLabel lblNewLabel;
	private JTextField txtApellidos;
	private JLabel lblquAtributoDesea;
	private JTextField txtNumExpediente;
	private JButton btnInsertar;
	private JLabel lblNewLabel_1;
	private JLabel lblquAtributoDesea_1;
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JLabel lblquAtributoDesea_2;
	private JLabel lblquAtributoDesea_3;
	private JTextField txtNacionalidad;
	private JTextField txtFechaNac;
	private JButton btnVolver;
	private JTextField txtCodGrupo;
	private JLabel lblAnoAcademico;
	private JTextField txtAnoAcademico;
	private JPanel panelInformacion;
	private JLabel lblIncorrecto;
	private JLabel lblInfo;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public tutAlumnosEdA() {
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
				miControlador.tutorAlumnosAnexos();
			}
		});
		btnAnexos.setIcon(new ImageIcon(tutAlumnos.class.getResource("/img/anexo.png")));
		btnAnexos.setBounds(22, 443, 175, 65);
		panel.add(btnAnexos);
		
		panelAnadir = new JPanel();
		panelAnadir.setBounds(254, 134, 602, 451);
		panel.add(panelAnadir);
		panelAnadir.setLayout(null);
		panelAnadir.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAnadir.setBackground(Color.LIGHT_GRAY);
		
		lblAnadir = new JLabel("A�ADIR NUEVO ALUMNO");
		lblAnadir.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblAnadir.setBounds(182, 6, 255, 65);
		panelAnadir.add(lblAnadir);
		
		lblNewLabel = new JLabel("N� de expediente:");
		lblNewLabel.setBounds(100, 119, 112, 16);
		panelAnadir.add(lblNewLabel);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(224, 200, 289, 21);
		panelAnadir.add(txtApellidos);
		
		lblquAtributoDesea = new JLabel("DNI:");
		lblquAtributoDesea.setBounds(184, 147, 28, 16);
		panelAnadir.add(lblquAtributoDesea);
		
		txtNumExpediente = new JTextField();
		txtNumExpediente.setColumns(10);
		txtNumExpediente.setBounds(224, 116, 289, 21);
		panelAnadir.add(txtNumExpediente);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorInsertarAlumno();
			}
		});
		btnInsertar.setBounds(372, 357, 141, 65);
		panelAnadir.add(btnInsertar);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(158, 175, 54, 16);
		panelAnadir.add(lblNewLabel_1);
		
		lblquAtributoDesea_1 = new JLabel("Apellidos:");
		lblquAtributoDesea_1.setBounds(149, 203, 63, 16);
		panelAnadir.add(lblquAtributoDesea_1);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(224, 144, 289, 21);
		panelAnadir.add(txtDNI);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(224, 172, 289, 21);
		panelAnadir.add(txtNombre);
		
		lblquAtributoDesea_2 = new JLabel("Fecha de nacimiento:");
		lblquAtributoDesea_2.setBounds(79, 231, 133, 16);
		panelAnadir.add(lblquAtributoDesea_2);
		
		lblquAtributoDesea_3 = new JLabel("Nacionalidad:");
		lblquAtributoDesea_3.setBounds(126, 259, 86, 16);
		panelAnadir.add(lblquAtributoDesea_3);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(224, 256, 289, 21);
		panelAnadir.add(txtNacionalidad);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(224, 228, 289, 21);
		panelAnadir.add(txtFechaNac);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnosEditar();
			}
		});
		btnVolver.setBounds(100, 357, 141, 65);
		panelAnadir.add(btnVolver);
		
		JLabel lblCodGrupo = new JLabel("Codigo de Grupo:");
		lblCodGrupo.setBounds(100, 287, 112, 16);
		panelAnadir.add(lblCodGrupo);
		
		txtCodGrupo = new JTextField();
		txtCodGrupo.setColumns(10);
		txtCodGrupo.setBounds(224, 284, 289, 21);
		panelAnadir.add(txtCodGrupo);
		
		lblAnoAcademico = new JLabel("Año Academico:");
		lblAnoAcademico.setBounds(110, 315, 102, 16);
		panelAnadir.add(lblAnoAcademico);
		
		txtAnoAcademico = new JTextField();
		txtAnoAcademico.setColumns(10);
		txtAnoAcademico.setBounds(224, 312, 289, 21);
		panelAnadir.add(txtAnoAcademico);
		
		panelInformacion = new JPanel();
		panelInformacion.setBounds(89, 68, 424, 31);
		panelAnadir.add(panelInformacion);
		panelInformacion.setLayout(null);
		
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

	public String getTxtApellidos() {
		return txtApellidos.getText();
	}

	public String getTxtNumExpediente() {
		return txtNumExpediente.getText();
	}

	public String getTxtDNI() {
		return txtDNI.getText();
	}

	public String getTxtNombre() {
		return txtNombre.getText();
	}

	public String getTxtNacionalidad() {
		return txtNacionalidad.getText();
	}

	public String getTxtFechaNac() {
		return txtFechaNac.getText();
	}

	public String getTxtCodGrupo() {
		return txtCodGrupo.getText();
	}
	
	public String getTxtAnoAcademico() {
		return txtAnoAcademico.getText();
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
