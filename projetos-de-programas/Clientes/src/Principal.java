
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endereco endereco = new Endereco(22,"Flores",690100230,"Ap 202");
		
		Cliente cliente = new Cliente("Sebastina",1234,endereco);
		
		Endereco end = cliente.getEnd();
		
		String endStr = end.getNum()+", "+end.getRua()+", "+
						end.getCep()+", "+end.getComplemento();
		
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("Endereço: "+endStr);
		
	}

}
