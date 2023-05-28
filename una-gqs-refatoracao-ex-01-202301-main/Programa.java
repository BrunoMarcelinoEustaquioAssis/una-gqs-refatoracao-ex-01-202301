import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean erroTentativas = false;
    Pessoa pessoa = new Pessoa();
    Mensagem mensagem = new Mensagem();
    Validacao validacao = new Validacao();

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");
    //Bruno Marcelino, correção do "SC" para "Scanner" 
    pessoa.coletaNome(scanner);
    pessoa.coletaIdade(scanner);

    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa); //Bruno Marcelino correção variavel "pesssoa"

    validacao.validacaoDasProximasPerguntas(pessoa); //Bruno Marcelino correção variavel "pessoas"

    validacao.calcularValidacaoFinal(erroTentativas); //Bruno Marcelino correção variavel "erroTentativass"
    
    //Bruno Marcelino correção variavel ""// scanner.close();"
    scanner.close();
  }
}