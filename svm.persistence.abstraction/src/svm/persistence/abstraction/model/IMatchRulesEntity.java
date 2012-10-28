package svm.persistence.abstraction.model;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IMatchRulesEntity extends IEntity {
    int getId();

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    IMatchTypeEntity getMatchType();

    void setMatchType(IMatchTypeEntity matchType);
}
