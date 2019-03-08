package DTOs;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "unidadAprendizaje", schema = "dbo", catalog = "ODA_local")
public class DTO_UnidadAprendizaje {
    private int idUa;
    private String nomUa;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id_UA", nullable = false)
    public int getIdUa() {
        return idUa;
    }

    public void setIdUa(int idUa) {
        this.idUa = idUa;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "nom_UA", nullable = false, length = 50)
    public String getNomUa() {
        return nomUa;
    }

    public void setNomUa(String nomUa) {
        this.nomUa = nomUa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO_UnidadAprendizaje that = (DTO_UnidadAprendizaje) o;
        return idUa == that.idUa &&
                Objects.equals(nomUa, that.nomUa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUa, nomUa);
    }
}
