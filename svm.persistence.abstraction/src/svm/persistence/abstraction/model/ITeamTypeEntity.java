package svm.persistence.abstraction.model;

import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ITeamTypeEntity extends IEntity {

    Integer getId();


    String getName();

    void setName(String name);


    int getAlias();

    void setAlias(int alias);


    String getDescription();

    void setDescription(String description);

    List<ITeamEntity> getTeams();

    void setTeams(List<ITeamEntity> teams);

    List<ITeamRuleEntity> getTeamRules();

    void setTeamRules(List<ITeamRuleEntity> teamRules);
}
