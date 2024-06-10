package gestor.registro.lib.records;

public record ColaboradorRecord(
		Long idColaborador,
		String nmColaborador,
		Integer inAtivo,
		Long idGestor,
		String nmCargo
	    ) {}