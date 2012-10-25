package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.SportEntity;

import javax.persistence.*;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IDepartmentEntity extends IEntity {
    int getId();

    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    String getDescription();

    void setDescription(String description);

    IContactDetailsEntity getContactDetails();

    void setContactDetails(IContactDetailsEntity contactDetails);

    List<SportEntity> getSports();

    void setSports(List<SportEntity> sports);
}
