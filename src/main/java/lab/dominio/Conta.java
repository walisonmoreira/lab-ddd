package lab.dominio;

public class Conta {
  
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  private double saldo;

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public boolean podePagar(Double dinheiro) {
    return saldo >= dinheiro;
  }
}
