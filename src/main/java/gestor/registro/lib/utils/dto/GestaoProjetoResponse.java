package gestor.registro.lib.utils.dto;

import java.time.LocalDateTime;

public class GestaoProjetoResponse<T> {

	private LocalDateTime timestamp;
	private Integer nrStatus;
	private transient T dados;

	public GestaoProjetoResponse() {
		super();
	}

	public GestaoProjetoResponse(final T dados) {
		super();
		this.timestamp = LocalDateTime.now();
		this.dados = dados;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getNrStatus() {
		return nrStatus;
	}

	public void setNrStatus(Integer nrStatus) {
		this.nrStatus = nrStatus;
	}

	public T getDados() {
		return dados;
	}

	public void setDados(final T dados) {
		this.dados = dados;
	}

	@Override
	public String toString() {
		return "GestaoProjetoResponse [timestamp=" + timestamp + ", nrStatus=" + nrStatus + ", dados=" + dados + "]";
	}

}
