package DTOs;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "licenciatura", schema = "dbo", catalog = "ODA_local")
public class DTO_Licenciatura {
    private int idLic;
    private String nomLic;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id_lic", nullable = false)
    public int getIdLic() {
        return idLic;
    }

    public void setIdLic(int idLic) {
        this.idLic = idLic;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "nom_lic", nullable = false, length = 50)
    public String getNomLic() {
        return nomLic;
    }

    public void setNomLic(String nomLic) {
        this.nomLic = nomLic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO_Licenciatura that = (DTO_Licenciatura) o;
        return idLic == that.idLic &&
                Objects.equals(nomLic, that.nomLic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLic, nomLic);
    }
}
