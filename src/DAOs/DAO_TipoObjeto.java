package DAOs;

import DTOs.DTO_TipoObjeto;
import HB_Class.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_TipoObjeto {
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

    public long save(DTO_TipoObjeto TipoobjetoEntity) {
        long id = 51;
        try {
            StartOperation();
            id = (Long) session.save(TipoobjetoEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    public void update(DTO_TipoObjeto TipoobjetoEntity) throws HibernateException {
        try {
            StartOperation();
            session.update(TipoobjetoEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(DTO_TipoObjeto TipoobjetoEntity) throws HibernateException {
        try {
            StartOperation();
            session.delete(TipoobjetoEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public DTO_TipoObjeto getTipoobjetoDTO(long idTipoobjetoDTO) throws HibernateException {
        DTO_TipoObjeto tipoobjetoEntity = null;
        try {
            StartOperation();
            tipoobjetoEntity = session.get(DTO_TipoObjeto.class, idTipoobjetoDTO);
        } finally {
            session.close();
        }
        return tipoobjetoEntity;
    }

    public List<DTO_TipoObjeto> getListTipoobjeto() throws HibernateException {
        List<DTO_TipoObjeto> listTipoobjeto = null;
        try {
            StartOperation();
            listTipoobjeto = session.createQuery("FROM DTO_TipoObjeto ").list();
        } finally {
            session.close();
        }
        return listTipoobjeto;
    }
}
