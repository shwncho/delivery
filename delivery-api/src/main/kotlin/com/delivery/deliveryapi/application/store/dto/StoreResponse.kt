package com.delivery.deliveryapi.application.store.dto

import com.delivery.deliveryapi.infrastructure.store.Store
import java.math.BigDecimal

data class StoreResponse(
    val storeName: String,
    val phone: String,
    val address: String,
    val deliveryFee: BigDecimal,
    val deliveryTime: String,
    val minimumOrderPrice: BigDecimal,
    val reviewGrade: Int,
    val storeMainImageUrl: String,
    val description: String,
)

fun Store.of(): StoreResponse = StoreResponse(
    storeName = storeName,
    phone = storePhone,
    address = address,
    deliveryFee = deliveryFee,
    deliveryTime = deliveryTime,
    minimumOrderPrice = minimumOrderPrice,
    reviewGrade = reviewGrade,
    storeMainImageUrl = storeMainImageUrl,
    description = description
)