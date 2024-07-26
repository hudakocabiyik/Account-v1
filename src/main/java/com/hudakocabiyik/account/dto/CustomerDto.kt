package com.hudakocabiyik.account.dto

import com.hudakocabiyik.account.model.Account

data class CustomerDto(
    val id:String,
    val name: String,
    val surname: String,
    val accounts: Set<CustomerAccountDto>
)
