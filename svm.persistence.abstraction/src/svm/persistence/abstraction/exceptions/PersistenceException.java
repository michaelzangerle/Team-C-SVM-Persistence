package svm.persistence.abstraction.exceptions;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam: Team C
 * Date: 19.10.12
 * Marks a Exception in Persistence Layer
 */
public class PersistenceException extends Exception implements Remote,Serializable {
}
