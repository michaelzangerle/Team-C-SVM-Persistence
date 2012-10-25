package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.TeamTypeEntity;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ITeamRuleEntity extends IEntity {

    int getId();

    int getAmount();

    void setAmount(int amount);

    String getOperator();

    void setOperator(String operator);

    String getDescription();

    void setDescription(String description);

    TeamTypeEntity getTeamType();

    void setTeamType(TeamTypeEntity teamType);
}
