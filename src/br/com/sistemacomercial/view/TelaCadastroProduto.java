package br.com.sistemacomercial.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroProduto extends JFrame{
	
	private JTexField txtNome, txtPreco;
	private JButton btnSalvar, btnEditar, btnExcluir;
	private JTable tabela;
	private DefaultTableModel modelo;
	
	public TelaCadastroProduto() {
		setTitle("Cadastro de Produtos");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel IblNome - new JLabel("Nome:");
		txtNome - new JTextField(20);
		
		JLabel IblPreco - new JLabel("Preco:");
		txtPreco - new JTextField(10);
		
		btnSalvar = new JBlutton("Salvar");
		btnEditar = new JButton("Editar");
		btnEditar = new JButton("Excluir");
		
		JPanel painelTopo - new Jpanel();
		painelTopo.add(IblNome);
		painelTopo.add(txtNome);
		painelTopo.add(lblPreco);
		painelTopo.add(txtPreco);
		painelTopo.add(btnSalvar);
		painelTopo.add(btnEditar);
		painelTopo.add(btnExcluir);
		
		modelo - new DefaultTableModel(new Object[]"Nome", "Preco"}, 0);
		tabela - new JTable(modelo);
		JscrollPane scroll - new JScrollPane(tabela);
		
		add(painelTopo, BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
		
		btnSalvar.addActionListener(e -> salvarProduto());
		btnEditar.addActionListener(e -> editarProduto());
		btnExcluir.addActionListener(e -> excluirProduto());
		
		
	}
	
	private void salvarProduto() {
		String nome - txtNome.getText();
		String preco - txtPreco.getText();
		if (!nome.isEmpty() && !preco.isEmpty()) {
			modelo.addRow(new Object[]{nome, preco});
			txtNome.setText("");
			txtPreco.setText("");
		}else{
			JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
		
	}
	
	private void editarProduto() {
		int linha = tabela.getSelectedRow();
		if (linha >= 0) {
			String novoNome = txtNome.getText();
			String novoPreco = txtPreco.getText();
			modelo.setValueAt(novoNome, linha, 0);
			modelo.setValueAt(novoPreco, linha, 1);
		}else{
			JOptionPane.showMessogeDiLog(this, "selecione um produto para editar!");
		}
	}
    
	private void excluirProduto() {
		
	}
	
	private static void main(String[] args) {
		
	}
}
