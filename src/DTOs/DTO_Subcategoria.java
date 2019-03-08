package DTOs;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "subcategoria", schema = "dbo", catalog = "ODA_local")
public class DTO_Subcategoria {
    private int idSubcat;
    private String nomSubcat;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id_subcat", nullable = false)
    public int getIdSubcat() {
        return idSubcat;
    }

    public void setIdSubcat(int idSubcat) {
        this.idSubcat = idSubcat;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "nom_subcat", nullable = false, length = 100)
    public String getNomSubcat() {
        return nomSubcat;
    }

    public void setNomSubcat(String nomSubcat) {
        this.nomSubcat = nomSubcat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO_Subcategoria that = (DTO_Subcategoria) o;
        return idSubcat == that.idSubcat &&
                Objects.equals(nomSubcat, that.nomSubcat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubcat, nomSubcat);
    }
}
