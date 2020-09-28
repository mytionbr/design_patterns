package Strategy4;

public enum Cargo implements Comissao{
	CANTOR{
		@Override
		public double calcula(double valor) {
			return valor * 0.3;
		}
	},
	EMPRESARIO{
		@Override
		public double calcula(double valor) {
			return valor * 0.2;
		}		
	},
	MUSICO{
		@Override
		public double calcula(double valor) {
			return valor * 0.01;
		}
	}
	
}
