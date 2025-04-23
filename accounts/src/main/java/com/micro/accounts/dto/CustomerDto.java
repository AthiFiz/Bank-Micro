package com.micro.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and account details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer",
            example = "Jon"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min=2, max=30, message = "The length of the name should be between 2 and 30")
    private String name;

    @NotEmpty(message = "email can not be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
