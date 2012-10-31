package svm.persistence.abstraction.model;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IDepartmentEntity extends IEntity {
    Integer getId();

    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    String getDescription();

    void setDescription(String description);

    IContactDetailsEntity getContactDetails();

    void setContactDetails(IContactDetailsEntity contactDetails);

    List<ISportEntity> getSports();

    void setSports(List<ISportEntity> sports);
}
