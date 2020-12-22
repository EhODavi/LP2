package Interface;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela2comHerenca extends JFrame {
	// Normalmente os componentes gr�ficos da janela s�o declarados como
	// atributos
	// private JFrame frame;
	private JPanel panel;
	private JLabel lbNumero;
	private JTextField tfNumero;
	private JLabel lbNome;
	private JTextField tfNome;
	private JButton btSalvar;

	public Janela2comHerenca() {
		initGui();
	}

	// Metodo que inicializar� os componentes gr�ficos
	private void initGui() { // A ordem dos comandos altera o produto final
		// carca�a da janela com t�tulo
		// frame = new JFrame("Minha primeira Janela");
		// define titulo
		this.setTitle("Minha primeira Janela"); // Eu posso fazer isso se n�o
		// tivesse definido no construtor
		// Ao fechar a janela, o programa � encerrado
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// define tamanho em pixels para a janela
		this.setSize(300, 300);
		// posiciona a janela no centro da tela
		this.setLocationRelativeTo(null);

		// container que vai receber os componentes gr�ficos
		panel = new JPanel(); // invisivel
		// panel.setBackground(Color.PINK);
		// Desliga o gerenciador de layout (AbsoluteLayout);
		panel.setLayout(null);
		// insere o panel dentro do frame
		this.add(panel);

		// Componente para escrever na tela
		lbNumero = new JLabel("N�mero");
		// x, y, largura, altura
		lbNumero.setBounds(10, 10, 80, 25);
		// insere o label dentro do panel
		panel.add(lbNumero);
		// Caixa de texto
		tfNumero = new JTextField(10);
		tfNumero.setBounds(10, 35, 80, 25);
		panel.add(tfNumero);

		lbNome = new JLabel("Nome");
		lbNome.setBounds(10, 65, 80, 25);
		panel.add(lbNome);
		tfNome = new JTextField(20);
		tfNome.setBounds(10, 95, 265, 25);
		panel.add(tfNome);

		btSalvar = new JButton("Salvar");
		btSalvar.setBounds(170, 225, 100, 25);
		panel.add(btSalvar);

		// exibir a janela
		// this.setVisible(true);
	}

	// s� para teste
	public static void main(String[] args) {
		Janela2comHerenca j = new Janela2comHerenca();
		j.setVisible(true);
	}
}
