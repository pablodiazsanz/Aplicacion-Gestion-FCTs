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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class verificacion extends JFrame implements Vistas {

	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JPanel panelVerificacion;
	private JLabel logoUE;
	private JButton btnCrear;
	private JButton btnVolver;
	private JLabel uemIMG;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnTutor;
	private JRadioButton rdbtnEmpresa;
	private JPanel panel;
	private JLabel lblInformacion;
	private JLabel lblIncorrecto;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public verificacion() {
		setTitle("Aplicacion de Gestion de FCTs - UEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 506);
//		setExtendedState(6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelVerificacion = new JPanel();
		panelVerificacion.setBackground(new Color(220, 20, 60));
		panelVerificacion.setBounds(0, 0, 744, 484);
		contentPane.add(panelVerificacion);
		panelVerificacion.setLayout(null);

		logoUE = new JLabel("");
		logoUE.setIcon(new ImageIcon(crearCuenta.class.getResource("/img/logoUE.jpg")));
		logoUE.setBounds(342, 57, 362, 93);
		panelVerificacion.add(logoUE);

		btnCrear = new JButton("Continuar");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.comprobarVerificacion();
			}
		});
		btnCrear.setBounds(546, 420, 124, 43);
		panelVerificacion.add(btnCrear);

		uemIMG = new JLabel("");
		uemIMG.setIcon(new ImageIcon(crearCuenta.class.getResource("/img/uemIMG.jpg")));
		uemIMG.setBounds(0, 0, 307, 484);
		panelVerificacion.add(uemIMG);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				miControlador.volverLogin();
			}
		});
		btnVolver.setBounds(389, 420, 124, 43);
		panelVerificacion.add(btnVolver);

		rdbtnTutor = new JRadioButton("Tutor");
		buttonGroup.add(rdbtnTutor);
		rdbtnTutor.setForeground(Color.WHITE);
		rdbtnTutor.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		rdbtnTutor.setBounds(389, 274, 66, 23);
		panelVerificacion.add(rdbtnTutor);

		rdbtnEmpresa = new JRadioButton("Empresa");
		buttonGroup.add(rdbtnEmpresa);
		rdbtnEmpresa.setForeground(Color.WHITE);
		rdbtnEmpresa.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		rdbtnEmpresa.setBounds(546, 274, 85, 23);
		panelVerificacion.add(rdbtnEmpresa);

		JLabel lblNewLabel = new JLabel("Registrar como:");
		lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(389, 239, 119, 23);
		panelVerificacion.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(389, 344, 281, 23);
		panelVerificacion.add(textField);
		textField.setColumns(10);

		JLabel lblCdigoDeVerificacin = new JLabel("C�digo de Verificaci�n:");
		lblCdigoDeVerificacin.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		lblCdigoDeVerificacin.setForeground(Color.WHITE);
		lblCdigoDeVerificacin.setBounds(389, 309, 202, 23);
		panelVerificacion.add(lblCdigoDeVerificacin);
		
		panel = new JPanel();
		panel.setBounds(389, 176, 280, 43);
		panelVerificacion.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		lblInformacion = new JLabel("Verifique su identidad");
		lblInformacion.setToolTipText("");
		lblInformacion.setBounds(6, 0, 268, 43);
		panel.add(lblInformacion);
		
		lblIncorrecto = new JLabel("");
		lblIncorrecto.setForeground(new Color(220, 20, 60));
		lblIncorrecto.setBounds(6, 0, 268, 43);
		panel.add(lblIncorrecto);
		
		lblNewLabel_1 = new JLabel("Tutor: tutor123");
		lblNewLabel_1.setBounds(394, 379, 119, 16);
		panelVerificacion.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Empresa: empresa123");
		lblNewLabel_2.setBounds(526, 379, 144, 16);
		panelVerificacion.add(lblNewLabel_2);
	}

	public String getRdButton() {
		if (rdbtnEmpresa.isSelected()) {
			System.out.println("Empresa");
			return "empresa";
		} else if (rdbtnTutor.isSelected()) {
			System.out.println("Tutor");
			return "tutor";
		}
		return null;
	}

	public String getCodVerificacion() {
		return textField.getText();
	}

	public void actualizar() {
		String resultado = miModelo.getResultado();
		if (resultado.equals("Correcto")) {
			lblIncorrecto.setText("");
			lblInformacion.setText("Verifique su identidad");
			miControlador.crearNuevaCuenta();
		} else if (resultado.equals("Cerrar")) {
			System.exit(0);
		} else {
			lblInformacion.setText("");
			lblIncorrecto.setText("Codigo de Verificacion incorrecto");
		}
	}
}
