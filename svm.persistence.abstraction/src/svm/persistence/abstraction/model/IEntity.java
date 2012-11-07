package svm.persistence.abstraction.model;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 18.10.12
 * Time: 16:57
 * To change this template use File | Settings | File Templates.
 */
public interface IEntity extends Serializable,Remote {
    public int getId();
}
