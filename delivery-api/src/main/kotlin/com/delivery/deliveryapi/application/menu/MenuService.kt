package com.delivery.deliveryapi.application.menu

import com.delivery.deliveryapi.infrastructure.menu.Menu
import com.delivery.deliveryapi.infrastructure.menu.MenuRepository
import com.delivery.deliveryapi.support.exception.NotFoundMenuException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MenuService(
    private val menuRepository: MenuRepository
) {
    fun findByStoreId(storeId: Long): List<Menu> {
        return menuRepository.findAllByStoreId(storeId)
    }

    fun findByMenuId(menuId: Long): Menu {
        return menuRepository.findByIdOrNull(menuId) ?: throw NotFoundMenuException()
    }
}