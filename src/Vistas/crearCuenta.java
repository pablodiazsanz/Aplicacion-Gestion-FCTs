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

public class crearCuenta extends JFrame implements Vistas{
	
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JPanel panelCrearCuenta;
	private JLabel logoUE;
	private JLabel lblNombreU;
	private JTextField textFieldUsuario;
	private JButton btnCrear;
	private JLabel uemIMG;
	private JLabel lblContrasena;
	private JLabel lblRepetirContrasea;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPanel panel;
	private JLabel lblInformacion;
	private JLabel lblIncorrecto;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public crearCuenta() {
		setTitle("Aplicacion de Gestion de FCTs - UEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 506);
//		setExtendedState(6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelCrearCuenta = new JPanel();
		panelCrearCuenta.setBackground(new Color(220, 20, 60));
		panelCrearCuenta.setBounds(0, 0, 744, 484);
		contentPane.add(panelCrearCuenta);
		panelCrearCuenta.setLayout(null);
		
		logoUE = new JLabel("");
		logoUE.setIcon(new ImageIcon(crearCuenta.class.getResource("/img/logoUE.jpg")));
		logoUE.setBounds(342, 57, 362, 93);
		panelCrearCuenta.add(logoUE);
		
		lblNombreU = new JLabel("Nombre de Usuario");
		lblNombreU.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblNombreU.setForeground(Color.WHITE);
		lblNombreU.setBounds(389, 222, 157, 16);
		panelCrearCuenta.add(lblNombreU);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(389, 250, 280, 26);
		panelCrearCuenta.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		uemIMG = new JLabel("");
		uemIMG.setIcon(new ImageIcon(crearCuenta.class.getResource("/img/uemIMG.jpg")));
		uemIMG.setBounds(0, 0, 307, 484);
		panelCrearCuenta.add(uemIMG);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.datosTutEmp();
			}
		});
		btnVolver.setBounds(390, 420, 124, 43);
		panelCrearCuenta.add(btnVolver);
		
		btnCrear = new JButton("Completar Datos");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.insertarUsuario();
			}
		});
		btnCrear.setBounds(545, 420, 124, 43);
		panelCrearCuenta.add(btnCrear);
		
		lblContrasena = new JLabel("Contrase�a");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblContrasena.setBounds(389, 288, 98, 16);
		panelCrearCuenta.add(lblContrasena);
		
		lblRepetirContrasea = new JLabel("Repetir Contrase�a");
		lblRepetirContrasea.setForeground(Color.WHITE);
		lblRepetirContrasea.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblRepetirContrasea.setBounds(389, 354, 187, 16);
		panelCrearCuenta.add(lblRepetirContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(389, 316, 280, 26);
		panelCrearCuenta.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(389, 382, 280, 26);
		panelCrearCuenta.add(passwordField_1);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(389, 162, 280, 43);
		panelCrearCuenta.add(panel);
		
		lblInformacion = new JLabel("Introduce los datos");
		lblInformacion.setToolTipText("");
		lblInformacion.setBounds(6, 0, 268, 43);
		panel.add(lblInformacion);
		
		lblIncorrecto = new JLabel("");
		lblIncorrecto.setForeground(new Color(220, 20, 60));
		lblIncorrecto.setBounds(6, 0, 268, 43);
		panel.add(lblIncorrecto);
	}
	
	public String getNombreUsuario() {
		return textFieldUsuario.getText();
	}
	
	public String getPasswd() {
		if (String.valueOf(passwordField.getPassword()).equals(String.valueOf(passwordField_1.getPassword()))) {
			return String.valueOf(passwordField.getPassword());
		} else {
			return null;
		}
		
	}

	public void actualizar() {
				
	}
}
