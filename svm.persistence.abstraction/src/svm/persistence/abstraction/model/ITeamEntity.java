package svm.persistence.abstraction.model;

import java.sql.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ITeamEntity extends IEntity {

    int getId();


    String getName();

    void setName(String name);


    String getAlias();

    void setAlias(String alias);


    Date getFounded();

    void setFounded(Date founded);


    ISportEntity getSport();

    void setSport(ISportEntity sport);


    IMemberEntity getContactPerson();

    void setContactPerson(IMemberEntity contactPerson);

    List<ITeamsHasMembersEntity> getTeamsHasMembers();

    void setTeamsHasMembers(List<ITeamsHasMembersEntity> teamsHasMembers);

    List<ISubTeamEntity> getSubTeams();

    void setSubTeams(List<ISubTeamEntity> subTeams);

    List<IContestantEntity> getContestants();

    void setContestants(List<IContestantEntity> contestants);

    ITeamTypeEntity getTeamType();

    void setTeamType(ITeamTypeEntity teamType);

    void setContestsHasTeams(List<IContestsHasTeamsEntity> contests);

    List<IContestsHasTeamsEntity> getContestsHasTeams();

}
