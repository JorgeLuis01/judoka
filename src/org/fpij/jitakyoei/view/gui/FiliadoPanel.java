/*
 * Created by JFormDesigner on Mon Dec 07 20:56:28 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.fpij.jitakyoei.view.forms.EnderecoForm;

import net.java.dev.genesis.annotation.ViewHandler;
import net.java.dev.genesis.ui.swing.SwingBinder;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
@ViewHandler
public class FiliadoPanel extends JPanel {
	SwingBinder binder;

	private static final long serialVersionUID = 1L;
	public FiliadoPanel() {
		initComponents();
	}

	public EnderecoPanel getEnderecoPanel() {
		return enderecoPanel;
	}
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		nome = new JTextField();
		label5 = new JLabel();
		registroCbj = new JTextField();
		label12 = new JLabel();
		cpf = new JTextField();
		label6 = new JLabel();
		email = new JTextField();
		label2 = new JLabel();
		dataNascimento = new JTextField();
		label3 = new JLabel();
		rg = new JTextField();
		label4 = new JLabel();
		orgaoExpedidor = new JTextField();
		label10 = new JLabel();
		telefone1 = new JTextField();
		label11 = new JLabel();
		telefone2 = new JTextField();
		enderecoPanel = new EnderecoPanel();
		label13 = new JLabel();
		scrollPane1 = new JScrollPane();
		observacoes = new JTextArea();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"$lcgap, pref, $lcgap, 109dlu:grow, $lcgap, 69dlu, $lcgap, 99dlu:grow, $lcgap",
			"5*($lgap, default), $lgap, fill:61dlu, $lgap, fill:55dlu"));

		//---- label1 ----
		label1.setText("Nome:");
		label1.setName("label1");
		add(label1, cc.xy(2, 2));

		//---- nome ----
		nome.setName("nome");
		add(nome, cc.xywh(4, 2, 5, 1));

		//---- label5 ----
		label5.setText("Registro CBJ:");
		label5.setName("label5");
		add(label5, cc.xy(2, 4));

		//---- registroCbj ----
		registroCbj.setName("registroCbj");
		add(registroCbj, cc.xy(4, 4));

		//---- label12 ----
		label12.setText("CPF:");
		label12.setName("label12");
		add(label12, cc.xy(6, 4));

		//---- cpf ----
		cpf.setName("cpf");
		add(cpf, cc.xy(8, 4));

		//---- label6 ----
		label6.setText("E-mail");
		label6.setName("label6");
		add(label6, cc.xy(2, 6));

		//---- email ----
		email.setName("email");
		add(email, cc.xy(4, 6));

		//---- label2 ----
		label2.setText("Data de Nascimento:");
		label2.setName("label2");
		add(label2, cc.xy(6, 6));

		//---- dataNascimento ----
		dataNascimento.setName("dataNascimento");
		add(dataNascimento, cc.xy(8, 6));

		//---- label3 ----
		label3.setText("RG:");
		label3.setName("label3");
		add(label3, cc.xy(2, 8));

		//---- rg ----
		rg.setName("rg");
		add(rg, cc.xy(4, 8));

		//---- label4 ----
		label4.setText("\u00d3rg\u00e3o Expedidor:");
		label4.setName("label4");
		add(label4, cc.xy(6, 8));

		//---- orgaoExpedidor ----
		orgaoExpedidor.setName("orgaoExpedidor");
		add(orgaoExpedidor, cc.xy(8, 8));

		//---- label10 ----
		label10.setText("Fone 1:");
		label10.setName("label10");
		add(label10, cc.xy(2, 10));

		//---- telefone1 ----
		telefone1.setName("telefone1");
		add(telefone1, cc.xy(4, 10));

		//---- label11 ----
		label11.setText("Fone 2:");
		label11.setName("label11");
		add(label11, cc.xy(6, 10));

		//---- telefone2 ----
		telefone2.setName("telefone2");
		add(telefone2, cc.xy(8, 10));

		//---- enderecoPanel ----
		enderecoPanel.setName("enderecoPanel");
		add(enderecoPanel, cc.xywh(1, 12, 9, 1));

		//---- label13 ----
		label13.setText("Observa\u00e7\u00f5es:");
		label13.setName("label13");
		add(label13, cc.xy(2, 14));

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1");

			//---- observacoes ----
			observacoes.setLineWrap(true);
			observacoes.setName("observacoes");
			scrollPane1.setViewportView(observacoes);
		}
		add(scrollPane1, cc.xywh(4, 14, 5, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField nome;
	private JLabel label5;
	private JTextField registroCbj;
	private JLabel label12;
	private JTextField cpf;
	private JLabel label6;
	private JTextField email;
	private JLabel label2;
	private JTextField dataNascimento;
	private JLabel label3;
	private JTextField rg;
	private JLabel label4;
	private JTextField orgaoExpedidor;
	private JLabel label10;
	private JTextField telefone1;
	private JLabel label11;
	private JTextField telefone2;
	private EnderecoPanel enderecoPanel;
	private JLabel label13;
	private JScrollPane scrollPane1;
	private JTextArea observacoes;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
