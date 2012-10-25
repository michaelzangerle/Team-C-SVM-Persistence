package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.ContestEntity;
import svm.persistence.hibernate.model.SubTeamsHasMembersEntity;
import svm.persistence.hibernate.model.TeamEntity;

import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ISubTeamEntity extends IEntity {

    int getId();

    String getName();

    void setName(String name);


    ContestEntity getContest();

    void setContest(ContestEntity contest);

    TeamEntity getTeam();

    void setTeam(TeamEntity team);

    List<ISubTeamsHasMembersEntity> getSubTeamsHasMembers();

    void setSubTeamsHasMembers(List<ISubTeamsHasMembersEntity> subTeamsHasMembers);
}
