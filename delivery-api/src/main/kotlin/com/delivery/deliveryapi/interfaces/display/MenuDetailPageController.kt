package com.delivery.deliveryapi.interfaces.display

import com.delivery.deliveryapi.application.menu.MenuService
import com.delivery.deliveryapi.domain.menu.MenuStatus
import com.delivery.deliveryapi.interfaces.display.dto.MenuDetailPageResponse
import io.github.oshai.kotlinlogging.KotlinLogging
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Tag(name = "MenuDetailPageController", description = "메뉴 상세 페이지 컨트롤러")
@RestController
class MenuDetailPageController(
    private val menuService: MenuService,
) {
    private val logger = KotlinLogging.logger {}

    @GetMapping("/apis/display/menus/{menuId}")
    fun detail(@PathVariable menuId: Long, @RequestParam storeId: Long): MenuDetailPageResponse {

        val menu = menuService.findByMenuId(menuId)

        return MenuDetailPageResponse(
            menuId = menuId,
            menuName = menu.menuName,
            storeId = menu.storeId,
            description = menu.description,
            menuMainImageUrl = menu.menuMainImageUrl,
            price = menu.price,
            menuStatue = MenuStatus.SALE,
        )
    }
}