package lab.dominio;

public class Recebimento {
  public ComprovanteRecebimento receber(Divida divida) {
    if (!divida.podeSerPaga()) {
      throw new RuntimeException("A dívida não pode ser paga.");
    }

    divida.quitar();

    return divida.getComprovanteRecebimento();
  }

}
