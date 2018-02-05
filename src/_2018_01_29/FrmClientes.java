package _2018_01_29;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class FrmClientes extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTable table;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmClientes frame = new FrmClientes();
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
	public FrmClientes() {
		setTitle("Listado Clientes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Listado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 555, 447);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(12, 24, 531, 411);
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(575, 11, 171, 447);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEtiqueta = new JLabel("Id");
		lblEtiqueta.setBounds(12, 36, 83, 16);
		panel_2.add(lblEtiqueta);
		
		txtId = new JTextField();
		txtId.setBounds(12, 64, 133, 20);
		panel_2.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblEtiqueta_1 = new JLabel("Nombre");
		lblEtiqueta_1.setBounds(12, 115, 83, 16);
		panel_2.add(lblEtiqueta_1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(12, 143, 133, 20);
		panel_2.add(txtNombre);
		
		JLabel lblEtiqueta_2 = new JLabel("Edad");
		lblEtiqueta_2.setBounds(12, 199, 83, 16);
		panel_2.add(lblEtiqueta_2);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(12, 227, 133, 20);
		panel_2.add(txtEdad);
		
		JButton btnCrear = new JButton("Crear objeto");
		
		
		
		btnCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//todo code here
				String nombre = txtNombre.getText();
				Integer id = Integer.parseInt( txtId.getText() );
				Integer edad = Integer.parseInt( txtEdad.getText() );
				
				
				JOptionPane.showMessageDialog(null, " Id:        "     + id     +
													" \n Nombre: "     + nombre +
													" \n Edad:   "     + edad   + 
											  		""
											);
				
			}
		});
		
		
		btnCrear.setBounds(34, 275, 111, 26);
		panel_2.add(btnCrear);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
