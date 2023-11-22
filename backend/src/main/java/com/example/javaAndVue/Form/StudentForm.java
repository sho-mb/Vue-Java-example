package com.example.javaAndVue.Form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record StudentForm(
        @Size(min = 2) @NotEmpty String firstname,
        @Size(min = 2) @NotEmpty String lastname) {

}
