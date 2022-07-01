package br.com.alura.forum.config.validacao;

public class ErrodeFormularioDto {

    private String field;
    private String mensage;

    public ErrodeFormularioDto(String field, String mensage) {
        this.field = field;
        this.mensage = mensage;
    }

    public String getField() {
        return field;
    }

    public String getMensage() {
        return mensage;
    }
}
