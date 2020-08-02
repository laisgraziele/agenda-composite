
public class PessoaFisica extends Cliente {
	
	private String nome;
	private String cpf;
	
	
	public PessoaFisica(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
    

	@Override
	public void cadastrarCliente() {
		System.out.println("Cliente pessoa física com o nome " + this.nome + " e com o cpf "+this.cpf + " cadastrado na agenda!");
		for(Cliente cli : super.getClientes()) {
			cli.cadastrarCliente();
		
		}
			
	}

}
