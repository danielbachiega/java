package ListaFila;

public class No {
	private int info;
	private No proximo;
	private No anterior;
	public No(int info) {
		this.info = info;
		this.anterior = null;
		this.proximo = null;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	@Override

	public String toString() {
		return "No [info=" + info + "]";
	}
}
