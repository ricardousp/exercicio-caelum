package br.com.caelum.tdd.exercicio6;

public class FreteFactory {

	public Frete cria(Compra compra) {

		if (compra == null) {
			return null;
		} else if (compra.getCliente().getEstado() == Estado.SP) {
			return new FreteSP();
		} else if (compra.getCliente().getEstado() == Estado.RJ) {
			return new FreteRJ();
		} else if (compra.getCliente().getEstado() == Estado.SUL) {
			return new FreteSul();
		} else if(compra.getCliente().getEstado() == Estado.OUTRAS_REGIOES){
			return new FreteOutros();
		}
		
		return null;

	}

}
