package com.lab5.week8_lab5.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Reservation {

    private Long reservationId;

    @NotBlank(message = "tag cannot be blank")
    private String equipmentTag;

    @NotBlank(message = "Student email cannot be blank")
    @Email(message = "Must be a valid email address")
    private String studentEmail;

    @NotNull(message = "Reservation date cannot be null")
    private LocalDate reservationDate;

    @Min(value = 0, message = "Start hour must be at least 0")
    @Max(value = 23, message = "Start hour cannot be greater than 23")
    private int startHour;

    @Min(value = 1, message = "Duration must be at least 1 hour")
    @Max(value = 24, message = "Duration cant be greater than 24 hours")
    private int durationHours;
}
