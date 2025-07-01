package model;

public class Venda {
	private String idVenda;
	private String idCliente;
	private String idFuncionario;
	private String dataVenda;
	private String precoTotal;
	private String formapag;
	private String quantTotal;
	public Venda(String idVenda, String idCliente, String idFuncionario, String dataVenda, String precoTotal,
			String formapag, String quantTotal) {
		super();
		this.idVenda = idVenda;
		this.idCliente = idCliente;
		this.idFuncionario = idFuncionario;
		this.dataVenda = dataVenda;
		this.precoTotal = precoTotal;
		this.formapag = formapag;
		this.quantTotal = quantTotal;
	}
	public Venda() {
		super();
	}
	public String getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(String idVenda) {
		this.idVenda = idVenda;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(String precoTotal) {
		this.precoTotal = precoTotal;
	}
	public String getFormapag() {
		return formapag;
	}
	public void setFormapag(String formapag) {
		this.formapag = formapag;
	}
	public String getQuantTotal() {
		return quantTotal;
	}
	public void setQuantTotal(String quantTotal) {
		this.quantTotal = quantTotal;
	}
	
	

}
