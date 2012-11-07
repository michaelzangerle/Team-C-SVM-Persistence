package svm.persistence.abstraction.model;

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

    List<IPartResultEntity> getPartResults();

    void setPartResults(List<IPartResultEntity> partResults);

    List<IMatchEntity> getMatches();

    void setMatches(List<IMatchEntity> matches);
}
