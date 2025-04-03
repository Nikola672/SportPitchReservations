package com.reservations;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
public class Reservations {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private LocalDateTime startTime;
	    private LocalDateTime endTime;

	    @ManyToOne
	    @JoinColumn(name = "pitch_id")
	    private Pitch pitch;

	    @ManyToMany(mappedBy = "reservations")
	    private List<Client> clients;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDateTime getStartTime() {
			return startTime;
		}

		public void setStartTime(LocalDateTime startTime) {
			this.startTime = startTime;
		}

		public LocalDateTime getEndTime() {
			return endTime;
		}

		public void setEndTime(LocalDateTime endTime) {
			this.endTime = endTime;
		}

		public Pitch getPitch() {
			return pitch;
		}

		public void setPitch(Pitch pitch) {
			this.pitch = pitch;
		}

		public List<Client> getClients() {
			return clients;
		}

		public void setClients(List<Client> clients) {
			this.clients = clients;
		}

	    
}
