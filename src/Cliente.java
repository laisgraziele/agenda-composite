import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private List<Cliente> clientes;
	
	public Cliente() {
		this.clientes = new ArrayList<>();
	}
	
	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public abstract void cadastrarCliente();

	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
			
}
