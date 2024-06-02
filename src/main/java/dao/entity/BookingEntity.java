package dao.entity;

import model.Passenger;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class BookingEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;

    private Long flightId;

    private List<Passenger> passengers;


    public BookingEntity(Long id, Long flightId, List<Passenger> passengers) {
        this.id = id;
        this.flightId = flightId;
        this.passengers = passengers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingEntity that = (BookingEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(flightId, that.flightId) && Objects.equals(passengers, that.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flightId, passengers);
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", flightId=" + flightId +
                ", passengers=" + passengers +
                '}';
    }
}