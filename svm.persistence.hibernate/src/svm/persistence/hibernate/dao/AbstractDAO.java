package svm.persistence.hibernate.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import svm.persistence.abstraction.dao.IDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IEntity;
import svm.persistence.hibernate.HibernateUtil;

import javax.persistence.Table;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 19.10.12
 * Abstract Data Access Object
 */
public abstract class AbstractDAO<T extends IEntity> implements IDAO<T> {
    private Class clazz;
    private String tableName;

    protected AbstractDAO(Class clazz) {
        this.clazz = clazz;
        Table table = (Table) clazz.getAnnotation(Table.class);
        this.tableName = table.name();
    }

    /**
     * Returns List of all Object in the Table
     *
     * @param sessionId Session ID
     * @return List of all Object
     * @throws NoSessionFoundException No Session found for this Id
     */
    @Override
    public List<T> getAll(Integer sessionId) throws NoSessionFoundException {
        Session session = HibernateUtil.getSession(sessionId);
        Query query = session.createQuery("from " + clazz.getName());
        return query.list();
    }

    /**
     * Saves given Object
     *
     * @param sessionId Session ID
     * @param obj       Object to save
     * @throws NoSessionFoundException No Session found for this Id
     */
    public void saveOrUpdate(Integer sessionId, T obj) throws NoSessionFoundException {
        Session session = HibernateUtil.getSession(sessionId);
        session.saveOrUpdate(obj);
    }

    /**
     * Generates a new Object
     *
     * @return new Object
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public T generateObject() throws InstantiationException, IllegalAccessException {
        return (T) clazz.newInstance();
    }
}
