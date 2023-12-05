package Uninove;


import java.util.Date;

//Classe base para Mensagem
public class Msg {
 String texto;
 String arquivo;
 String formato;

 public Msg(String texto, String arquivo, String formato) {
     this.texto = texto;
     this.arquivo = arquivo;
     this.formato = formato;
 }
}

//Subclasses espec�ficas para cada tipo de mensagem
class MensagemTexto extends Msg {
 Date dataEnvio;

 public MensagemTexto(String texto, Date dataEnvio) {
     super(texto, null, null);
     this.dataEnvio = dataEnvio;
 }
}

class MensagemVideo extends Msg {
 int duracao;

 public MensagemVideo(String texto, String arquivo, String formato, int duracao) {
     super(texto, arquivo, formato);
     this.duracao = duracao;
 }
}

class MensagemFoto extends Msg {
 public MensagemFoto(String texto, String arquivo, String formato) {
     super(texto, arquivo, formato);
 }
}

class MensagemArquivo extends Msg {
 public MensagemArquivo(String texto, String arquivo, String formato) {
     super(texto, arquivo, formato);
 }
}

//Interface para o envio de mensagens
interface EnvioMensagem {
 void enviarMensagem(String destinatario, Msg mensagem);
}

//Implementa��o da interface para cada canal
class WhatsApp implements EnvioMensagem {
 @Override
 public void enviarMensagem(String numero, Msg mensagem) {
     // L�gica para enviar mensagem via WhatsApp
     System.out.println("Enviando mensagem para o n�mero " + numero + " via WhatsApp.");
     // Implemente a l�gica espec�fica de envio para o WhatsApp
 }
}

class Telegram implements EnvioMensagem {
 @Override
 public void enviarMensagem(String usuario, Msg mensagem) {
     // L�gica para enviar mensagem via Telegram
     System.out.println("Enviando mensagem para o usu�rio " + usuario + " via Telegram.");
     // Implemente a l�gica espec�fica de envio para o Telegram
 }
}

class Facebook implements EnvioMensagem {
 @Override
 public void enviarMensagem(String usuario, Msg mensagem) {
     // L�gica para enviar mensagem via Facebook
     System.out.println("Enviando mensagem para o usu�rio " + usuario + " via Facebook.");
     // Implemente a l�gica espec�fica de envio para o Facebook
 }
}

class Instagram implements EnvioMensagem {
 @Override
 public void enviarMensagem(String usuario, Msg mensagem) {
     // L�gica para enviar mensagem via Instagram
     System.out.println("Enviando mensagem para o usu�rio " + usuario + " via Instagram.");
     // Implemente a l�gica espec�fica de envio para o Instagram
 }
}

