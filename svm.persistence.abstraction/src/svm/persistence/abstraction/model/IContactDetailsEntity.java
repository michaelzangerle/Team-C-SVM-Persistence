package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.LocationEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IContactDetailsEntity extends IEntity {
    int getId();

    String getPhone1();

    void setPhone1(String phone1);

    String getPhone2();

    void setPhone2(String phone2);

    String getEmail1();

    void setEmail1(String email1);

    String getEmail2();

    void setEmail2(String email2);

    String getFax();

    void setFax(String fax);

    String getStreet();

    void setStreet(String street);

    String getStreetNumber();

    void setStreetNumber(String streetNumber);

    String getCoordLat();

    void setCoordLat(String coordLat);

    String getCoordLong();

    void setCoordLong(String coordLong);

    ILocationEntity getLocationEntity();

    void setLocationEntity(ILocationEntity locationEntity);
}
