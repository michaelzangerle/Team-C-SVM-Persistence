package svm.persistence.hibernate.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import svm.persistence.abstraction.dao.CompareObject;
import svm.persistence.abstraction.dao.FindQualifiers;
import svm.persistence.abstraction.dao.IDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.IEntity;
import svm.persistence.hibernate.HibernateUtil;

import javax.persistence.Table;
import java.util.List;

/**
 * Abstract Data Access Object
 * Projectteam: Team C
 * Date: 19.10.12
 *
 * @param <T> Type of Entity
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
        String hql = String.format("FROM %s", clazz.getName());
        Query query = session.createQuery("from " + clazz.getName());
        return query.list();
    }

    /**
     * Returns a Object with the ID
     *
     * @param sessionId Session ID
     * @param id        ID
     * @return List of all Object
     * @throws NoSessionFoundException No Session found for this Id
     */
    public T getById(Integer sessionId, int id) throws NoSessionFoundException {
        Session session = HibernateUtil.getSession(sessionId);

        return (T) session.load(clazz, id);
    }

    /**
     * Returns List of all Objects compares to the WHERE clause
     *
     * @param sessionId Session ID
     * @param compare   column, qualifier, value
     * @return List of Objects
     * @throws NoSessionFoundException No Session found for this Id
     */
    @Override
    public List<T> find(Integer sessionId, CompareObject compare) throws NoSessionFoundException {
        Session session = HibernateUtil.getSession(sessionId);
        String hql = String.format("FROM %s WHERE %s", clazz.getName(), compare.toString());
        Query query = session.createQuery(hql);
        return query.list();
    }

    /**
     * Returns List of all Objects compares to the WHERE clause
     *
     * @param sessionId Session ID
     * @param compares  Array of column, qualifier, value
     * @return List of Objects
     * @throws NoSessionFoundException No Session found for this Id
     */
    @Override
    public List<T> find(Integer sessionId, CompareObject[] compares) throws NoSessionFoundException {
        Session session = HibernateUtil.getSession(sessionId);
        StringBuffer hql = new StringBuffer();
        hql.append(String.format("FROM %s WHERE %s ", clazz.getName(), compares[0].toString()));
        for (int i = 1; i < compares.length; i++) {
            String val = compares[i].getValue();
            if (compares[i].getQualifier() != FindQualifiers.BETWEEN) val = "'" + val + "'";
            hql.append(String.format(" %s ", compares[i].toString(i)));
        }
        Query query = session.createQuery(hql.toString());
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
     * Removes Object from DataBase
     *
     * @param sessionId SessionId
     * @param entity    Object to remove
     */
    public void removeObject(Integer sessionId, T entity) throws NoSessionFoundException {
        Session session = HibernateUtil.getSession(sessionId);
        session.delete(entity);
    }

    /**
     * Generates a new Object
     *
     * @return new Object
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public abstract T generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException;

    /**
     * Generates a new Object
     *
     * @return new Object
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public abstract T generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException;
}
