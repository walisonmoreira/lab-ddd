package lab.dominio;

public class Divida {

  private Credor credor;

  private Devedor devedor;

  private Double dinheiro;

  private boolean quitado = false;

  private ComprovanteRecebimento comprovanteRecebimento;

  private ComprovantePagamento comprovantePagamento;

  public Credor getCredor() {
    return credor;
  }

  public void setCredor(Credor credor) {
    this.credor = credor;
  }

  public Devedor getDevedor() {
    return devedor;
  }

  public void setDevedor(Devedor devedor) {
    this.devedor = devedor;
  }

  public Double getDinheiro() {
    return dinheiro;
  }

  public void setDinheiro(Double dinheiro) {
    this.dinheiro = dinheiro;
  }

  public boolean foiQuitado() {
    return quitado;
  }

  public ComprovanteRecebimento getComprovanteRecebimento() {
    return comprovanteRecebimento;
  }

  public ComprovantePagamento getComprovantePagamento() {
    return comprovantePagamento;
  }

  public boolean podeSerPaga() {
    return devedor.podePagar(dinheiro);
  }

  public void quitar() {
    
    if (quitado) {
      throw new RuntimeException("A dívida já está quitada.");
    }
    
    credor.receber(dinheiro);
    comprovanteRecebimento = ComprovanteRecebimento.novoComprovante(this);
    
    devedor.pagar(dinheiro);
    comprovantePagamento = ComprovantePagamento.novoComprovante(this);

    quitado = true;
  }

}
