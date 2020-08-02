
public class Agenda {
	
	public static void main(String[] args) {
		
		//Cliente listaclientes1 = new PessoaFisica("Lais", "700.456.885-21");
		
		//listaclientes1.adicionarCliente(new PessoaFisica("José", "456.854.965-45"));
		
		//listaclientes1.cadastrarCliente();
		
		Cliente listaclientes2 = new PessoaJuridica("Sansão LTDA", "11.524.654/0001-45");
		
		listaclientes2.adicionarCliente(new PessoaFisica("Lais", "444.555.555-45"));
		
		listaclientes2.cadastrarCliente();
		
	}

}
