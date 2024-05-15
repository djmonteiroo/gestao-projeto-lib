package gestor.registro.lib.utils.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface GestaoProjetoResource {

	default <T extends Object> ResponseEntity<GestaoProjetoResponse<T>> retornarResponse(final HttpStatus status, final T response) {
		return ResponseEntity.status(status.value()).body(new GestaoProjetoResponse<>(response));
	}

	/*
	 * HTTP 200
	 */
	default <T extends Object> ResponseEntity<GestaoProjetoResponse<T>> retornarSucesso(final T response) {
		return response != null ? retornarResponse(HttpStatus.OK, response) : retornarSemConteudo();
	}

	default <T extends Object> ResponseEntity<GestaoProjetoResponse<T>> retornarSemConteudo() {
		return retornarResponse(HttpStatus.NO_CONTENT, null);
	}
	
}