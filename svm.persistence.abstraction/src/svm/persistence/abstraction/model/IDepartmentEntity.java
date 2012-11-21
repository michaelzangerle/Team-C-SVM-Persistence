package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.DepartmentsHasMembersEntity;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IDepartmentEntity extends IEntity {
    int getId();

    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    String getDescription();

    void setDescription(String description);

    IContactDetailsEntity getContactDetails();

    void setContactDetails(IContactDetailsEntity contactDetails);

    List<ISportEntity> getSports();

    void setSports(List<ISportEntity> sports);

    @OneToMany(cascade = CascadeType.DETACH, targetEntity = DepartmentsHasMembersEntity.class, mappedBy = "pk.department", fetch = FetchType.LAZY)
    List<IDepartmentsHasMembersEntity> getDepartmentHasMembers();

    void setDepartmentHasMembers(List<IDepartmentsHasMembersEntity> departmentHasMembers);
}
