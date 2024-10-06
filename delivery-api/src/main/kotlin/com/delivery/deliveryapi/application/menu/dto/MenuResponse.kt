package com.delivery.deliveryapi.application.menu.dto

import com.delivery.deliveryapi.infrastructure.menu.Menu
import java.math.BigDecimal

data class MenuResponse(
    val menuId: Long,
    val menuName: String,
    val storeId: Long,
    val price: BigDecimal,
    val description: String,
    val menuImageUrl: String,
)

fun Menu.from(): MenuResponse = MenuResponse(
    menuId = menuId,
    menuName = menuName,
    storeId = storeId,
    price = price,
    description = description,
    menuImageUrl = menuMainImageUrl
)

