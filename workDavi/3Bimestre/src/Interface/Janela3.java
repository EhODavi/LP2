package Interface;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sound.midi.Synthesizer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Janela3 implements ActionListener {
	// Normalmente os componentes gr�ficos da janela s�o declarados como
	// atributos
	// private JFrame frame;
	private JDialog dialog;
	private JPanel panel;
	private JLabel lbNumero;
	private JTextField tfNumero;
	private JLabel lbNome;
	private JTextField tfNome;
	private JButton btSalvar;
	private Component lbCPF;
	private JFormattedTextField tfCPF; // MASCARA
	private Component lbDataNasc;
	private JFormattedTextField tfDataNasc; // MASCARA

	// referencia o objeto criado a partir dos dados preenchidos
	private Pessoa pessoa;

	public Janela3() {
		initGui();
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	// Metodo que inicializar� os componentes gr�ficos
	private void initGui() { // A ordem dos comandos altera o produto final
		// carca�a da janela com t�tulo
		// frame = new JFrame("Cadastro de Pessoa");
		dialog = new JDialog();
		// define titulo
		dialog.setTitle("Minha primeira Janela"); // Eu posso fazer isso se n�o
		// tivesse definido no construtor
		// Ao fechar a janela, o programa � encerrado
		// dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		// O fluxo ser� retornado para o programa/janela que chamou janela3,
		// apenas quando a janela for fechada
		dialog.setModal(true);
		// define tamanho em pixels para a janela
		dialog.setSize(300, 300);
		// posiciona a janela no centro da tela
		dialog.setLocationRelativeTo(null);
		// nao permite alterar o tamanho da janela
		dialog.setResizable(false);
		// container que vai receber os componentes gr�ficos
		panel = new JPanel(); // invisivel
		// panel.setBackground(Color.PINK);
		// Desliga o gerenciador de layout (AbsoluteLayout);
		panel.setLayout(null);
		// insere o panel dentro do frame
		dialog.add(panel);

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

		lbCPF = new JLabel("CPF");
		lbCPF.setBounds(10, 130, 100, 25);
		panel.add(lbCPF);
		try {
			MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
			tfCPF = new JFormattedTextField(mascaraCPF);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		tfCPF.setBounds(10, 155, 140, 25);
		panel.add(tfCPF);

		lbDataNasc = new JLabel("Data de Nascimento");
		lbDataNasc.setBounds(160, 130, 100, 25);
		panel.add(lbDataNasc);
		try {
			MaskFormatter mascaraData = new MaskFormatter("##/##/####");
			tfDataNasc = new JFormattedTextField(mascaraData);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		tfDataNasc.setBounds(160, 155, 115, 25);
		panel.add(tfDataNasc);

		btSalvar = new JButton("Salvar");
		btSalvar.setBounds(170, 225, 100, 25);
		btSalvar.addActionListener(this);
		panel.add(btSalvar);

		// exibir a janela
		dialog.setVisible(true);
	}

	// s� para teste
	public static void main(String[] args) {
		Janela3 j = new Janela3();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		long numero = Long.parseLong(tfNumero.getText());
		String nome = tfNome.getText();
		String cpf = tfCPF.getText();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNasc = null;
		try {
			dataNasc = sdf.parse(tfDataNasc.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pessoa = new Pessoa(numero, nome, cpf, dataNasc);
		dialog.dispose(); // Fecha a janela
	}
}