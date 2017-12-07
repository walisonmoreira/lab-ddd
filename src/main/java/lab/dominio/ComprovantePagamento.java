package lab.dominio;

import java.util.Date;

public class ComprovantePagamento {

  private Date dataPagamento;

  private Divida divida;

  public Date getDataPagamento() {
    return dataPagamento;
  }

  public Divida getDivida() {
    return divida;
  }

  public static ComprovantePagamento novoComprovante(Divida divida) {
    ComprovantePagamento comprovantePagamento = new ComprovantePagamento();
    comprovantePagamento.dataPagamento = new Date(System.currentTimeMillis());
    comprovantePagamento.divida = divida;
    return comprovantePagamento;
  }
}
