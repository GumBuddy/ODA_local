package DTOs;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "tipoObjeto", schema = "dbo", catalog = "ODA_local")
public class DTO_TipoObjeto {
    private int idTipo;
    private String tipoObjeto;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id_tipo", nullable = false)
    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "tipo_objeto", nullable = false, length = 20)
    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO_TipoObjeto that = (DTO_TipoObjeto) o;
        return idTipo == that.idTipo &&
                Objects.equals(tipoObjeto, that.tipoObjeto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipo, tipoObjeto);
    }
}
