package DAOs;

import DTOs.DTO_UnidadAprendizaje;
import HB_Class.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_UnidadAprendizaje {
    private Session session;
    private Transaction transaction;

    private void StartOperation() throws HibernateException {
        session = HibernateUtil.getSf().openSession();
        transaction = session.beginTransaction();
    }

    private void MasterOfEX(HibernateException HE) throws HibernateException {
        transaction.rollback();
        throw new HibernateException("Error en al acceder a datos en " + HE);
    }

    public long save(DTO_UnidadAprendizaje UnidadaprendizajeEntity) {
        long id = 51;
        try {
            StartOperation();
            id = (Long) session.save(UnidadaprendizajeEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    public void update(DTO_UnidadAprendizaje UnidadaprendizajeEntity) throws HibernateException {
        try {
            StartOperation();
            session.update(UnidadaprendizajeEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(DTO_UnidadAprendizaje UnidadaprendizajeEntity) throws HibernateException {
        try {
            StartOperation();
            session.delete(UnidadaprendizajeEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public DTO_UnidadAprendizaje getUnidadaprendizajeDTO(long idUnidadAprendizajeDTO) throws HibernateException {
        DTO_UnidadAprendizaje unidadaprendizajeEntity = null;
        try {
            StartOperation();
            unidadaprendizajeEntity = session.get(DTO_UnidadAprendizaje.class, idUnidadAprendizajeDTO);
        } finally {
            session.close();
        }
        return unidadaprendizajeEntity;
    }

    public List<DTO_UnidadAprendizaje> getListUnidadaprendizaje() throws HibernateException {
        List<DTO_UnidadAprendizaje> listUnidadaprendizaje = null;
        try {
            StartOperation();
            listUnidadaprendizaje = session.createQuery("FROM DTO_UnidadAprendizaje ").list();
        } finally {
            session.close();
        }
        return listUnidadaprendizaje;
    }
}
