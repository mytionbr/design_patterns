package Strategy2;

public enum Cargo implements Strategy{
	
	ATENDENTE {
		@Override
		public double caulculaComissao(double valorVenda) {
			return (valorVenda * 0.01);
		}
	},
	VENDENDOR{
		@Override
		public double caulculaComissao(double valorVenda) {
			return (valorVenda * 0.02);
		}
	},
	GERENTE{
		@Override
		public double caulculaComissao(double valorVenda) {
			return (valorVenda * 0.03);
		}		
	}
	
}
