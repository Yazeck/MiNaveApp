
import java.util.List;
public class Cliente {
    private String nombre;
    private String telefono;
    private String email;
    private String marcaCoche;
    private String modelo;
    private List<String> comentario;
    private String estatus;
    private List<String> fecha;

    
  
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMarcaCoche() {
		return marcaCoche;
	}

	public void setMarcaCoche(String marcaCoche) {
		this.marcaCoche = marcaCoche;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<String> getComentario() {
		return comentario;
	}

	public void setComentario(List<String> comentario) {
		this.comentario = comentario;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public List<String> getFecha() {
		return fecha;
	}

	public void setFecha(List<String> fecha) {
		this.fecha = fecha;
	}

	public Cliente(String nombre, String telefono, String email, String marcaCoche, String modelo,
			List<String> comentario, String estatus, List<String> fecha) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.marcaCoche = marcaCoche;
		this.modelo = modelo;
		this.comentario = comentario;
		this.estatus = estatus;
		this.fecha = fecha;
	}

	public void agregarComentario(String comentario) {
        this.comentario.add(comentario);
    }

    public void agregarFecha(String fecha) {
        this.fecha.add(fecha);
    }
  
}

