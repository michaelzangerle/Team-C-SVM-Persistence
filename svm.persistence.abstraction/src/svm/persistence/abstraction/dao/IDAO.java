package svm.persistence.abstraction.dao;

import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IEntity;

import java.util.List;

/**
 * Projectteam: Team C
 * Date: 19.10.12
 * Interface of all Data Access Object
 */
public interface IDAO<T extends IEntity> {

    /**
     * Returns List of all Object in the Table
     *
     * @param sessionId Session ID
     * @return List of all Object
     * @throws NoSessionFoundException No Session found for this Id
     */
    public List<T> getAll(Integer sessionId) throws NoSessionFoundException;

    /**
     * Saves given Object
     *
     * @param sessionId Session ID
     * @param obj       Object to save
     * @throws NoSessionFoundException No Session found for this Id
     */
    public void saveOrUpdate(Integer sessionId, T obj) throws NoSessionFoundException;

    /**
     * Returns List of all Objects compares to the WHERE clause
     *
     * @param sessionId Session ID
     * @param column    PropertyName
     * @param qualifier LogicalOperator
     * @param value     Value to Compare
     * @return List of Objects
     * @throws NoSessionFoundException No Session found for this Id
     */
    List<T> find(Integer sessionId, String column, FindQualifiers qualifier, String value) throws NoSessionFoundException;

    /**
     * Generates a new Object
     *
     * @return new Object
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public T generateObject() throws InstantiationException, IllegalAccessException;
}
