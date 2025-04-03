package com.reservations;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pitch {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private double pricePerHour;

    @ManyToOne
    @JoinColumn(name = "sport_center_id")
    private SportCenter sportCenter;

    @OneToMany(mappedBy = "pitch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservations> reservations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public SportCenter getSportCenter() {
		return sportCenter;
	}

	public void setSportCenter(SportCenter sportCenter) {
		this.sportCenter = sportCenter;
	}

	public List<Reservations> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservations> reservations) {
		this.reservations = reservations;
	}
    
}
