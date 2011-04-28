package decorators;

import java.util.LinkedList;

import business.Pessoa;

/**
 * Implementação de um sistema de mensagens para pessoas registadas no sistema.
 * 
 * @author Edgar Mateus
 * @author Tiago Amaral
 * 
 */
public class ConcreteMessageSystem implements MessageSystem {

	private LinkedList<String> mensagens;

	public ConcreteMessageSystem() {
		mensagens = new LinkedList<String>();
	}

	@Override
	public void acceptMessage(String message) {
		mensagens.add(message);
	}

	@Override
	public void sendMessage(Pessoa p, String message) {
		p.getMessageSystem().acceptMessage(message);
	}

}
