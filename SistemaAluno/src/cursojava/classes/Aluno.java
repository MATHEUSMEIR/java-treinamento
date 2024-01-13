package cursojava.classes;

import java.util.Objects;

import cursojava.executavel.Disciplina;

//lasse que representa o aluno e seus dados
	public class Aluno {
	
		 //atributos do aluno
		 public String nome;
	     public int idade;
	     public String numeroCpf;
		public String nomePai;
	     
	     private Disciplina disciplina = new Disciplina();
	     
	     //Criar os dados na memoria sando padrão do JAVA
	     //Construtor com parâmetros, objetos para o JAVA
	     //Instancia
	     
		 public Aluno() {
		 // TODO Auto-generated constructor stub
		 }
			
	     public Aluno(String nomePadrao, int idadePadrao, String numeroCpfPadrao, String nomePaiPadrao) {
	    	 nome = nomePadrao;
	    	 idade = idadePadrao; 
	    	 numeroCpf = numeroCpfPadrao;
	    	 nomePai = nomePaiPadrao; 
	     }
	     
	     //metodos SET e GET da disciplina
	     public Disciplina getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}

	     
	     //Métodos SETTERS e GETTERS do objeto
	    	     
	     /*SET é para adicionar ou receber os dados para os atributos*/
	     public void setNome(String nome) {
	    	 this.nome = nome;
	     }
	     /*GET é para resgatar ou obter o valor do atributo*/
	     public String getNome() {
	    	 return nome;	 
	     }
	     
	     public void setIdade(int idade) {
	    	 this.idade = idade;
	     }
	     
	     public int getIdade() {
	    	 return idade;	 
	     }
	     
	     public void setNumeroCpf(String numeroCpf) {
	    	 this.numeroCpf = numeroCpf;
	     }
	     
	     public String getNumeroCpf() {
	    	 return numeroCpf;	 
	     }
	     
	     public void setNomePai(String nomePai) {
	    	 this.nomePai = nomePai;
	     }
	     
	     public String getNomePai() {
	    	 return nomePai;	 
	     }
     
		//Método para retornar média do aluno
		public double getMediaNota() {
			return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4())/4;
		}
		
		public String getSituacao() {
			double media = this.getMediaNota();
			if (media >= 7.0) {
	        	return "Aprovado";
	        } else if (media >= 6.0) {
	        	return "Recuperação";
	        } else {
	        	return "Reprovado";
	        }
	    }

		@Override
		public int hashCode() {
			return Objects.hash(nome, numeroCpf);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
		}

		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", numeroCpf=" + numeroCpf + ", nomePai=" + nomePai
					+ ", disciplina=" + disciplina + "]";
		}

		
		
}	