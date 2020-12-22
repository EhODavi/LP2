package Interface;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela1 {
	// Normalmente os componentes gr�ficos da janela s�o declarados como
	// atributos
	private JFrame frame;
	private JPanel panel;
	private JLabel lbNumero;
	private JTextField tfNumero;
	private JLabel lbNome;
	private JTextField tfNome;
	private JButton btSalvar;

	public Janela1() {
		initGui();
	}

	// Metodo que inicializar� os componentes gr�ficos
	private void initGui() { // A ordem dos comandos altera o produto final
		// carca�a da janela com t�tulo
		frame = new JFrame("Minha primeira Janela");
		// define titulo
		// frame.setTitle("Minha primeira Janela"); Eu posso fazer isso se n�o
		// tivesse definido no construtor
		// Ao fechar a janela, o programa � encerrado
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// define tamanho em pixels para a janela
		frame.setSize(300, 300);
		// posiciona a janela no centro da tela
		frame.setLocationRelativeTo(null);

		// container que vai receber os componentes gr�ficos
		panel = new JPanel(); // invisivel
		// panel.setBackground(Color.PINK);
		// insere o panel dentro do frame
		frame.add(panel);
		
		// Componente para escrever na tela
		lbNumero = new JLabel("N�mero");
		// insere o label dentro do panel
		panel.add(lbNumero);
		// Caixa de texto
		tfNumero = new JTextField(10);
		panel.add(tfNumero);
		
		lbNome = new JLabel("Nome");
		panel.add(lbNome);
		tfNome = new JTextField(20);
		panel.add(tfNome);
		
		btSalvar = new JButton("Salvar");
		panel.add(btSalvar);
		
		// exibir a janela
		frame.setVisible(true);
	}

	// s� para teste
	public static void main(String[] args) {
		Janela1 j = new Janela1();
	}
}