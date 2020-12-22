import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Funcionario
{
	int numeroEmpresa;
	int numeroFuncionario;
	String nomeFuncionario;
	String dataNascimento;
	String estadoCivil;
	String endereco;
	String RG;
	String CPF;
	String telefone;
	int numeroDependente;
	String[] nomeDependente = new String[numeroDependente];
	String[] grauParentesco = new String[numeroDependente];
	String nomeMae;
	String nomePai;
}
class Empresa
{
	String nomeEmpresa;
	String enderecoEmpresa;
	int numeroEmpresa;
	String pessoaContato;
	String emailEmpresa;
	int numeroFones;
	String[] fones = new String[numeroFones];
}
public class Exercicio2 
{
	public static void main(String[] args)
	{
		Funcionario[] vetorFuncionario = new Funcionario[1];
		Empresa[] vetorEmpresa = new Empresa[1];
		int contador1;
		int contador2;
		Scanner leia = new Scanner(System.in);
		SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy"); // Conversor de data
		
		for (contador1 = 0; contador1 < vetorFuncionario.length; contador1++)
		{
			vetorFuncionario[contador1] = new Funcionario();
			System.out.println("Funcionario " + contador1 + 1 + ":");
			System.out.println("Informe o CPF do funcionario: ");
			vetorFuncionario[contador1].CPF = leia.next();
			System.out.println("Informe o RG do funcionario: ");
			vetorFuncionario[contador1].RG = leia.next();
			System.out.println("Informe o numero da empresa que o funcionario pertence: ");
			vetorFuncionario[contador1].numeroEmpresa = leia.nextInt();
			System.out.println("Informe o telefone do funcionario: ");
			vetorFuncionario[contador1].telefone = leia.next();
			System.out.println("Informe a data de nascimento do funcionario: "); 
			vetorFuncionario[contador1].dataNascimento = leia.next();
			try 
			{
				Date dataConvertida = conversor.parse(vetorFuncionario[contador1].dataNascimento);
				vetorFuncionario[contador1].dataNascimento = conversor.format(dataConvertida);
				System.out.println(dataConvertida);
			} 
			catch (ParseException e) 
			{
				System.out.println("Errou");
			}
			System.out.println("Informe o numero do funcionario: ");
			vetorFuncionario[contador1].numeroFuncionario = leia.nextInt();
			System.out.println("Informe o nome do funcionario: ");
			vetorFuncionario[contador1].nomeFuncionario = leia.next();
			System.out.println("Informe o estado civil do funcionario: ");
			vetorFuncionario[contador1].estadoCivil = leia.next();
			System.out.println("Informe o endereço do funcionario: ");
			vetorFuncionario[contador1].endereco = leia.next();
			System.out.println("Informe o numero de dependentes do funcionario: ");
			vetorFuncionario[contador1].numeroDependente = leia.nextInt();
			for (contador2 = 0; contador2 < vetorFuncionario[contador1].numeroDependente; contador2++)
			{
				System.out.println("Dependente " + contador2 + 1 + ":");
				System.out.println("Informe o nome do dependente: ");
				vetorFuncionario[contador1].nomeDependente[contador2] = leia.next();
				System.out.println("Informe o grau de Parentesco do dependente: ");
				vetorFuncionario[contador1].grauParentesco[contador2] = leia.next();
			}
			System.out.println("Informe o nome da mae do funcionario: ");
			vetorFuncionario[contador1].nomeMae = leia.next();
			System.out.println("Informe o nome do pai do funcionario: ");
			vetorFuncionario[contador1].nomePai = leia.next();
		}
		for (contador1 = 0; contador1 < vetorEmpresa.length; contador1++)
		{
			vetorEmpresa[contador1] = new Empresa();
			System.out.println("Empresa " + contador1 + 1 + ":");
			System.out.println("Informe o nome da empresa: ");
			vetorEmpresa[contador1].nomeEmpresa = leia.next();
			System.out.println("Informe o endereço da empresa: ");
			vetorEmpresa[contador1].enderecoEmpresa = leia.next();
			System.out.println("Informe o numero de telefones da empresa: ");
			vetorEmpresa[contador1].numeroFones = leia.nextInt();
			for (contador2 = 0; contador2 < vetorEmpresa[contador1].numeroFones; contador2++)
			{
				System.out.println("Telefone " + contador2 + 1 + ":");
				System.out.println("Informe o numero do telefone: ");
				vetorEmpresa[contador1].fones[contador2]= leia.next();
			}
			System.out.println("Informe o numero da empresa: ");
			vetorEmpresa[contador1].numeroEmpresa = leia.nextInt();
			System.out.println("Informe a pessoa de contato da empresa: ");
			vetorEmpresa[contador1].pessoaContato = leia.next();
			System.out.println("Informe o email da empresa: ");
			vetorEmpresa[contador1].emailEmpresa = leia.next();
		}
		System.out.println("Funcionarios que possuem mais de 5 dependentes: ");
		for (contador1 = 0; contador1 < vetorFuncionario.length; contador1++)
		{
			if(vetorFuncionario[contador1].numeroDependente > 5)
			{
				System.out.println("Funcionario " + contador1 + 1 + ":");
				System.out.println("Numero da empresa: " + vetorFuncionario[contador1].numeroEmpresa);
				System.out.println("Numero: " + vetorFuncionario[contador1].numeroFuncionario);
				System.out.println("Nome: " + vetorFuncionario[contador1].nomeFuncionario);
				System.out.println("Data de nascimento: " + vetorFuncionario[contador1].dataNascimento); 
				System.out.println("Estado civil: " + vetorFuncionario[contador1].estadoCivil);
				System.out.println("Endere�o: " + vetorFuncionario[contador1].endereco);
				System.out.println("RG: " + vetorFuncionario[contador1].RG);
				System.out.println("CPF: " + vetorFuncionario[contador1].CPF);
				System.out.println("Telefone: " + vetorFuncionario[contador1].telefone);
				System.out.println("Nome da mae: " + vetorFuncionario[contador1].nomeMae);
				System.out.println("Nome do pai: " + vetorFuncionario[contador1].nomePai);
				System.out.println("Numero de dependentes: " + vetorFuncionario[contador1].numeroDependente);
				for (contador2 = 0; contador2 < vetorFuncionario[contador1].numeroDependente; contador2++)
				{
					System.out.println("Dependente " + contador2 + 1 + ":");
					System.out.println("Nome: " + vetorFuncionario[contador1].nomeDependente[contador2]);
					System.out.println("Grau de Parentesco: " + vetorFuncionario[contador1].grauParentesco[contador2]);
				}
			}
		}
		leia.close();
	}
}