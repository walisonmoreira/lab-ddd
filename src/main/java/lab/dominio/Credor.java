package lab.dominio;

public class Credor {

  private Conta conta;

  public Conta getConta() {
    return conta;
  }

  public void setConta(Conta conta) {
    this.conta = conta;
  }

  public void receber(Double dinheiro) {
    conta.setSaldo(conta.getSaldo() + dinheiro);
  }

}
