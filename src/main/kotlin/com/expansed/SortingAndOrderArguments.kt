package com.expansed

import javax.annotation.Nullable
import javax.validation.constraints.Pattern
import javax.validation.constraints.Positive
import javax.validation.constraints.PositiveOrZero

data class SortingAndOrderArguments(
    @Nullable
    @PositiveOrZero
    val offset: Int?,

    @Nullable
    @Positive
    val max: Int,

    @Nullable
    @Pattern(regexp = "id|name")
    var sort: String?,

    @Nullable
    @Pattern(regexp = "asc|ASC|desc|DESC")
    val order: String?
)