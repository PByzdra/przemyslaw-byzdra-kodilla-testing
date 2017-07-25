package com.kodilla.stream.forum;


import java.time.LocalDate;
import java.time.Period;

public final class CalculateAge {
    public int calculateAge(LocalDate dateOfBirth, LocalDate currentDate) {
        if ((dateOfBirth != null) && (currentDate != null)) {
            return Period.between(dateOfBirth, currentDate).getYears();
        } else {
            return 0;
        }
    }
}
