
public class PessoaJuridica extends Cliente {
	
	private String nome;
	private String cnpj;
	
	
	public PessoaJuridica(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
    

	@Override
	public void cadastrarCliente() {
		System.out.println("Cliente pessoa física com o nome " + this.nome + " e com o cnpj "+this.cnpj + " cadastrado na agenda!");
		for(Cliente cli : super.getClientes()) {
			cli.cadastrarCliente();
			
		}
			
	}


}
