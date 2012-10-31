package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContactDetailsEntity;
import svm.persistence.abstraction.model.ILocationEntity;

import javax.persistence.*;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "contactdetails", schema = "", catalog = "svm")
@Entity
public class ContactDetailsEntity implements IContactDetailsEntity {
    private Integer id;

    @javax.persistence.Column(name = "id")
    @GeneratedValue
    @Id
    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String phone1;

    @Override
    @javax.persistence.Column(name = "phone1")
    @Basic
    public String getPhone1() {
        return phone1;
    }

    @Override
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    private String phone2;

    @Override
    @javax.persistence.Column(name = "phone2")
    @Basic
    public String getPhone2() {
        return phone2;
    }

    @Override
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    private String email1;

    @Override
    @javax.persistence.Column(name = "email1")
    @Basic
    public String getEmail1() {
        return email1;
    }

    @Override
    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    private String email2;

    @Override
    @javax.persistence.Column(name = "email2")
    @Basic
    public String getEmail2() {
        return email2;
    }

    @Override
    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    private String fax;

    @Override
    @javax.persistence.Column(name = "fax")
    @Basic
    public String getFax() {
        return fax;
    }

    @Override
    public void setFax(String fax) {
        this.fax = fax;
    }

    private String street;

    @Override
    @javax.persistence.Column(name = "street")
    @Basic
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    private String streetNumber;

    @Override
    @javax.persistence.Column(name = "streetnumber")
    @Basic
    public String getStreetNumber() {
        return streetNumber;
    }

    @Override
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    private String coordLat;

    @Override
    @javax.persistence.Column(name = "coordlat")
    @Basic
    public String getCoordLat() {
        return coordLat;
    }

    @Override
    public void setCoordLat(String coordLat) {
        this.coordLat = coordLat;
    }

    private String coordLong;

    @Override
    @javax.persistence.Column(name = "coordlong")
    @Basic
    public String getCoordLong() {
        return coordLong;
    }

    @Override
    public void setCoordLong(String coordLong) {
        this.coordLong = coordLong;
    }

    private ILocationEntity locationEntity;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = LocationEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "location")
    public ILocationEntity getLocationEntity() {
        return locationEntity;
    }

    @Override
    public void setLocationEntity(ILocationEntity locationEntity) {
        this.locationEntity = locationEntity;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactDetailsEntity that = (ContactDetailsEntity) o;

        if (id != that.id) return false;
        if (coordLat != null ? !coordLat.equals(that.coordLat) : that.coordLat != null) return false;
        if (coordLong != null ? !coordLong.equals(that.coordLong) : that.coordLong != null) return false;
        if (email1 != null ? !email1.equals(that.email1) : that.email1 != null) return false;
        if (email2 != null ? !email2.equals(that.email2) : that.email2 != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (phone1 != null ? !phone1.equals(that.phone1) : that.phone1 != null) return false;
        if (phone2 != null ? !phone2.equals(that.phone2) : that.phone2 != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (streetNumber != null ? !streetNumber.equals(that.streetNumber) : that.streetNumber != null) return false;

        return true;
    }


    public int hashCode() {
        int result = id;
        result = 31 * result + (phone1 != null ? phone1.hashCode() : 0);
        result = 31 * result + (phone2 != null ? phone2.hashCode() : 0);
        result = 31 * result + (email1 != null ? email1.hashCode() : 0);
        result = 31 * result + (email2 != null ? email2.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (coordLat != null ? coordLat.hashCode() : 0);
        result = 31 * result + (coordLong != null ? coordLong.hashCode() : 0);
        return result;
    }
}
