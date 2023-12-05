package Uninove;

import java.util.Date;

import Uninove.EnvioMensagem;
import Uninove.Facebook;
import Uninove.Instagram;
import Uninove.MensagemArquivo;
import Uninove.MensagemFoto;
import Uninove.MensagemTexto;
import Uninove.MensagemVideo;
import Uninove.Msg;
import Uninove.Telegram;
import Uninove.WhatsApp;

public class Main {
	 public static void main(String[] args) {
	     // Exemplo de uso
	     EnvioMensagem whatsapp = new WhatsApp();
	     EnvioMensagem telegram = new Telegram();
	     EnvioMensagem facebook = new Facebook();
	     EnvioMensagem instagram = new Instagram();

	     // Criar mensagens
	     Msg texto = new MensagemTexto("Olá!!!", new Date());
	     Msg video = new MensagemVideo("Vídeo", "video.mp4", "mp4", 120);
	     Msg foto = new MensagemFoto("Foto do José", "foto.jpg", "jpg");
	     Msg arquivo = new MensagemArquivo("Documento", "documento.pdf", "pdf");

	     // Enviar mensagens
	     whatsapp.enviarMensagem("11943059052", texto);
	     telegram.enviarMensagem("@JoseCorreia", video);
	     facebook.enviarMensagem("Jo_Luid", foto);
	     instagram.enviarMensagem("@Jo_Luid", arquivo);
	 }
	}

