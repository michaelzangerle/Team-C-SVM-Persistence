package svm.persistence.abstraction.model;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IExternalTeamEntity extends IEntity {
    int getId();

    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    IContactDetailsEntity getContactDetails();

    void setContactDetails(IContactDetailsEntity contactDetails);

    List<IContestantEntity> getContestant();

    void setContestant(List<IContestantEntity> contestant);

}
