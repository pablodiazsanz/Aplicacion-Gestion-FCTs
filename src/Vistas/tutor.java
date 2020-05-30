package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Aplicacion.Controlador;
import Aplicacion.Modelo;
import Aplicacion.Vistas;

public class tutor extends JFrame implements Vistas{

	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JLabel logoUEM;
	private JLabel lblUsuario;
	private JButton btnExit;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private JButton btnGrupos;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public tutor() {
		setTitle("Aplicacion de Gestion de FCTs - UEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 506);
//		setExtendedState(6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(0, 0, 744, 484);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(16, 16, 710, 77);
		panel_1.add(panel);
		panel.setLayout(null);

		logoUEM = new JLabel("");
		logoUEM.setIcon(new ImageIcon(tutor.class.getResource("/img/logoUEM.jpg")));
		logoUEM.setBounds(6, 6, 67, 65);
		panel.add(logoUEM);

		btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cerrarSesion();
			}
		});
		btnExit.setIcon(new ImageIcon(tutor.class.getResource("/img/logoOUT.jpg")));
		btnExit.setBounds(642, 6, 62, 65);
		panel.add(btnExit);

		lblUsuario = new JLabel("");
		lblUsuario.setBounds(477, 18, 153, 16);
		panel.add(lblUsuario);

		JLabel lblDirector = new JLabel("Tutor del centro");
		lblDirector.setBounds(529, 46, 101, 16);
		panel.add(lblDirector);

		JLabel lblNewLabel = new JLabel("INICIO");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		lblNewLabel.setBounds(295, 6, 110, 65);
		panel.add(lblNewLabel);

		btnAlumnos = new JButton("Alumnos");
		btnAlumnos.setIcon(new ImageIcon(tutor.class.getResource("/img/estudiantes.png")));
		btnAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorAlumnos();
			}
		});
		btnAlumnos.setBackground(new Color(220, 20, 60));
		btnAlumnos.setBounds(45, 213, 188, 140);
		panel_1.add(btnAlumnos);

		btnEmpresas = new JButton("Empresas");
		btnEmpresas.setIcon(new ImageIcon(tutor.class.getResource("/img/empresa.png")));
		btnEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorEmpresas();
			}
		});
		btnEmpresas.setBackground(new Color(220, 20, 60));
		btnEmpresas.setBounds(511, 213, 188, 140);
		panel_1.add(btnEmpresas);

		btnGrupos = new JButton("Grupos");
		btnGrupos.setIcon(new ImageIcon(tutor.class.getResource("/img/grupo.png")));
		btnGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.tutorGrupos();
			}
		});
		btnGrupos.setBackground(new Color(220, 20, 60));
		btnGrupos.setBounds(279, 213, 188, 140);
		panel_1.add(btnGrupos);

	}

	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
}
