package svm.persistence.abstraction.model;

import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ISubTeamEntity extends IEntity {

    int getId();

    String getName();

    void setName(String name);

    IContestEntity getContest();

    void setContest(IContestEntity contest);

    ITeamEntity getTeam();

    void setTeam(ITeamEntity team);

    List<ISubTeamsHasMembersEntity> getSubTeamsHasMembers();

    void setSubTeamsHasMembers(List<ISubTeamsHasMembersEntity> subTeamsHasMembers);
}
