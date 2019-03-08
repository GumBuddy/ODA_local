package DAOs;

import DTOs.DTO_Licenciatura;
import HB_Class.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_Licenciatura {
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

    public long save(DTO_Licenciatura LicenciaturaEntity) {
        long id = 51;
        try {
            StartOperation();
            id = (Long) session.save(LicenciaturaEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    public void update(DTO_Licenciatura LicenciaturaEntity) throws HibernateException {
        try {
            StartOperation();
            session.update(LicenciaturaEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(DTO_Licenciatura LicenciaturaEntity) throws HibernateException {
        try {
            StartOperation();
            session.delete(LicenciaturaEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public DTO_Licenciatura getLicenciaturaDTO(long idLicenciaturaDTO) throws HibernateException {
        DTO_Licenciatura licenciaturaEntity = null;
        try {
            StartOperation();
            licenciaturaEntity = session.get(DTO_Licenciatura.class, idLicenciaturaDTO);
        } finally {
            session.close();
        }
        return licenciaturaEntity;
    }

    public List<DTO_Licenciatura> getListLicenciatura() throws HibernateException {
        List<DTO_Licenciatura> listLicenciatura = null;
        try {
            StartOperation();
            listLicenciatura = session.createQuery("FROM DTO_Licenciatura ").list();
        } finally {
            session.close();
        }
        return listLicenciatura;
    }
}
