import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class App extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldTelefono;
	private JTextField textFieldEmail;
	private JTextField textFieldMarca;
	private JTextField textFieldModelo;
	private JTextField textFieldComentarios;
	private JTextField textFieldFecha;
	private JTextField textField_6;
	private JTextField textField_8;
	private Choice choiceEstatus;
	private Choice choiceEstatus1;
	ArrayList<Cliente> ListaClientes = new ArrayList<>();
	
	 private JTable clienteTable;
	    private DefaultTableModel tableModel;
	 private JTextPane textPaneInfo;
	 private JTextPane textPaneReporte;
	 private JTextField textFieldFecha2;
	 private JTextField textFieldEmailReporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 1000);
		setTitle("MiNAVe By Alien Systems");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_Mecanico = new JPanel();
		tabbedPane.addTab("App", null, panel_Mecanico, null);
		panel_Mecanico.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Formulario de cliente nuevo:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel.setBounds(34, 27, 211, 16);
		panel_Mecanico.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(34, 55, 61, 16);
		panel_Mecanico.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setBounds(34, 83, 61, 16);
		panel_Mecanico.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(34, 111, 61, 16);
		panel_Mecanico.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Coche:");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_4.setBounds(34, 139, 61, 16);
		panel_Mecanico.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Marca");
		lblNewLabel_5.setBounds(34, 167, 61, 16);
		panel_Mecanico.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Modelo");
		lblNewLabel_6.setBounds(34, 195, 61, 16);
		panel_Mecanico.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Comentario");
		lblNewLabel_7.setBounds(34, 223, 73, 16);
		panel_Mecanico.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Estatus");
		lblNewLabel_8.setBounds(34, 289, 61, 16);
		panel_Mecanico.add(lblNewLabel_8);
		
		JButton btnGuardar2 = new JButton("Guardar");
	
		btnGuardar2.setBounds(285, 601, 117, 29);
		panel_Mecanico.add(btnGuardar2);
		btnGuardar2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        actualizarClienteSeleccionado();
		        mostrarReporte();
		    }
		});
		
		
		
		JLabel lblNewLabel_9 = new JLabel("Fecha");
		lblNewLabel_9.setBounds(34, 326, 61, 16);
		panel_Mecanico.add(lblNewLabel_9);
		
	
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(115, 50, 130, 26);
		panel_Mecanico.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(115, 78, 130, 26);
		panel_Mecanico.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(115, 106, 130, 26);
		panel_Mecanico.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldMarca = new JTextField();
		textFieldMarca.setBounds(115, 162, 130, 26);
		panel_Mecanico.add(textFieldMarca);
		textFieldMarca.setColumns(10);
		
		textFieldModelo = new JTextField();
		textFieldModelo.setBounds(115, 190, 130, 26);
		panel_Mecanico.add(textFieldModelo);
		textFieldModelo.setColumns(10);
		
		textFieldComentarios = new JTextField();
		textFieldComentarios.setBounds(115, 218, 130, 66);
		panel_Mecanico.add(textFieldComentarios);
		textFieldComentarios.setColumns(10);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setBounds(115, 321, 130, 26);
		panel_Mecanico.add(textFieldFecha);
		textFieldFecha.setColumns(10);
		
		choiceEstatus = new Choice();
		choiceEstatus.setBounds(115, 289, 130, 27);
		choiceEstatus.add("En Espera");
		choiceEstatus.add("Diagnostico");
		choiceEstatus.add("Autorizacion de Costos");
		choiceEstatus.add("Reparacion");
		choiceEstatus.add("Entrega");
		panel_Mecanico.add(choiceEstatus);
		
		JLabel lblNewLabel_10 = new JLabel("Buscador de Clientes:");
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_10.setBounds(267, 27, 178, 16);
		panel_Mecanico.add(lblNewLabel_10);
		
		

		ListaClientes = new ArrayList<>();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Telefono");
        tableModel.addColumn("Coche");

        clienteTable = new JTable(tableModel);
        clienteTable.setPreferredScrollableViewportSize(new Dimension(400, 100));
        clienteTable.setFillsViewportHeight(true);
        clienteTable.setBounds(267, 84, 340, 300);
        panel_Mecanico.add(clienteTable);
        clienteTable.setSize(400, 300); // Establecer el tamaño del JFrame
        clienteTable.setLayout(null); // Utilizar un administrador de diseño nulo para ubicación absoluta
        clienteTable.setVisible(true);
        clienteTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                mostrarInformacionClienteSeleccionado();
               mostrarReporte();
               mostrarEmail();
            }
        });

        
   
		
		
		textField_6 = new JTextField();
		textField_6.setBounds(267, 50, 135, 26);
		panel_Mecanico.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Actualizar Cliente:");
		lblNewLabel_11.setBounds(322, 407, 117, 16);
		panel_Mecanico.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Nuevo comentario:");
		lblNewLabel_12.setBounds(285, 435, 130, 16);
		panel_Mecanico.add(lblNewLabel_12);
		
		textField_8 = new JTextField();
		textField_8.setBounds(285, 463, 239, 66);
		panel_Mecanico.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(125, 359, 117, 29);
		panel_Mecanico.add(btnGuardar);
		btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCliente();
                 
            }
        });
		
		
		 choiceEstatus1 = new Choice();
		choiceEstatus1.setBounds(407, 535, 130, 27);
		choiceEstatus1.add("En Espera");
		choiceEstatus1.add("Diagnostico");
		choiceEstatus1.add("Autorizacion de Costos");
		choiceEstatus1.add("Reparacion");
		choiceEstatus1.add("Entrega");
		panel_Mecanico.add(choiceEstatus1);
		
		JLabel lblNewLabel_13 = new JLabel("Actualizar Estatus");
		lblNewLabel_13.setBounds(285, 541, 130, 16);
		panel_Mecanico.add(lblNewLabel_13);
		
		JButton btnNewButton_5 = new JButton("Buscar");
		btnNewButton_5.setBounds(407, 50, 117, 29);
		panel_Mecanico.add(btnNewButton_5);
		 btnNewButton_5.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            buscarClientePorNombre();
		        }
		    });
		

        
		JLabel lblNewLabel_18 = new JLabel("Informacion del cliente seleccionado:");
		lblNewLabel_18.setBounds(34, 407, 247, 16);
		panel_Mecanico.add(lblNewLabel_18);
		
		 textPaneInfo = new JTextPane();
		textPaneInfo.setBounds(34, 440, 225, 218);
		panel_Mecanico.add(textPaneInfo);
		
		textPaneReporte = new JTextPane();
		textPaneReporte.setBounds(692, 83, 257, 301);
		panel_Mecanico.add(textPaneReporte);
		
		
		JLabel lblNewLabel_19 = new JLabel("Fecha");
		lblNewLabel_19.setBounds(295, 573, 61, 16);
		panel_Mecanico.add(lblNewLabel_19);
		
		textFieldFecha2 = new JTextField();
		textFieldFecha2.setBounds(394, 568, 130, 26);
		panel_Mecanico.add(textFieldFecha2);
		textFieldFecha2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Enviar Reporte");
		btnNewButton_1.setBounds(692, 463, 117, 29);
		panel_Mecanico.add(btnNewButton_1);
		 btnNewButton_1.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            enviarReportePorEmail();
		        }
		    });
		
		textFieldEmailReporte = new JTextField();
		textFieldEmailReporte.setBounds(692, 430, 211, 26);
		panel_Mecanico.add(textFieldEmailReporte);
		textFieldEmailReporte.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("E-mail:");
		lblNewLabel_20.setBounds(692, 407, 61, 16);
		panel_Mecanico.add(lblNewLabel_20);
		
		JLabel lblNewLabel_14 = new JLabel("Reporte Para el Cliente:");
		lblNewLabel_14.setBounds(692, 55, 155, 16);
		panel_Mecanico.add(lblNewLabel_14);
		
		JButton btnEliminaCliente = new JButton("Eliminar Cliente");
		btnEliminaCliente.setBounds(523, 50, 131, 29);
		panel_Mecanico.add(btnEliminaCliente);
		btnEliminaCliente.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        eliminaClienteSeleccionado();
		    }
		});
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Info", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("MiNave App ");
		lblNewLabel_15.setBounds(18, 6, 79, 16);
		panel.add(lblNewLabel_15);
		
		JTextPane txtpnAllienSystems = new JTextPane();
		txtpnAllienSystems.setEditable(false);
		txtpnAllienSystems.setBounds(18, 34, 261, 244);
		txtpnAllienSystems.setText("Alien Systems 2023\n \nLider: Estefania Ramirez estefaniaramiren18@gmail.com \n \n Documentacion: Magaly Espinoza magaly.espinozac2003@gmail.com \n\n Desarrollador: Erick Nungaray e.yazeck@gmail.com \n\n Ing. Cinthya Casas \n cinthya.casas@itz.edu.mx \nFundamentos de Ingenieria de Software \n Instituto Tecnologico de Zacatecas");
		panel.add(txtpnAllienSystems);
		

		
	}
	private void actualizarClienteSeleccionado() {
	    int filaSeleccionada = clienteTable.getSelectedRow();
	    if (filaSeleccionada >= 0) {
	        Cliente clienteSeleccionado = ListaClientes.get(filaSeleccionada);

	        // Obtener el valor del estatus y la fecha
	        String estatus = choiceEstatus1.getSelectedItem();
	        String fechaTexto = textFieldFecha2.getText();

	        // Obtener el comentario anterior del cliente
	        List<String> comentarios = clienteSeleccionado.getComentario();
	        List<String> fechas = clienteSeleccionado.getFecha();

	        // Obtener el nuevo comentario del campo de texto
	        String nuevoComentario = textField_8.getText();

	        // Agregar el nuevo comentario a la lista de comentarios
	        comentarios.add(nuevoComentario);

	        // Actualizar el cliente seleccionado con los nuevos valores
	        clienteSeleccionado.setEstatus(estatus);
	        fechas.add(fechaTexto);
	        clienteSeleccionado.setComentario(comentarios);
	        clienteSeleccionado.setFecha(fechas);


	        // Limpiar los campos de texto
	        choiceEstatus1.select(0);
	        textFieldFecha2.setText("");
	        textField_8.setText("");
	        mostrarReporte();
	        mostrarEmail();
	        
	    }
	}
	private void mostrarInformacionClienteSeleccionado() {
	    int filaSeleccionada = clienteTable.getSelectedRow();
	    if (filaSeleccionada >= 0 && filaSeleccionada < ListaClientes.size()) {
	        Cliente clienteSeleccionado = ListaClientes.get(filaSeleccionada);

	        StringBuilder informacionCliente = new StringBuilder();
	        informacionCliente.append("Nombre: ").append(clienteSeleccionado.getNombre()).append("\n");
	        informacionCliente.append("Teléfono: ").append(clienteSeleccionado.getTelefono()).append("\n");
	        informacionCliente.append("Email: ").append(clienteSeleccionado.getEmail()).append("\n");
	        informacionCliente.append("Marca de Coche: ").append(clienteSeleccionado.getMarcaCoche()).append("\n");
	        informacionCliente.append("Modelo: ").append(clienteSeleccionado.getModelo()).append("\n");

	        List<String> comentarios = clienteSeleccionado.getComentario();
	        List<String> fechas = clienteSeleccionado.getFecha();

	        informacionCliente.append("Comentarios:\n");
	        for (int i = 1; i < comentarios.size(); i++) {
	            String comentario = comentarios.get(i);
	            if (!comentario.isEmpty()) {
	                informacionCliente.append(" - ").append(comentario).append("\n");
	                if (i < fechas.size()) {
	                    informacionCliente.append("    ").append("\n");
	                }
	            }
	        }

	        informacionCliente.append("\nEstatus: ").append(clienteSeleccionado.getEstatus()).append("\n");
	        if (!fechas.isEmpty()) {
	            informacionCliente.append("Fecha: ").append(fechas.get(fechas.size() - 1)).append("\n");
	        }

	        textPaneInfo.setText(informacionCliente.toString());
	        mostrarEmail();
	    }
	}
	private void mostrarReporte() {
	    int filaSeleccionada = clienteTable.getSelectedRow();
	    if (filaSeleccionada >= 0 && filaSeleccionada < ListaClientes.size()) {
	        Cliente clienteSeleccionado = ListaClientes.get(filaSeleccionada);

	        StringBuilder informacionCliente = new StringBuilder();
	        informacionCliente.append("Hola ").append(clienteSeleccionado.getNombre()).append("!!\n");
	      
	     
	        informacionCliente.append("Tu Coche: ").append(clienteSeleccionado.getMarcaCoche()).append("\n");
	        informacionCliente.append("Modelo: ").append(clienteSeleccionado.getModelo()).append("\n");

	        List<String> comentarios = clienteSeleccionado.getComentario();
	        List<String> fechas = clienteSeleccionado.getFecha();

	        informacionCliente.append("Se encuentra en nuestro taller, le envio los Comentarios de los tecnicos y el estatus de su reparacion:\n");
	        for (int i = 1; i < comentarios.size(); i++) {
	            String comentario = comentarios.get(i);
	            if (!comentario.isEmpty()) {
	                informacionCliente.append(" - ").append(comentario).append("\n");
	               
	            }
	        }

	        informacionCliente.append("\nEstatus: ").append(clienteSeleccionado.getEstatus()).append("\n");
	        if (!fechas.isEmpty()) {
	            informacionCliente.append("Fecha: ").append(fechas.get(fechas.size() - 1)).append("\n");
	        }
	        informacionCliente.append("Estamos a sus ordenes, puede responder a este email \n muchas gracias por su paciencia lo mantendremos informado. Gracias por su preferencia!");
	        textPaneReporte.setText(informacionCliente.toString());
	    }
	}
	private void mostrarEmail() {
	    int filaSeleccionada = clienteTable.getSelectedRow();
	    if (filaSeleccionada >= 0 && filaSeleccionada < ListaClientes.size()) {
	        Cliente clienteSeleccionado = ListaClientes.get(filaSeleccionada);
	        String email = clienteSeleccionado.getEmail();
	        textFieldEmailReporte.setText(email);
	    }
	}
	private void eliminaClienteSeleccionado() {
	    int filaSeleccionada = clienteTable.getSelectedRow();
	    if (filaSeleccionada >= 0 && filaSeleccionada < ListaClientes.size()) {
	        ListaClientes.remove(filaSeleccionada);
	        tableModel.removeRow(filaSeleccionada);
	        limpiarCampos();
	    }
	}
	private void limpiarCampos() {
	    textFieldNombre.setText("");
	    textFieldTelefono.setText("");
	    textFieldEmail.setText("");
	    textFieldMarca.setText("");
	    textFieldModelo.setText("");
	    textFieldComentarios.setText("");
	    textFieldFecha.setText("");
	    choiceEstatus.select(0);
	    textPaneInfo.setText("");
	    textPaneReporte.setText("");
	    textFieldFecha2.setText("");
	    textFieldEmailReporte.setText("");
	    textField_8.setText("");
	}
	private void guardarCliente() {
	    // Obtener los valores de los campos de texto
	    String nombre = textFieldNombre.getText();
	    String telefono = textFieldTelefono.getText();
	    String email = textFieldEmail.getText();
	    String marcaCoche = textFieldMarca.getText();
	    String modelo = textFieldModelo.getText();
	    String comentario = textFieldComentarios.getText();
	    String estatus = choiceEstatus.getSelectedItem();
	    String fecha= textFieldFecha.getText();
	    List<String> comentarios = new ArrayList<>();
	    List<String> fechas = new ArrayList<>();
	    comentarios.add(comentario);
	    fechas.add(fecha);
	    Cliente nuevoCliente = new Cliente(nombre, telefono, email, marcaCoche, modelo, comentarios, estatus, fechas);

	 
	    // Verificar si se han proporcionado comentarios
	    if (!comentario.isEmpty()) {
	        nuevoCliente.agregarComentario(comentario);
	    }

	    // Agregar el objeto Cliente a la lista
	    ListaClientes.add(nuevoCliente);
	    Object[] rowData = { nombre, telefono, marcaCoche };
	    tableModel.addRow(rowData);

	    // Limpiar los campos de texto
	    textFieldNombre.setText("");
	    textFieldTelefono.setText("");
	    textFieldEmail.setText("");
	    textFieldMarca.setText("");
	    textFieldModelo.setText("");
	    textFieldComentarios.setText("");
	    textFieldFecha.setText("");

	    // Puedes imprimir la lista para verificar
	    System.out.println("Clientes en la lista:");
	    for (Cliente cliente : ListaClientes) {
	        System.out.println(cliente.getNombre());
	    }
	}
	private void buscarClientePorNombre() {
	    String nombreBuscado = textField_6.getText().trim();

	    for (int i = 0; i < ListaClientes.size(); i++) {
	        Cliente cliente = ListaClientes.get(i);

	        if (cliente.getNombre().equalsIgnoreCase(nombreBuscado)) {
	            // Seleccionar la fila en la tabla que coincide con el cliente encontrado
	            clienteTable.setRowSelectionInterval(i, i);
	            mostrarInformacionClienteSeleccionado();
	            mostrarReporte();
	            mostrarEmail();
	            return; // Salir del bucle una vez que se encuentra el cliente
	        }
	    }

	    // Si no se encuentra el cliente, mostrar un mensaje o realizar otras acciones según sea necesario
	    System.out.println("Cliente no encontrado: " + nombreBuscado);
	}
	private void enviarReportePorEmail() {
	    // Configuración para el servidor SMTP (puedes ajustar esto según tu proveedor de correo)
	    String host = "smtp.gmail.com";
	    String username = "emailhere";
	    String password = "passwordapp";
	    int port = 587;

	    // Propiedades de la sesión de correo
	    Properties props = new Properties();
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", host);
	    props.put("mail.smtp.port", port);

	    // Crear una sesión de correo con autenticación
	    Session session = Session.getInstance(props, new Authenticator() {
	        @Override
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	        }
	    });

	    try {
	        // Crear un mensaje de correo
	        Message message = new MimeMessage(session);
	        message.setFrom(new InternetAddress(username));
	        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(textFieldEmailReporte.getText()));
	        message.setSubject("Informe de Reparación de Vehículo");
	        message.setText(textPaneReporte.getText());

	        // Enviar el mensaje
	        Transport.send(message);

	        System.out.println("El informe se envió correctamente por correo electrónico.");
	    } catch (MessagingException ex) {
	        System.err.println("Error al enviar el informe por correo electrónico: " + ex.getMessage());
	        ex.printStackTrace();
	    }
	}

//fin de los metodos
	}//fin del Jframe





		   
	

