package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.*;

import java.sql.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMemberEntity extends IEntity {

    int getId();

    String getTitle();

    void setTitle(String title);

    String getFirstname();

    void setFirstname(String firstname);

    String getLastname();

    void setLastname(String lastname);

    String getSocialnumber();

    void setSocialnumber(String socialnumber);

    Date getBirthdate();

    void setBirthdate(Date birthdate);

    String getGender();

    void setGender(String gender);

    Date getEntrydate();

    void setEntrydate(Date entrydate);

    String getAvatar();

    void setAvatar(String avatar);

    String getUrl();

    void setUrl(String url);

    String getUsername();

    void setUsername(String username);

    double getFee();

    void setFee(double fee);

    ContactDetailsEntity getContactDetails();

    void setContactDetails(ContactDetailsEntity contactDetails);

    List<DepartmentsHasMembersEntity> getDepartmentHasMembers();

    void setDepartmentHasMembers(List<DepartmentsHasMembersEntity> departmentHasMembers);

    List<TeamsHasMembersEntity> getTeamsHasMembers();

    void setTeamsHasMembers(List<TeamsHasMembersEntity> teamsHasMembers);

    List<TeamEntity> getTeams();

    void setTeams(List<TeamEntity> teams);

    List<MemberFeeEntity> getFees();

    void setFees(List<MemberFeeEntity> fees);

    List<SubTeamsHasMembersEntity> getSubteamHasMember();

    void setSubteamHasMember(List<SubTeamsHasMembersEntity> subteamHasMember);

    List<MembersHasUserpriviledgesEntity> getPriviledges();

    void setPriviledges(List<MembersHasUserpriviledgesEntity> priviledges);
}
