package i12laroa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBoxPais;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnAdministracin;
	private JRadioButton rdbtnInformatica;
	private JRadioButton rdbtnContabilidad;
	private JCheckBox chckbxInforme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setTitle("Ventana 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDatosDeDepartamentos = new JLabel("DATOS DE DEPARTAMENTOS");
		lblDatosDeDepartamentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDeDepartamentos.setForeground(Color.BLUE);
		lblDatosDeDepartamentos.setBounds(124, 12, 193, 31);
		contentPane.add(lblDatosDeDepartamentos);

		JLabel lblNewLabel = new JLabel("Código Departamento");
		lblNewLabel.setBounds(48, 55, 156, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNombreDepartamento = new JLabel("Nombre Departamento");
		lblNombreDepartamento.setBounds(48, 109, 175, 15);
		contentPane.add(lblNombreDepartamento);

		JLabel lblLocalidadDepartamento = new JLabel("Selecciona el país");
		lblLocalidadDepartamento.setBounds(48, 216, 175, 15);
		contentPane.add(lblLocalidadDepartamento);

		textField = new JTextField();
		textField.setBounds(254, 51, 75, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(254, 107, 174, 19);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(254, 165, 174, 19);
		contentPane.add(textField_2);

		JButton btnInsertarDatos = new JButton("Insertar Datos");
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN INSERTAR DATOS.");
				System.out.println("Código tecleado en Código: " + textField.getText());
				System.out.println("Código tecleado en Nombre: " + textField_1.getText());
				System.out.println("Código tecleado en Dpto: " + textField_2.getText());
				System.out.println("Posición: " + comboBoxPais.getSelectedIndex());
				System.out.println("Contenido: " + comboBoxPais.getSelectedItem());
				ButtonModel personal = rdbtnNewRadioButton.getModel();
				ButtonModel admin = rdbtnAdministracin.getModel();
				ButtonModel inform = rdbtnInformatica.getModel();
				ButtonModel contab = rdbtnContabilidad.getModel();
				if (buttonGroup.getSelection() != null) {
					if (buttonGroup.getSelection().equals(personal)) {
						System.out.println("Has pulsado Personal.");
					}
					if (buttonGroup.getSelection().equals(admin)) {
						System.out.println("Has pulsado Administración.");
					}
					if (buttonGroup.getSelection().equals(inform)) {
						System.out.println("Has pulsado Informática.");
					}
					if (buttonGroup.getSelection().equals(contab)) {
						System.out.println("Has pulsado Contabilidad.");
					}
				}
				if (chckbxInforme.isSelected()) {
					System.out.println("Check pulsado. " + chckbxInforme.getText());
				}
			}
		});
		btnInsertarDatos.setForeground(Color.WHITE);
		btnInsertarDatos.setBackground(Color.BLUE);
		btnInsertarDatos.setBounds(48, 268, 149, 25);
		contentPane.add(btnInsertarDatos);

		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN LIMPIAR DATOS.");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnLimpiarDatos.setForeground(Color.WHITE);
		btnLimpiarDatos.setBackground(Color.BLUE);
		btnLimpiarDatos.setBounds(261, 268, 149, 25);
		contentPane.add(btnLimpiarDatos);

		comboBoxPais = new JComboBox();
		comboBoxPais.setModel(new DefaultComboBoxModel(new String[] { "España", "Francia", "Portugal", "Italia" }));
		comboBoxPais.setBounds(254, 211, 156, 24);
		contentPane.add(comboBoxPais);

		JLabel lblLocalidadDepartamento_1 = new JLabel("Localidad Departamento");
		lblLocalidadDepartamento_1.setBounds(48, 167, 175, 15);
		contentPane.add(lblLocalidadDepartamento_1);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(48, 309, 380, 156);
		contentPane.add(textArea);
		textArea.setText("");
		textArea.setText("Primera línea.");

		JLabel lblTipoDepartamento = new JLabel("Tipo Departamento");
		lblTipoDepartamento.setBounds(452, 55, 156, 15);
		contentPane.add(lblTipoDepartamento);

		rdbtnNewRadioButton = new JRadioButton("Personal");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(459, 92, 149, 23);
		contentPane.add(rdbtnNewRadioButton);

		rdbtnAdministracin = new JRadioButton("Administración");
		buttonGroup.add(rdbtnAdministracin);
		rdbtnAdministracin.setBounds(459, 137, 149, 23);
		contentPane.add(rdbtnAdministracin);

		rdbtnInformatica = new JRadioButton("Informatica");
		buttonGroup.add(rdbtnInformatica);
		rdbtnInformatica.setBounds(459, 183, 149, 23);
		contentPane.add(rdbtnInformatica);

		rdbtnContabilidad = new JRadioButton("Contabilidad");
		buttonGroup.add(rdbtnContabilidad);
		rdbtnContabilidad.setBounds(459, 227, 149, 23);
		contentPane.add(rdbtnContabilidad);

		chckbxInforme = new JCheckBox("Informe");
		chckbxInforme.setBounds(459, 269, 129, 23);
		contentPane.add(chckbxInforme);
		textArea.append("\nSegunda línea");
		textArea.append("\nTercera línea");
	}
}
