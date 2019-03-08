package DTOs;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "subcompetencia", schema = "dbo", catalog = "ODA_local")
public class DTO_Subcompetencia {
    private int idSubcom;
    private String nomSubcom;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id_subcom", nullable = false)
    public int getIdSubcom() {
        return idSubcom;
    }

    public void setIdSubcom(int idSubcom) {
        this.idSubcom = idSubcom;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "nom_subcom", nullable = false, length = 500)
    public String getNomSubcom() {
        return nomSubcom;
    }

    public void setNomSubcom(String nomSubcom) {
        this.nomSubcom = nomSubcom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO_Subcompetencia that = (DTO_Subcompetencia) o;
        return idSubcom == that.idSubcom &&
                Objects.equals(nomSubcom, that.nomSubcom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubcom, nomSubcom);
    }
}
