package lab.dominio;

public class Devedor {

  private Conta conta;

  public Conta getConta() {
    return conta;
  }

  public void setConta(Conta conta) {
    this.conta = conta;
  }

  public boolean podePagar(Double dinheiro) {
    return conta.podePagar(dinheiro);
  }

  public void pagar(Double dinheiro) {
    conta.setSaldo(conta.getSaldo() + dinheiro);
  }
}
