package DAOs;

import DTOs.DTO_ObjetoAprendizaje;
import HB_Class.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_ObjetoAprendizaje {
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

    public long save(DTO_ObjetoAprendizaje ObjetoaprendizajeEntity) {
        long id = 51;
        try {
            StartOperation();
            id = (Long) session.save(ObjetoaprendizajeEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    public void update(DTO_ObjetoAprendizaje ObjetoaprendizajeEntity) throws HibernateException {
        try {
            StartOperation();
            session.update(ObjetoaprendizajeEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(DTO_ObjetoAprendizaje ObjetoaprendizajeEntity) throws HibernateException {
        try {
            StartOperation();
            session.delete(ObjetoaprendizajeEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public DTO_ObjetoAprendizaje getObjetoaprendizajeDTO(long idObjetoaprendizajeDTO) throws HibernateException {
        DTO_ObjetoAprendizaje objetoaprendizajeEntity = null;
        try {
            StartOperation();
            objetoaprendizajeEntity = session.get(DTO_ObjetoAprendizaje.class, idObjetoaprendizajeDTO);
        } finally {
            session.close();
        }
        return objetoaprendizajeEntity;
    }

    public List<DTO_ObjetoAprendizaje> getListObjetoaprendizaje() throws HibernateException {
        List<DTO_ObjetoAprendizaje> listLicenciatura = null;
        try {
            StartOperation();
            listLicenciatura = session.createQuery("FROM DTO_ObjetoAprendizaje ").list();
        } finally {
            session.close();
        }
        return listLicenciatura;
    }
}
