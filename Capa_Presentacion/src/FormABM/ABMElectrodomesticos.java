package FormABM;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ABMElectrodomesticos extends JFrame {
	private JTextField txtBuscar;
	private JTable tblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABMElectrodomesticos frame = new ABMElectrodomesticos();
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
	public ABMElectrodomesticos() {
		setTitle("ABM Electrodomesticos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 450);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar");
		lblNewLabel.setBounds(97, 42, 79, 14);
		getContentPane().add(lblNewLabel);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(156, 39, 300, 20);
		getContentPane().add(txtBuscar);
		txtBuscar.setColumns(10);
		
		tblResult = new JTable();
		tblResult.setBounds(54, 83, 543, 232);
		getContentPane().add(tblResult);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(87, 350, 89, 23);
		getContentPane().add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(212, 350, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(332, 350, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				int i = JOptionPane.showConfirmDialog(null,"¿Confirma que desea salir?","Confirmar Salida",JOptionPane.YES_NO_OPTION); // Duda 
				if(i==0){
							dispose();
				}								
			}
		});
		btnSalir.setBounds(454, 350, 89, 23);
		getContentPane().add(btnSalir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(484, 38, 89, 23);
		getContentPane().add(btnBuscar);
		
		// ????
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		scrollPane.setViewportView(tlbResult);
		tlbResult.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		tlbResult.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		tlbResult.setModel(model);
	}
}
