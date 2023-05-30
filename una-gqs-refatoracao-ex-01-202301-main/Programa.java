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

    //Bruno Marcelino correção "pesssoa" para "pessoa"
    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa); 

    //Bruno Marcelino correção "pessoas" para "pessoa"
    validacao.validacaoDasProximasPerguntas(pessoa); 

    
    //Bruno Marcelino correção "erroTentativass" para "erroTentativas"
    validacao.calcularValidacaoFinal(erroTentativas); 
    
    //scanner.close();
  }
}