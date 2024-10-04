package com.delivery.deliveryapi.interfaces.display.dto

import com.delivery.deliveryapi.domain.menu.MenuStatus
import java.math.BigDecimal

data class MenuDetailPageResponse(
    val menuId: Long,
    val menuName: String,
    val storeId: Long,
    val description: String,
    val menuMainImageUrl: String,
    val price: BigDecimal,
    val menuStatue: MenuStatus,
)
