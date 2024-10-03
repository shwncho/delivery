package com.delivery.deliveryapi.interfaces.display

import com.delivery.deliveryapi.application.menu.MenuService
import com.delivery.deliveryapi.application.store.StoreService
import com.delivery.deliveryapi.interfaces.catalog.menu.dto.MenuDTO
import com.delivery.deliveryapi.interfaces.display.dto.StoreDetailPageResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@Tag(name = "StoreDetailPageController", description = "상점 상세 페이지 컨트롤러")
@RestController
class StoreDetailPageController(
    val storeService: StoreService,
    val menuService: MenuService,
) {

    @GetMapping("/apis/display/stores/{storeId}")
    fun list(@PathVariable storeId: Long): StoreDetailPageResponse {

        val store = storeService.findByStoreId(storeId)

        val menus = menuService.findByStoreId(storeId)
        val menuDTOs = menus.map { MenuDTO.from(it) }

        return StoreDetailPageResponse(
            storeId = storeId,
            storeName = store.storeName,
            phone = store.storePhone,
            address = store.address,
            storeMainImageUrl = store.storeMainImageUrl,
            description = store.description,
            deliveryFee = store.deliveryFee,
            deliveryTime = store.deliveryTime,
            reviewGrade = store.reviewGrade,
            minimumOrderPrice = store.minimumOrderPrice,
            menus = menuDTOs,
        )
    }
}