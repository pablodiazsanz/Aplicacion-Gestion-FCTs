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

public class datosTutEmp extends JFrame implements Vistas{
	
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JPanel panelCrearCuenta;
	private JLabel logoUE;
	private JLabel lblNombreU;
	private JTextField textFieldUsuario;
	private JButton btnContinuar;
	private JLabel uemIMG;
	private JTextField textFieldPrimerApe;
	private JTextField textFieldDNI;
	private JTextField textFieldCodCentro;
	private JLabel lblInformacion;
	private JLabel lblIncorrecto;
	private JLabel lblUsuario;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public datosTutEmp() {
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
		logoUE.setIcon(new ImageIcon(datosTutEmp.class.getResource("/img/logoUE.jpg")));
		logoUE.setBounds(342, 57, 362, 93);
		panelCrearCuenta.add(logoUE);
		
		lblNombreU = new JLabel("Nombre");
		lblNombreU.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblNombreU.setForeground(Color.WHITE);
		lblNombreU.setBounds(389, 222, 157, 16);
		panelCrearCuenta.add(lblNombreU);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(389, 250, 280, 26);
		panelCrearCuenta.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		uemIMG = new JLabel("");
		uemIMG.setIcon(new ImageIcon(datosTutEmp.class.getResource("/img/uemIMG.jpg")));
		uemIMG.setBounds(0, 0, 307, 484);
		panelCrearCuenta.add(uemIMG);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.Verificacion();
			}
		});
		btnVolver.setBounds(390, 420, 124, 43);
		panelCrearCuenta.add(btnVolver);
		
		btnContinuar = new JButton("Crear Cuenta");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.insertarTutEmp();
			}
		});
		btnContinuar.setBounds(545, 420, 124, 43);
		panelCrearCuenta.add(btnContinuar);
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido");
		lblPrimerApellido.setForeground(Color.WHITE);
		lblPrimerApellido.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblPrimerApellido.setBounds(389, 288, 157, 16);
		panelCrearCuenta.add(lblPrimerApellido);
		
		textFieldPrimerApe = new JTextField();
		textFieldPrimerApe.setColumns(10);
		textFieldPrimerApe.setBounds(389, 316, 280, 26);
		panelCrearCuenta.add(textFieldPrimerApe);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setForeground(Color.WHITE);
		lblDNI.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblDNI.setBounds(389, 354, 130, 16);
		panelCrearCuenta.add(lblDNI);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setColumns(10);
		textFieldDNI.setBounds(389, 382, 130, 26);
		panelCrearCuenta.add(textFieldDNI);
		
		textFieldCodCentro = new JTextField();
		textFieldCodCentro.setColumns(10);
		textFieldCodCentro.setBounds(539, 382, 130, 26);
		panelCrearCuenta.add(textFieldCodCentro);
		
		JLabel lblCodCentro = new JLabel("Cod. del centro");
		lblCodCentro.setForeground(Color.WHITE);
		lblCodCentro.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblCodCentro.setBounds(545, 354, 130, 16);
		panelCrearCuenta.add(lblCodCentro);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(389, 162, 280, 43);
		panelCrearCuenta.add(panel);
		
		lblInformacion = new JLabel("Complete los datos,");
		lblInformacion.setToolTipText("");
		lblInformacion.setBounds(6, 0, 130, 43);
		panel.add(lblInformacion);
		
		lblIncorrecto = new JLabel("");
		lblIncorrecto.setForeground(new Color(220, 20, 60));
		lblIncorrecto.setBounds(6, 0, 257, 43);
		panel.add(lblIncorrecto);
		
		lblUsuario = new JLabel("");
		lblUsuario.setToolTipText("");
		lblUsuario.setBounds(138, 0, 142, 43);
		panel.add(lblUsuario);
	}
	
	public String getNombre() {
		return textFieldUsuario.getText();
	}
	
	public String getApellido() {
		return textFieldPrimerApe.getText();
	}
	
	public String getDNI() {
		return textFieldDNI.getText();
	}
	
	public String getCodCentro() {
		return textFieldCodCentro.getText();
	}

	public void actualizar() {
		String usr = miModelo.getUser();
		lblUsuario.setText(usr);
		miControlador.datosTutEmp();
	}
	
	public String getNomUsr() {
		return lblUsuario.getText();
	}
	
	public void volver() {
		miControlador.volverLogin();
	}
}
