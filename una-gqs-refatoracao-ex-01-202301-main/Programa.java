import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean erroTentativas = false;
    Pessoa pessoa = new Pessoa();
    Mensagem mensagem = new Mensagem();
    Validacao validacao = new Validacao();

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");
    //Bruno Marcelino, correção do "SC" para "scanner" 
    pessoa.coletaNome(scanner);
    pessoa.coletaIdade(scanner);

    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pesssoa); 

    validacao.validacaoDasProximasPerguntas(pessoas); 

    validacao.calcularValidacaoFinal(erroTentativass); 
    
    //scanner.close();
  }
}