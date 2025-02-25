package com.lessonhub.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Payment extends Timestamped {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private int totalPrice;

	@Column(nullable = false)
	private int basePrice;

	@Column
	private String paymentType;

	@Column(nullable = false, length = 100)
	private String status;

}
