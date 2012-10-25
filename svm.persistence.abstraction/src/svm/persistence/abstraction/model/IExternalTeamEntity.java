package svm.persistence.abstraction.model;

import svm.persistence.abstraction.model.IContactDetailsEntity;
import svm.persistence.abstraction.model.IContestantEntity;
import svm.persistence.abstraction.model.IEntity;
import svm.persistence.hibernate.model.ContactDetailsEntity;
import svm.persistence.hibernate.model.ContestantEntity;
import svm.persistence.hibernate.model.ContestsHasExternalTeamsEntity;

import javax.persistence.*;
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

    List<IContestsHasExternalTeamsEntity> getExternalTeams();

    void setExternalTeams(List<IContestsHasExternalTeamsEntity> externalTeams);
}
