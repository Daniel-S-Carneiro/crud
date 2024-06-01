package br.com.portifolio.progamacao.web.crud.resources.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -5444644948041618040L;

    public ResourceNotFoundException(Object id) {
        super("Não localizamos um usuario com a id: " + id);
    }

}
