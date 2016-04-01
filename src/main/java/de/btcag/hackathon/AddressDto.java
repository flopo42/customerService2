package de.btcag.hackathon;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddressDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long addressId;
    private String streetName;
    private String houseNumber;
    private String city;
    private String zip;

    @Override
    public String toString() {
        return "AddressDto{" +
              "id=" + id +
              ", addressId=" + addressId +
              ", streetName='" + streetName + '\'' +
              ", houseNumber='" + houseNumber + '\'' +
              ", city='" + city + '\'' +
              ", zip='" + zip + '\'' +
              '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
