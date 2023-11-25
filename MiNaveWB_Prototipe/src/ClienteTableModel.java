import java.util.List;

import javax.swing.table.DefaultTableModel;

public class ClienteTableModel extends DefaultTableModel {
    private static final long serialVersionUID = 1L;
	private static String[] columnNames = {"Nombre", "Telefono", "Email", "Marca Coche", "Modelo", "Comentarios", "Estatus", "Fecha"};


	public ClienteTableModel(List<Cliente> clientes) {
		
		// TODO Auto-generated constructor stubsuper(columnNames, 0);
        for (Cliente cliente : clientes) {
            addRow(new Object[]{
                cliente.getNombre(),
                cliente.getTelefono(),
                cliente.getEmail(),
                cliente.getMarcaCoche(),
                cliente.getModelo(),
                cliente.getComentario(),
                cliente.getEstatus(),
                cliente.getFecha()
            });
        }
	}


	public static String[] getColumnNames() {
		return columnNames;
	}


	public static void setColumnNames(String[] columnNames) {
		ClienteTableModel.columnNames = columnNames;
	}



    
}

