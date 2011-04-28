package decorators;

import business.Pessoa;

/**
 * Interface para um sistema de mensagens, utilizando o <i>Pattern
 * Decorator</i>.
 * 
 * @author Edgar Mateus
 * @author Tiago Amaral
 */
public interface MessageDecorator {

	/**
	 * Envia uma mensagem para a pessoa indicada no argumento.
	 * 
	 * @param p
	 *            Destinario da Mensagem.
	 * 
	 * @param message
	 *            Mensagem a enviar.
	 */
	public void sendMessage(Pessoa p, String message);

	/**
	 * Adiciona a mensagem ao mecanismo de queue.
	 * 
	 * @param message
	 *            Mensagem a receber.
	 */
	public void acceptMessage(String message);
}
