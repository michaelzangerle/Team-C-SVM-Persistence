package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.ContestantEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IPartResultEntity extends IEntity {

    int getId();

    float getResult();

    void setResult(float result);

    String getComment();

    void setComment(String comment);

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContestantEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contestant")
    ContestantEntity getContestant();

    void setContestant(ContestantEntity contestant);
}
