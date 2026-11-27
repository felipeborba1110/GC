package repositories.springBallZ.ssj3;

public class PagamentoPix implements MeioDePagamento {
    @Override
    public void pagar() {
        gerarQrCodePix();
    }

    public void gerarQrCodePix() {
        System.out.println("QR Code PIX gerado com sucesso.");
    }
}
