package model;



public class Produto {
	
	private String idProduto;
	private String nomeProduto;
	private String codBarra;
	private String tipoUn;
	private String dataVal;
	private String precoVal;
	private String estoque ;
	public Produto(String idProduto, String nomeProduto, String codBarra, String tipoUn, String dataVal,
			String precoVal, String estoque) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.codBarra = codBarra;
		this.tipoUn = tipoUn;
		this.dataVal = dataVal;
		this.precoVal = precoVal;
		this.estoque = estoque;
	}
	public Produto() {
		super();
	}
	public String getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}
	public String getTipoUn() {
		return tipoUn;
	}
	public void setTipoUn(String tipoUn) {
		this.tipoUn = tipoUn;
	}
	public String getDataVal() {
		return dataVal;
	}
	public void setDataVal(String dataVal) {
		this.dataVal = dataVal;
	}
	public String getPrecoVal() {
		return precoVal;
	}
	public void setPrecoVal(String precoVal) {
		this.precoVal = precoVal;
	}
	public String getEstoque() {
		return estoque;
	}
	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}
}
	
	
