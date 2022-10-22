package AplicacaoCliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
                Autores
        Pedro Henrique Carneiro de Ara�jo 22108287
        
 */


public class Cliente  {

	public static void main(String[] args) {
		Socket socketCliente;
		Scanner leitorTeclado;
		PrintStream mensagemEnviar=null;
		String textoEnviar;
		int porta=8080;
		leitorTeclado=new Scanner(System.in);
		
		try {
			socketCliente=new Socket("localhost",porta);
			mensagemEnviar=new PrintStream(socketCliente.getOutputStream());
		}catch(IOException e) {
			System.out.println("ERRO DE ENTRADA OU SA�DA!!");
			e.printStackTrace();
		}
		
		
		System.out.println("Digite uma palavra para mandarmos no servidor");
		textoEnviar=leitorTeclado.nextLine();
		//textoEnviar="Frase teste";
		mensagemEnviar.println(textoEnviar);
		
		
		
	}

}

/*
* SOCKET
Utiilizando o modelo cliente/servidor (Socket) criar um MVP de um chatbot.

SERVIDOR

O servidor dever� ter um pequeno dicion�rio que responder� perguntas de acordo com a mensagem enviada pelos clientes. Caso a mensagem n�o seja reconhecida, o servidor apresentar� uma mensagem solicitando que o cliente escreva o questionamento novamente
e guardar� a informa��o que ele n�o conseguiu responder de acordo com os crit�rios definidos mais abaixo.

CLIENTE
O cliente deve ter a possibilidade de encaminhar perguntas quantas forem necess�rias.

Para finalizar a conversa, o cliente deve encaminhar a mensagem SAIR. O servidor ir� reconhecer o comando e encerrar� o conex�o entre as partes.
 
Ao final da execu��o, al�m de responder as quest�es mapeadas, o servidor dever� emitir o relat�rio de quest�es n�o respondidas com as informa��es solicitadas. As informa��es s�o: a quest�o n�o respondida, o cliente que solicitou a informa��o, o ip da m�quina que mandou o questionamento.

Al�m disso, dever� contabilizar quantas perguntas ele conseguiu responder.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

