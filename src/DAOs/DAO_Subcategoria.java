package DAOs;

import DTOs.DTO_Subcategoria;
import HB_Class.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_Subcategoria {
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

    public long save(DTO_Subcategoria SubcompetenciaEntity) {
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

    public void update(DTO_Subcategoria SubcategoriaEntity) throws HibernateException {
        try {
            StartOperation();
            session.update(SubcategoriaEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(DTO_Subcategoria SubcategoriaEntity) throws HibernateException {
        try {
            StartOperation();
            session.delete(SubcategoriaEntity);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public DTO_Subcategoria getSubcategoriaDTO(long idSubcategoriaDTO) throws HibernateException {
        DTO_Subcategoria subcategoriaEntity = null;
        try {
            StartOperation();
            subcategoriaEntity = session.get(DTO_Subcategoria.class, idSubcategoriaDTO);
        } finally {
            session.close();
        }
        return subcategoriaEntity;
    }

    public List<DTO_Subcategoria> getListSubcompetencia() throws HibernateException {
        List<DTO_Subcategoria> listsubcategoria = null;
        try {
            StartOperation();
            listsubcategoria = session.createQuery("FROM DTO_Subcategoria ").list();
        } finally {
            session.close();
        }
        return listsubcategoria;
    }
}
