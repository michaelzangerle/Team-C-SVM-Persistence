package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.PartResultEntity;

import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContestantEntity extends IEntity {

    int getId();

    ITeamEntity getInternalTeam();

    void setInternalTeam(ITeamEntity internalTeam);

    IExternalTeamEntity getExternalTeam();

    void setExternalTeam(IExternalTeamEntity externalTeam);

    List<PartResultEntity> getPartResults();

    void setPartResults(List<PartResultEntity> partResults);

    List<IMatchEntity> getMatches();

    void setMatches(List<IMatchEntity> matches);
}
