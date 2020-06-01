package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import Aplicacion.Controlador;
import Aplicacion.Modelo;
import Aplicacion.Vistas;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class dirInformes extends JFrame implements Vistas {

	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JPanel panelCabecera;
	private JLabel logoUEM;
	private JLabel lblUsuario;
	private JLabel lblDirector;
	private JLabel lblAlumnos;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnMostrar;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public dirInformes() {
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

		lblUsuario = new JLabel("Usuario: Ana Manzanero");
		lblUsuario.setBounds(622, 16, 152, 16);
		panelCabecera.add(lblUsuario);

		lblAlumnos = new JLabel("INFORMES");
		lblAlumnos.setBounds(333, 6, 177, 65);
		panelCabecera.add(lblAlumnos);
		lblAlumnos.setFont(new Font("Lucida Grande", Font.PLAIN, 36));

		JButton btnExit_1 = new JButton("");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.volverDirector();
			}
		});
		btnExit_1.setIcon(new ImageIcon(dirInformes.class.getResource("/img/volver.png")));
		btnExit_1.setBounds(780, 6, 67, 65);
		panelCabecera.add(btnExit_1);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorGruposBuscar();
			}
		});
		btnMostrar.setIcon(new ImageIcon(dirInformes.class.getResource("/img/buscar.png")));
		btnMostrar.setBounds(674, 153, 175, 48);
		panel.add(btnMostrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 213, 816, 383);
		panel.add(scrollPane);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		scrollPane.setViewportView(table);
		
		JRadioButton rdbtnAT = new JRadioButton("Alumnos por Tutor");
		buttonGroup.add(rdbtnAT);
		rdbtnAT.setForeground(Color.WHITE);
		rdbtnAT.setBounds(57, 120, 151, 23);
		panel.add(rdbtnAT);
		
		JRadioButton rdbtnAE = new JRadioButton("Alumnos por Empresa");
		buttonGroup.add(rdbtnAE);
		rdbtnAE.setForeground(Color.WHITE);
		rdbtnAE.setBounds(373, 120, 175, 23);
		panel.add(rdbtnAE);
		
		JRadioButton rdbtnTC = new JRadioButton("Tutores por Ciclo");
		buttonGroup.add(rdbtnTC);
		rdbtnTC.setForeground(Color.WHITE);
		rdbtnTC.setBounds(220, 120, 141, 23);
		panel.add(rdbtnTC);
		
		JRadioButton rdbtnAPT = new JRadioButton("Alumnos en practicas por Tutor");
		buttonGroup.add(rdbtnAPT);
		rdbtnAPT.setForeground(Color.WHITE);
		rdbtnAPT.setBounds(560, 120, 231, 23);
		panel.add(rdbtnAPT);
		
		JRadioButton rdbtnIA = new JRadioButton("Informe que piden las aseguradoras");
		buttonGroup.add(rdbtnIA);
		rdbtnIA.setForeground(Color.WHITE);
		rdbtnIA.setBounds(392, 155, 257, 23);
		panel.add(rdbtnIA);
		
		JRadioButton rdbtnIP = new JRadioButton("Informe general para la gestion de las practicas");
		buttonGroup.add(rdbtnIP);
		rdbtnIP.setForeground(Color.WHITE);
		rdbtnIP.setBounds(56, 155, 330, 23);
		panel.add(rdbtnIP);

		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				table.setModel(miModelo.getTablaDirGrupos());
			}
		});
	}
	
	public void nombre() {
		String nombre = miModelo.getNombre();
		lblUsuario.setText("Usuario: " + nombre);
	}
}
