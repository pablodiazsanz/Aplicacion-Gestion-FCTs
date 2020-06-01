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

public class director extends JFrame implements Vistas{

	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JLabel logoUEM;
	private JLabel lblUsuario;
	private JButton btnExit;
	private JButton btnAlumnos;
	private JButton btnTutores;
	private JButton btnEmpresas;
	private JButton btnGrupos;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public director() {
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
		logoUEM.setIcon(new ImageIcon(director.class.getResource("/img/logoUEM.jpg")));
		logoUEM.setBounds(6, 6, 67, 65);
		panel.add(logoUEM);

		btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cerrarSesion();
			}
		});
		btnExit.setIcon(new ImageIcon(director.class.getResource("/img/logoOUT.jpg")));
		btnExit.setBounds(642, 6, 62, 65);
		panel.add(btnExit);

		lblUsuario = new JLabel("");
		lblUsuario.setBounds(478, 18, 152, 16);
		panel.add(lblUsuario);

		JLabel lblDirector = new JLabel("Directora del centro");
		lblDirector.setBounds(505, 46, 125, 16);
		panel.add(lblDirector);

		JLabel lblNewLabel = new JLabel("INICIO");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		lblNewLabel.setBounds(295, 6, 110, 65);
		panel.add(lblNewLabel);

		btnAlumnos = new JButton("Alumnos");
		btnAlumnos.setIcon(new ImageIcon(director.class.getResource("/img/estudiantes.png")));
		btnAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorAlumno();
			}
		});
		btnAlumnos.setBackground(new Color(220, 20, 60));
		btnAlumnos.setBounds(74, 129, 188, 140);
		panel_1.add(btnAlumnos);

		btnTutores = new JButton("Tutores");
		btnTutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorTutores();
			}
		});
		btnTutores.setIcon(new ImageIcon(director.class.getResource("/img/tutor.png")));
		btnTutores.setBackground(new Color(220, 20, 60));
		btnTutores.setBounds(74, 306, 188, 140);
		panel_1.add(btnTutores);

		btnEmpresas = new JButton("Empresas");
		btnEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorEmpresas();
			}
		});
		btnEmpresas.setIcon(new ImageIcon(director.class.getResource("/img/empresa.png")));
		btnEmpresas.setBackground(new Color(220, 20, 60));
		btnEmpresas.setBounds(482, 129, 188, 140);
		panel_1.add(btnEmpresas);

		btnGrupos = new JButton("Grupos");
		btnGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorGrupos();
			}
		});
		btnGrupos.setIcon(new ImageIcon(director.class.getResource("/img/grupo.png")));
		btnGrupos.setBackground(new Color(220, 20, 60));
		btnGrupos.setBounds(482, 306, 188, 140);
		panel_1.add(btnGrupos);
		
		JButton btnInformes = new JButton("Informes");
		btnInformes.setBackground(new Color(220, 20, 60));
		btnInformes.setBounds(297, 233, 152, 111);
		panel_1.add(btnInformes);
	}
	
	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
}
