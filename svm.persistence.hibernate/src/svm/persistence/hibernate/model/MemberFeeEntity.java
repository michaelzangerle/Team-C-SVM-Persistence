package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMemberFeeEntity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Table(name = "membersfee", schema = "", catalog = "svm")
@Entity
public class MemberFeeEntity implements IMemberFeeEntity {
    private int id;

    @Override
    @GeneratedValue
    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Date date;

    @Override
    @Column(name = "date")
    @Basic
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    private float amount;

    @Override
    @Column(name = "amount")
    @Basic
    public float getAmount() {
        return amount;
    }

    @Override
    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberFeeEntity that = (MemberFeeEntity) o;

        if (Float.compare(that.amount, amount) != 0) return false;
        if (id != that.id) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (amount != +0.0f ? Float.floatToIntBits(amount) : 0);
        return result;
    }

}
