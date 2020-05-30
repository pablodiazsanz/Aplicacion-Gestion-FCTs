package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aplicacion.Controlador;
import Aplicacion.Modelo;
import Aplicacion.Vistas;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame implements Vistas {

	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JPanel panellogin;
	private JLabel logoUE;
	private JLabel lblUsuario;
	private JTextField textFieldUsuario;
	private JPasswordField pswContrasena;
	private JLabel lblContrasena;
	private JButton btnAcceder;
	private JLabel uemIMG;
	private JButton btnCrear;
	private JButton btnRecuperar;
	private JLabel lblInformacion;
	private JPanel panel;
	private JLabel lblIncorrecto;
	private JButton btnNewButton;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public login() {
		setTitle("Aplicacion de Gestion de FCTs - UEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 506);
//		setExtendedState(6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panellogin = new JPanel();
		panellogin.setBackground(new Color(220, 20, 60));
		panellogin.setBounds(0, 0, 744, 484);
		contentPane.add(panellogin);
		panellogin.setLayout(null);

		logoUE = new JLabel("");
		logoUE.setIcon(new ImageIcon(login.class.getResource("/img/logoUE.jpg")));
		logoUE.setBounds(342, 57, 362, 93);
		panellogin.add(logoUE);

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(389, 233, 61, 16);
		panellogin.add(lblUsuario);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(389, 261, 280, 26);
		panellogin.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		lblContrasena = new JLabel("Contrase�a");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblContrasena.setBounds(389, 299, 96, 16);
		panellogin.add(lblContrasena);

		pswContrasena = new JPasswordField();
		pswContrasena.setBounds(389, 327, 280, 26);
		panellogin.add(pswContrasena);

		btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.accesoLogin();
			}
		});
		btnAcceder.setBounds(420, 380, 136, 43);
		panellogin.add(btnAcceder);

		uemIMG = new JLabel("");
		uemIMG.setIcon(new ImageIcon(login.class.getResource("/img/uemIMG.jpg")));
		uemIMG.setBounds(0, 0, 307, 484);
		panellogin.add(uemIMG);

		btnCrear = new JButton("Crear Cuenta");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.Verificacion();
			}
		});
		btnCrear.setBounds(330, 435, 169, 26);
		panellogin.add(btnCrear);

		btnRecuperar = new JButton("Recuperar Contrase�a");
		btnRecuperar.setBounds(541, 435, 186, 26);
		panellogin.add(btnRecuperar);

		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(389, 178, 280, 43);
		panellogin.add(panel);
		panel.setLayout(null);

		lblInformacion = new JLabel("Acceso a la App");
		lblInformacion.setToolTipText("");
		lblInformacion.setBounds(6, 0, 268, 43);
		panel.add(lblInformacion);

		lblIncorrecto = new JLabel("");
		lblIncorrecto.setForeground(new Color(220, 20, 60));
		lblIncorrecto.setBounds(6, 0, 268, 43);
		panel.add(lblIncorrecto);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.configLogin();
			}
		});
		btnNewButton.setBounds(577, 380, 55, 43);
		btnNewButton.setIcon(new ImageIcon(login.class.getResource("/img/icons8-configuracion-de-datos-30.png")));
		panellogin.add(btnNewButton);
	}

	public String getUsr() {
		return textFieldUsuario.getText();
	}

	public String getPwd() {
		return String.valueOf(pswContrasena.getPassword());
	}

	public void actualizar() {
		String resultado = miModelo.getResultado();
		String rol = miModelo.getRol();
		if (resultado.equals("Correcto")) {
			lblIncorrecto.setText("");
			lblInformacion.setText("Acceso a la App");
			if (rol.equals("tutor")) {
				miControlador.volverTutor();
			} else if (rol.equals("director")) {
				miControlador.volverDirector();
			} else if (rol.equals("empresa")) {
				miControlador.volverEmpresa();
			}
		} else if (resultado.equals("Cerrar")) {
			System.exit(0);
		} else {
			lblInformacion.setText("");
			lblIncorrecto.setText("Usuario o contrasena incorrecto.");
		}
	}
}
