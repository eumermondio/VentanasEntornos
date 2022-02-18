package ventanasMenu;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class InformeCliente extends JPanel {

	/**
	 * Create the panel.
	 */
	public InformeCliente() {
		setLayout(null);
		
		JLabel lblInformeClientes = new JLabel("INFORME CLIENTES");
		lblInformeClientes.setBounds(148, 126, 269, 64);
		add(lblInformeClientes);

	}
}
