package DAOs;

import DTOs.DTO_Autor;
import HB_Class.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_Autor {
    private Session session;
    private Transaction transaction;

    private void StartOperation() throws HibernateException {
        session = HibernateUtil.getSf().openSession();
        transaction = session.beginTransaction();
    }

    /*MasterOfEX= manejador de excepsiones */
    private void MasterOfEX(HibernateException HE) throws HibernateException {
        transaction.rollback();
        throw new HibernateException("Error en al acceder a datos en " + HE);
    }

    /*Guarda Subcategoria*/
    public long save(DTO_Autor AutorEntity) {
        long id = 51;
        try {
            StartOperation();
            id = (Long) session.save(AutorEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    /*update: actualiza los valores de Subcategoria*/
    public void update(DTO_Autor AutorEntity) throws HibernateException {
        try {
            StartOperation();
            session.update(AutorEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    /*delete: elimina un autor*/
    public void delete(DTO_Autor AutorEntity) throws HibernateException {
        try {
            StartOperation();
            session.delete(AutorEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    /*getAutorDTO : obtiene un autor en especifico en busqueda por ID*/
    public DTO_Autor getAutorDTO(long idAutorDTO) throws HibernateException {
        DTO_Autor autorEntity = null;
        try {
            StartOperation();
            autorEntity = session.get(DTO_Autor.class, idAutorDTO);
        } finally {
            session.close();
        }
        return autorEntity;
    }

    public List<DTO_Autor> getListAutors() throws HibernateException {
        /*listAUTORS: contiene la busqueda completa de todos los autores*/
        List<DTO_Autor> listAUTORS = null;
        try {
            StartOperation();
            listAUTORS = session.createQuery("FROM DTO_Autor ").list();
        } finally {
            session.close();
        }
        return listAUTORS;
    }
}
