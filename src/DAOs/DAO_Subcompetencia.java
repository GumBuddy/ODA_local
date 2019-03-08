package DAOs;

import DTOs.DTO_Subcompetencia;
import HB_Class.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_Subcompetencia {
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

    public long save(DTO_Subcompetencia SubcompetenciaEntity) {
        long id = 51;
        try {
            StartOperation();
            id = (Long) session.save(SubcompetenciaEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    public void update(DTO_Subcompetencia SubcompetenciaEntity) throws HibernateException {
        try {
            StartOperation();
            session.update(SubcompetenciaEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(DTO_Subcompetencia SubcompetenciaEntity) throws HibernateException {
        try {
            StartOperation();
            session.delete(SubcompetenciaEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public DTO_Subcompetencia getSubcompetenciaDTO(long idSubcompetenciaDTO) throws HibernateException {
        DTO_Subcompetencia subcompetenciaEntity = null;
        try {
            StartOperation();
            subcompetenciaEntity = session.get(DTO_Subcompetencia.class, idSubcompetenciaDTO);
        } finally {
            session.close();
        }
        return subcompetenciaEntity;
    }

    public List<DTO_Subcompetencia> getListSubcompetencia() throws HibernateException {
        List<DTO_Subcompetencia> listSubcompetencia = null;
        try {
            StartOperation();
            listSubcompetencia = session.createQuery("FROM DTO_Subcompetencia ").list();
        } finally {
            session.close();
        }
        return listSubcompetencia;
    }
}
