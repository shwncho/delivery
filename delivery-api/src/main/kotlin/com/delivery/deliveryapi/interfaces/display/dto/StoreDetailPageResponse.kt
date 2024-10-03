package com.delivery.deliveryapi.interfaces.display.dto

import com.delivery.deliveryapi.interfaces.catalog.menu.dto.MenuDTO
import java.math.BigDecimal

data class StoreDetailPageResponse(
    val storeId: Long,
    val storeName: String,
    val phone: String,
    val address: String,
    val deliveryFee: BigDecimal,
    val deliveryTime: String,
    val minimumOrderPrice: BigDecimal,
    val reviewGrade: Int,
    val storeMainImageUrl: String,
    val description: String,
    val menus: List<MenuDTO>
)