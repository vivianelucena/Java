package JavaHeranca;

public class Colegio {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(null, null, null);
		
		aluno1.nome = "Viviane";
		aluno1.cpf = "070900675-00";
		aluno1.matricula = "1520";
		aluno1.telefone = "81 9 96221352";
		
		System.out.printf("Aluno 01: %s\nCPF: %s \nMatricula: %s", aluno1.nome, aluno1.cpf, aluno1.matricula);
		
		
		Professor prof1 = new Professor(null, null, null);
		prof1.nome = "Wellington";
		prof1.cpf = "700586245-33";
		prof1.disciplina = "Dev";
		prof1.salario = 15.000;
		prof1.telefone = "81 9 9655-1214";
		
		
		
		Funcionario fun1 = new Funcionario(null, null, null);
		fun1.cargo = "Desenvolvedor";
		fun1.salario = 10.000;
				
		System.out.printf("");

	}

}
