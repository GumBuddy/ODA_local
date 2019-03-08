package DTOs;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "autor", schema = "dbo", catalog = "ODA_local")
public class DTO_Autor  {
    private int idAutor;
    private String nomAutor;
    private String apePaterAutor;
    private String apeMaterAutor;
    private String tipoAutor;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id_autor", nullable = false)
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "nom_autor", nullable = false, length = 30)
    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "apePater_autor", nullable = true, length = 30)
    public String getApePaterAutor() {
        return apePaterAutor;
    }

    public void setApePaterAutor(String apePaterAutor) {
        this.apePaterAutor = apePaterAutor;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "apeMater_autor", nullable = true, length = 30)
    public String getApeMaterAutor() {
        return apeMaterAutor;
    }

    public void setApeMaterAutor(String apeMaterAutor) {
        this.apeMaterAutor = apeMaterAutor;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "tipo_autor", nullable = true, length = 30)
    public String getTipoAutor() {
        return tipoAutor;
    }

    public void setTipoAutor(String tipoAutor) {
        this.tipoAutor = tipoAutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO_Autor dto_autor = (DTO_Autor) o;
        return idAutor == dto_autor.idAutor &&
                Objects.equals(nomAutor, dto_autor.nomAutor) &&
                Objects.equals(apePaterAutor, dto_autor.apePaterAutor) &&
                Objects.equals(apeMaterAutor, dto_autor.apeMaterAutor) &&
                Objects.equals(tipoAutor, dto_autor.tipoAutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutor, nomAutor, apePaterAutor, apeMaterAutor, tipoAutor);
    }
}
