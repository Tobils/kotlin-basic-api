package com.example.ypp.response


import com.google.gson.annotations.SerializedName

data class GetResponseRandomRestaurant(
    @SerializedName("address")
    val address: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("hours")
    val hours: Hours,
    @SerializedName("id")
    val id: Int,
    @SerializedName("logo")
    val logo: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("phone_number")
    val phoneNumber: String,
    @SerializedName("review")
    val review: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("uid")
    val uid: String
) {
    data class Hours(
        @SerializedName("friday")
        val friday: Friday,
        @SerializedName("monday")
        val monday: Monday,
        @SerializedName("saturday")
        val saturday: Saturday,
        @SerializedName("sunday")
        val sunday: Sunday,
        @SerializedName("thursday")
        val thursday: Thursday,
        @SerializedName("tuesday")
        val tuesday: Tuesday,
        @SerializedName("wednesday")
        val wednesday: Wednesday
    ) {
        data class Friday(
            @SerializedName("closes_at")
            val closesAt: String,
            @SerializedName("is_closed")
            val isClosed: Boolean,
            @SerializedName("opens_at")
            val opensAt: String
        )

        data class Monday(
            @SerializedName("closes_at")
            val closesAt: String,
            @SerializedName("is_closed")
            val isClosed: Boolean,
            @SerializedName("opens_at")
            val opensAt: String
        )

        data class Saturday(
            @SerializedName("closes_at")
            val closesAt: String,
            @SerializedName("is_closed")
            val isClosed: Boolean,
            @SerializedName("opens_at")
            val opensAt: String
        )

        data class Sunday(
            @SerializedName("closes_at")
            val closesAt: String,
            @SerializedName("is_closed")
            val isClosed: Boolean,
            @SerializedName("opens_at")
            val opensAt: String
        )

        data class Thursday(
            @SerializedName("closes_at")
            val closesAt: String,
            @SerializedName("is_closed")
            val isClosed: Boolean,
            @SerializedName("opens_at")
            val opensAt: String
        )

        data class Tuesday(
            @SerializedName("closes_at")
            val closesAt: String,
            @SerializedName("is_closed")
            val isClosed: Boolean,
            @SerializedName("opens_at")
            val opensAt: String
        )

        data class Wednesday(
            @SerializedName("closes_at")
            val closesAt: String,
            @SerializedName("is_closed")
            val isClosed: Boolean,
            @SerializedName("opens_at")
            val opensAt: String
        )
    }
}