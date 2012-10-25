package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContestantEntity;
import svm.persistence.abstraction.model.IPartResultEntity;

import javax.persistence.*;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "partresult", schema = "", catalog = "svm")
@Entity
public class PartResultEntity implements IPartResultEntity {
    private int id;

    @Override
    @GeneratedValue
    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private float result;

    @Override
    @javax.persistence.Column(name = "result")
    @Basic
    public float getResult() {
        return result;
    }

    @Override
    public void setResult(float result) {
        this.result = result;
    }

    private String comment;

    @Override
    @javax.persistence.Column(name = "comment")
    @Basic
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartResultEntity that = (PartResultEntity) o;

        if (id != that.id) return false;
        if (Float.compare(that.result, result) != 0) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id;
        result1 = 31 * result1 + (result != +0.0f ? Float.floatToIntBits(result) : 0);
        result1 = 31 * result1 + (comment != null ? comment.hashCode() : 0);
        return result1;
    }

    private IContestantEntity contestant;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContestantEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contestant")
    public IContestantEntity getContestant() {
        return contestant;
    }

    @Override
    public void setContestant(IContestantEntity contestant) {
        this.contestant = contestant;
    }
}
