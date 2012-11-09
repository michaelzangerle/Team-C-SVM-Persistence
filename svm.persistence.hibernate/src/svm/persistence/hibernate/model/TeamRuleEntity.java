package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMemberRoleEntity;
import svm.persistence.abstraction.model.ITeamRuleEntity;

import javax.persistence.*;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Table(name = "teamrules", schema = "", catalog = "svm")
@Entity
public class TeamRuleEntity implements ITeamRuleEntity {
    private int id;

    @Override
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int amount;

    @Override
    @Column(name = "amount")
    @Basic
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    private String operator;

    @Override
    @Column(name = "operator")
    @Basic
    public String getOperator() {
        return operator;
    }

    @Override
    public void setOperator(String operator) {
        this.operator = operator;
    }

    private String description;

    @Override
    @Column(name = "description")
    @Basic
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamRuleEntity that = (TeamRuleEntity) o;

        if (amount != that.amount) return false;
        if (id != that.id) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + amount;
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    private IMemberRoleEntity memberRole;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = MemberRoleEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "memberRole")
    public IMemberRoleEntity getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(IMemberRoleEntity memberRole) {
        this.memberRole = memberRole;
    }
}
