/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinventory;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author wrl123u
 */
@Entity
@Table(name = "CARS")
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c")
    , @NamedQuery(name = "Cars.findByCarId", query = "SELECT c FROM Cars c WHERE c.carId = :carId")
    , @NamedQuery(name = "Cars.findByRentalLocation", query = "SELECT c FROM Cars c WHERE c.rentalLocation = :rentalLocation")
    , @NamedQuery(name = "Cars.findByPrice", query = "SELECT c FROM Cars c WHERE c.price = :price")
    , @NamedQuery(name = "Cars.findByCarYear", query = "SELECT c FROM Cars c WHERE c.carYear = :carYear")
    , @NamedQuery(name = "Cars.findByModel", query = "SELECT c FROM Cars c WHERE c.model = :model")
    , @NamedQuery(name = "Cars.findByMake", query = "SELECT c FROM Cars c WHERE c.make = :make")})
public class Cars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAR_ID")
    private Integer carId;
    @Column(name = "RENTAL_LOCATION")
    private String rentalLocation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "CAR_YEAR")
    private Short carYear;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "MAKE")
    private String make;

    public Cars() {
    }

    public Cars(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getRentalLocation() {
        return rentalLocation;
    }

    public void setRentalLocation(String rentalLocation) {
        this.rentalLocation = rentalLocation;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Short getCarYear() {
        return carYear;
    }

    public void setCarYear(Short carYear) {
        this.carYear = carYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carId != null ? carId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.carId == null && other.carId != null) || (this.carId != null && !this.carId.equals(other.carId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carinventory.Cars[ carId=" + carId + " ]";
    }
    
}
