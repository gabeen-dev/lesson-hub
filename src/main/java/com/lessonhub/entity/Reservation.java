package com.lessonhub.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class Reservation extends Timestamped {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private LocalDate reservationStartTime;

	@Column(nullable = false)
	private LocalDate reservationEndTime;

	@Column
	private LocalDate canceledDate;

	@Column
	private String requests;

	@Column(nullable = false, length = 100)
	private String status;

}
