package svm.persistence.abstraction.model;

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

}
