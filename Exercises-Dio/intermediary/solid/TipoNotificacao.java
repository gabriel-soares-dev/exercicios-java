
interface NotificacaoEmail {
    void enviarEmail(String mensagem);
}

interface NotificacaoSMS {
    void enviarSMS(String mensagem);
}

class NotificacaoEmailImpl implements NotificacaoEmail {
    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("Email enviado: %s".formatted(mensagem));
    }
}

class NotificacaoSMSImpl implements NotificacaoSMS {
    @Override
    public void enviarSMS(String mensagem) {
        System.out.println("SMS enviado: %s".formatted(mensagem));
    }
}

public class TipoNotificacao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] entradas = scanner.nextLine().split(", ");

            String tipoNotificacao = entradas[0];
            String mensagem = entradas[1];

            // TODO: Criar objetos específicos com base no tipo escolhido.
            if ("email".equalsIgnoreCase(tipoNotificacao)) {
                NotificacaoEmailImpl notificacaoEmail = new NotificacaoEmailImpl();
                notificacaoEmail.enviarEmail(mensagem);
            } else if ("sms".equalsIgnoreCase(tipoNotificacao)) {
                NotificacaoSMSImpl notificacaoSMS = new NotificacaoSMSImpl();
                notificacaoSMS.enviarSMS(mensagem);
            } else {
                System.out.println("Tipo de notificacao invalido.");
            }

        }
    }
}
