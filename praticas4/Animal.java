package praticas4;

public class Animal {
		private String Nome;
		private String Raca;
		private Float Comprimento;
		private Integer NumeroPatas;
		private String Cor;
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public String getRaca() {
			return Raca;
		}
		public void setRaca(String raca) {
			Raca = raca;
		}
		public Float getComprimento() {
			return Comprimento;
		}
		public void setComprimento(Float comprimento) {
			Comprimento = comprimento;
		}
		public Integer getNumeroPatas() {
			return NumeroPatas;
		}
		public void setNumeroPatas(Integer numeroPatas) {
			NumeroPatas = numeroPatas;
		}
		public String getCor() {
			return Cor;
		}
		public void setCor(String cor) {
			Cor = cor;
		}
		public String getEcossistema() {
			return Ecossistema;
		}
		public void setEcossistema(String ecossistema) {
			Ecossistema = ecossistema;
		}
		private String Ecossistema;

	}

