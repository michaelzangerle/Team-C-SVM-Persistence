package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.ITeamEntity;
import svm.persistence.abstraction.model.ITeamsHasMembersEntity;

import javax.persistence.*;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Entity
@javax.persistence.Table(name = "teams_has_members", schema = "", catalog = "svm")
@AssociationOverrides({
        @AssociationOverride(name = "pk.member", joinColumns = @JoinColumn(name = "member")),
        @AssociationOverride(name = "pk.team", joinColumns = @JoinColumn(name = "team"))
})
public class TeamsHasMembersEntity implements ITeamsHasMembersEntity {

    private TeamsHasMembersEntityPK pk = new TeamsHasMembersEntityPK();

    @EmbeddedId()
    public TeamsHasMembersEntityPK getPk() {
        return pk;
    }

    public void setPk(TeamsHasMembersEntityPK pk) {
        this.pk = pk;
    }

    @Override
    @Transient
    public ITeamEntity getTeam() {
        return getPk().getTeam();
    }

    @Override
    public void setTeam(ITeamEntity team) {
        getPk().setTeam(team);
    }

    @Override
    @Transient
    public IMemberEntity getMember() {
        return getPk().getMember();
    }

    @Override
    public void setMember(IMemberEntity member) {
        getPk().setMember(member);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamsHasMembersEntity that = (TeamsHasMembersEntity) o;

        if (getMember() != that.getMember()) return false;
        if (getTeam() != that.getTeam()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getTeam().getId();
        result = 31 * result + getMember().getId();
        return result;
    }

    @Override
    public Integer getId() {
        return 0;
    }

    public void setId(Integer id) {
    }
}
