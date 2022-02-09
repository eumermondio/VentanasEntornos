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
import java.awt.Font;
import javax.swing.JScrollPane;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBoxProducto;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnextraPremium;
	private JRadioButton rdbtnPremium;
	private JRadioButton rdbtnPrimera;
	private JRadioButton rdbtnSegunda;
	private JCheckBox chckbxInforme;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JTextArea textArea;

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
		setTitle("Gestión de productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 461, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDatosDeDepartamentos = new JLabel("ENTRADA DE DATOS DE PRODUCTOS");
		lblDatosDeDepartamentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDeDepartamentos.setForeground(Color.BLACK);
		lblDatosDeDepartamentos.setBounds(95, 12, 259, 31);
		contentPane.add(lblDatosDeDepartamentos);

		JLabel lblNombreDepartamento = new JLabel("Nombre del producto");
		lblNombreDepartamento.setBounds(48, 55, 175, 15);
		contentPane.add(lblNombreDepartamento);

		JLabel lblLocalidadDepartamento = new JLabel("Tipo de producto");
		lblLocalidadDepartamento.setBounds(48, 158, 175, 15);
		contentPane.add(lblLocalidadDepartamento);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(254, 55, 174, 19);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(254, 107, 174, 19);
		contentPane.add(textField_2);

		JButton btnInsertarDatos = new JButton("Ver datos");
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textArea.setText("\t               VER DATOS");
				textArea.append("\nNombre del producto: " + textField_1.getText());
				textArea.append("\nPrecio del producto: " + textField_2.getText());
				textArea.append("\nTipo de producto: " + comboBoxProducto.getSelectedItem());

				ButtonModel extraPremium = rdbtnextraPremium.getModel();
				ButtonModel premium = rdbtnPremium.getModel();
				ButtonModel primera = rdbtnPrimera.getModel();
				ButtonModel segunda = rdbtnSegunda.getModel();

				ButtonModel iva4 = radioButton.getModel();
				ButtonModel iva10 = radioButton_1.getModel();
				ButtonModel iva21 = radioButton_2.getModel();

				if (buttonGroup.getSelection() != null) {
					if (buttonGroup.getSelection().equals(extraPremium)) {
						textArea.append("\nCategoría: " + rdbtnextraPremium.getText());
					}
					if (buttonGroup.getSelection().equals(premium)) {
						textArea.append("\nCategoría: " + rdbtnPremium.getText());
					}
					if (buttonGroup.getSelection().equals(primera)) {
						textArea.append("\nCategoría: " + rdbtnPrimera.getText());
					}
					if (buttonGroup.getSelection().equals(segunda)) {
						textArea.append("\nCategoría: " + rdbtnSegunda.getText());
					}
				} else {
					textArea.append("\nCategoría: No Seleccionada");
				}

				if (buttonGroup_1.getSelection() != null) {
					if (buttonGroup_1.getSelection().equals(iva4)) {
						textArea.append("\nIVA: 4%");
					}
					if (buttonGroup_1.getSelection().equals(iva10)) {
						textArea.append("\nIVA: 10%");
					}
					if (buttonGroup_1.getSelection().equals(iva21)) {
						textArea.append("\nIVA: 21%");
					}
				} else {
					textArea.append("\nIVA: No Seleccionado");
				}

				if (chckbxInforme.isSelected()) {
					textArea.append("\nTasa aplicada");
				} else {
					textArea.append("\nTasa no aplicada");
				}
			}
		});
		btnInsertarDatos.setForeground(Color.WHITE);
		btnInsertarDatos.setBackground(Color.BLUE);
		btnInsertarDatos.setBounds(48, 347, 149, 25);
		contentPane.add(btnInsertarDatos);

		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
				textArea.setText("");
			}
		});
		btnLimpiarDatos.setForeground(Color.WHITE);
		btnLimpiarDatos.setBackground(Color.BLUE);
		btnLimpiarDatos.setBounds(254, 347, 149, 25);
		contentPane.add(btnLimpiarDatos);

		comboBoxProducto = new JComboBox();
		comboBoxProducto
				.setModel(new DefaultComboBoxModel(new String[] { "Nacional", "Importado", "Anual", "De temporada" }));
		comboBoxProducto.setBounds(254, 153, 156, 24);
		contentPane.add(comboBoxProducto);

		JLabel lblLocalidadDepartamento_1 = new JLabel("Precio del producto");
		lblLocalidadDepartamento_1.setBounds(48, 109, 175, 15);
		contentPane.add(lblLocalidadDepartamento_1);

		JLabel lblTipoDepartamento = new JLabel("Categoría");
		lblTipoDepartamento.setBounds(48, 200, 156, 15);
		contentPane.add(lblTipoDepartamento);

		rdbtnextraPremium = new JRadioButton("Extra Premium");
		rdbtnextraPremium.setForeground(Color.BLUE);
		buttonGroup.add(rdbtnextraPremium);
		rdbtnextraPremium.setBounds(182, 196, 149, 23);
		contentPane.add(rdbtnextraPremium);

		rdbtnPremium = new JRadioButton("Premium");
		rdbtnPremium.setForeground(Color.BLUE);
		buttonGroup.add(rdbtnPremium);
		rdbtnPremium.setBounds(351, 196, 92, 23);
		contentPane.add(rdbtnPremium);

		rdbtnPrimera = new JRadioButton("Primera");
		rdbtnPrimera.setForeground(Color.BLUE);
		buttonGroup.add(rdbtnPrimera);
		rdbtnPrimera.setBounds(351, 237, 92, 23);
		contentPane.add(rdbtnPrimera);

		rdbtnSegunda = new JRadioButton("Segunda");
		rdbtnSegunda.setForeground(Color.BLUE);
		buttonGroup.add(rdbtnSegunda);
		rdbtnSegunda.setBounds(182, 237, 149, 23);
		contentPane.add(rdbtnSegunda);

		chckbxInforme = new JCheckBox("Aplicar tasa");
		chckbxInforme.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		chckbxInforme.setBounds(322, 288, 129, 23);
		contentPane.add(chckbxInforme);

		JLabel lblIva = new JLabel("IVA");
		lblIva.setBounds(48, 292, 84, 15);
		contentPane.add(lblIva);

		radioButton = new JRadioButton("10%");
		buttonGroup_1.add(radioButton);
		radioButton.setBounds(182, 288, 59, 23);
		contentPane.add(radioButton);

		radioButton_1 = new JRadioButton("4%");
		buttonGroup_1.add(radioButton_1);
		radioButton_1.setBounds(121, 288, 50, 23);
		contentPane.add(radioButton_1);

		radioButton_2 = new JRadioButton("21%");
		buttonGroup_1.add(radioButton_2);
		radioButton_2.setBounds(254, 288, 59, 23);
		contentPane.add(radioButton_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 395, 355, 165);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setText("");
		textArea.setEditable(false);
	}
}
