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

public class dirGrupos extends JFrame implements Vistas {

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
	private JButton btnConsultar;
	private JButton btnBuscar;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public dirGrupos() {
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

		lblAlumnos = new JLabel("GRUPOS");
		lblAlumnos.setBounds(333, 6, 177, 65);
		panelCabecera.add(lblAlumnos);
		lblAlumnos.setFont(new Font("Lucida Grande", Font.PLAIN, 36));

		JButton btnExit_1 = new JButton("");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.volverDirector();
			}
		});
		btnExit_1.setIcon(new ImageIcon(dirGrupos.class.getResource("/img/volver.png")));
		btnExit_1.setBounds(780, 6, 67, 65);
		panelCabecera.add(btnExit_1);

		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorGrupos();
			}
		});
		btnConsultar.setBackground(Color.DARK_GRAY);
		btnConsultar.setIcon(new ImageIcon(dirGrupos.class.getResource("/img/consultar.png")));
		btnConsultar.setBounds(22, 134, 175, 65);
		panel.add(btnConsultar);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.directorGruposBuscar();
			}
		});
		btnBuscar.setIcon(new ImageIcon(dirGrupos.class.getResource("/img/buscar.png")));
		btnBuscar.setBounds(22, 226, 175, 65);
		panel.add(btnBuscar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(254, 134, 602, 451);
		panel.add(scrollPane);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		scrollPane.setViewportView(table);

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
