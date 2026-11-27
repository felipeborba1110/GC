package repositories.springBallZ.ssj3;

public class ServicoEmailSMTP implements ServicoEmail{
    @Override
    public void enviarConfirmacao(String destinatario, String mensagem) {
        System.out.println("Enviando e-mail SMTP para " + destinatario + ": " + mensagem);}
}
