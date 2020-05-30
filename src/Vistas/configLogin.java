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

public class configLogin extends JFrame implements Vistas{
	
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JPanel panelCrearCuenta;
	private JLabel logoUE;
	private JLabel lblUsuarioBD;
	private JTextField txtUsuario;
	private JLabel lblContrasenaBD;
	private JButton btnCrear;
	private JLabel uemIMG;
	private JLabel lblURLBD;
	private JTextField txtContrasena;
	private JTextField txtURL;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public configLogin() {
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
		
		uemIMG = new JLabel("");
		uemIMG.setIcon(new ImageIcon(configLogin.class.getResource("/img/uemIMG.jpg")));
		uemIMG.setBounds(0, 0, 307, 484);
		panelCrearCuenta.add(uemIMG);
		
		logoUE = new JLabel("");
		logoUE.setIcon(new ImageIcon(configLogin.class.getResource("/img/logoUE.jpg")));
		logoUE.setBounds(342, 57, 362, 93);
		panelCrearCuenta.add(logoUE);
		
		lblUsuarioBD = new JLabel("Usuario BD");
		lblUsuarioBD.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblUsuarioBD.setForeground(Color.WHITE);
		lblUsuarioBD.setBounds(389, 193, 157, 16);
		panelCrearCuenta.add(lblUsuarioBD);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(389, 221, 280, 26);
		panelCrearCuenta.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasenaBD = new JLabel("Contrase�a BD");
		lblContrasenaBD.setForeground(Color.WHITE);
		lblContrasenaBD.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblContrasenaBD.setBounds(389, 259, 124, 16);
		panelCrearCuenta.add(lblContrasenaBD);
		
		txtContrasena = new JTextField();
		txtContrasena.setColumns(10);
		txtContrasena.setBounds(389, 287, 280, 26);
		panelCrearCuenta.add(txtContrasena);
		
		lblURLBD = new JLabel("URL BD");
		lblURLBD.setForeground(Color.WHITE);
		lblURLBD.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblURLBD.setBounds(389, 325, 144, 16);
		panelCrearCuenta.add(lblURLBD);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.volverLogin();
			}
		});
		
		txtURL = new JTextField();
		txtURL.setColumns(10);
		txtURL.setBounds(389, 353, 280, 26);
		panelCrearCuenta.add(txtURL);
		btnVolver.setBounds(389, 405, 124, 43);
		panelCrearCuenta.add(btnVolver);
		
		btnCrear = new JButton("Actualizar");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizarBD();
			}
		});
		btnCrear.setBounds(545, 405, 124, 43);
		panelCrearCuenta.add(btnCrear);
	}
	
	public String getUserBD(){
		return txtUsuario.getText();
	}
	
	public String getPasswdBD(){
		return txtContrasena.getText();
	}
	
	public String getUrlBD(){
		return txtURL.getText();
	}

	public void actualizar() {
		txtUsuario.setText(miModelo.getUser());
		txtContrasena.setText(miModelo.getPasswd());
		txtURL.setText(miModelo.getUrl());
	}
}
