package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmClientes extends JFrame {

	private JPanel contentPane;
	private JTable tblClientes;
	private JTextField txtId;
	private JTextField txtCi;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtDeuda;

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
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.LIGHT_GRAY);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new TitledBorder(null, "Listado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 500, 530);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		tblClientes = new JTable();
		tblClientes.setForeground(Color.LIGHT_GRAY);
		tblClientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "CI", "Edad", "Deuda"
			}
		));
		tblClientes.setBounds(10, 22, 480, 497);
		panel_1.add(tblClientes);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(520, 11, 244, 530);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 30, 46, 14);
		panel_2.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(10, 50, 200, 20);
		panel_2.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblCi = new JLabel("CI");
		lblCi.setBounds(10, 100, 46, 14);
		panel_2.add(lblCi);
		
		txtCi = new JTextField();
		txtCi.setColumns(10);
		txtCi.setBounds(10, 120, 200, 20);
		panel_2.add(txtCi);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 170, 46, 14);
		panel_2.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(10, 190, 200, 20);
		panel_2.add(txtNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 240, 46, 14);
		panel_2.add(lblEdad);
		
		txtEdad = new JTextField();
		
		txtEdad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			       char caracter = e.getKeyChar();

			   // Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
				    (caracter > '9')) &&
				    (caracter != '\b' /*corresponde a BACK_SPACE*/))
				    {
				    	e.consume();  // ignorar el evento de teclado
				    }
			}
		});
		txtEdad.setColumns(10);
		txtEdad.setBounds(10, 260, 200, 20);
		panel_2.add(txtEdad);
		
		JLabel lblDeuda = new JLabel("Deuda");
		lblDeuda.setBounds(10, 310, 46, 14);
		panel_2.add(lblDeuda);
		
		txtDeuda = new JTextField();
		txtDeuda.setColumns(10);
		txtDeuda.setBounds(10, 330, 200, 20);
		panel_2.add(txtDeuda);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//JOptionPane.showMessageDialog(null, "testing, it works!");
				String  ci 		= txtCi.getText();
				String  nombre 	= txtNombre.getText();
				Integer edad	= Integer.parseInt( txtEdad.getText() );
				String  deuda 	= txtDeuda.getText();
				
			}
		});
		btnAgregar.setBounds(121, 380, 89, 23);
		panel_2.add(btnAgregar);
		
		this.setLocationRelativeTo(null);
	}
}
