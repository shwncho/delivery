package com.delivery.deliveryapi.interfaces.catalog.menu.dto

import com.delivery.deliveryapi.application.menu.dto.MenuResponse
import java.math.BigDecimal

data class MenuDTO(
    val menuId: Long,
    val menuName: String,
    val storeId: Long,
    val price: BigDecimal,
    val description: String,
    val menuImageUrl: String,
) {
    companion object {
        fun from(menuResponse: MenuResponse): MenuDTO {
            return MenuDTO(
                menuId = menuResponse.menuId,
                menuName = menuResponse.menuName,
                storeId = menuResponse.storeId,
                price = menuResponse.price,
                description = menuResponse.description,
                menuImageUrl = menuResponse.menuImageUrl,
            )
        }
    }
}