package com.hudakocabiyik.account.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import java.math.BigDecimal

data class CreateAccountRequest(
    @field:NotBlank(message = "Customer id Cannot be blank")
    val customerId: String,
    @field:Min(0,message = "Amount Limit Cannot be greater than 0")
    val initialCredit: BigDecimal
)
