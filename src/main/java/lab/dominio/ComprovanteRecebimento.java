package lab.dominio;

import java.util.Date;

public class ComprovanteRecebimento {

  private Date dataRecebimento;

  private Divida divida;

  public Date getDataRecebimento() {
    return dataRecebimento;
  }

  public Divida getDivida() {
    return divida;
  }

  public static ComprovanteRecebimento novoComprovante(Divida divida) {
    ComprovanteRecebimento comprovanteRecebimento = new ComprovanteRecebimento();
    comprovanteRecebimento.dataRecebimento = new Date(System.currentTimeMillis());
    comprovanteRecebimento.divida = divida;
    return comprovanteRecebimento;
  }
}
