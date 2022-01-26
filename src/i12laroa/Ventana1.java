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

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 499, 370);
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
		
		JComboBox comboBoxPais = new JComboBox();
		comboBoxPais.setModel(new DefaultComboBoxModel(new String[] {"España", "Francia", "Portugal", "Italia"}));
		comboBoxPais.setBounds(254, 211, 156, 24);
		contentPane.add(comboBoxPais);
		
		JLabel lblLocalidadDepartamento_1 = new JLabel("Localidad Departamento");
		lblLocalidadDepartamento_1.setBounds(48, 167, 175, 15);
		contentPane.add(lblLocalidadDepartamento_1);
	}
}
