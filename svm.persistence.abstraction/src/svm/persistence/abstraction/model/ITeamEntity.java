package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.*;

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


    SportEntity getSport();

    void setSport(SportEntity sport);


    MemberEntity getContactPerson();

    void setContactPerson(MemberEntity contactPerson);

    List<TeamsHasMembersEntity> getTeamsHasMembers();

    void setTeamsHasMembers(List<TeamsHasMembersEntity> teamsHasMembers);

    List<ContestsHasTeamsEntity> getContestsHasTeams();

    void setContestsHasTeams(List<ContestsHasTeamsEntity> contestsHasTeams);

    List<SubTeamEntity> getSubteams();

    void setSubteams(List<SubTeamEntity> subteams);

    List<ContestantEntity> getContestants();

    void setContestants(List<ContestantEntity> contestans);

    TeamTypeEntity getTeamType();

    void setTeamType(TeamTypeEntity teamType);
}
