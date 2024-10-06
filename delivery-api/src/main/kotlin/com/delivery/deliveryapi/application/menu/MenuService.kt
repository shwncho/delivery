package com.delivery.deliveryapi.application.menu

import com.delivery.deliveryapi.application.menu.dto.MenuResponse
import com.delivery.deliveryapi.application.menu.dto.from
import com.delivery.deliveryapi.infrastructure.menu.Menu
import com.delivery.deliveryapi.infrastructure.menu.MenuRepository
import com.delivery.deliveryapi.support.exception.NotFoundMenuException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MenuService(
    private val menuRepository: MenuRepository
) {
    fun findByStoreId(storeId: Long): List<MenuResponse> {
        return menuRepository.findAllByStoreId(storeId).map { it.from() }
    }

    fun findByMenuId(menuId: Long): MenuResponse {
        return menuRepository.findByIdOrNull(menuId)?.from() ?: throw NotFoundMenuException()
    }
}