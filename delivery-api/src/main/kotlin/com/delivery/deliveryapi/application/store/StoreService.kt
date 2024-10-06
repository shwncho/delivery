package com.delivery.deliveryapi.application.store

import com.delivery.deliveryapi.infrastructure.store.Store
import com.delivery.deliveryapi.infrastructure.store.StoreRepository
import com.delivery.deliveryapi.support.exception.NotFoundStoreException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class StoreService(
    private val storeRepository: StoreRepository
) {
    fun findByStoreId(storeId: Long): Store {
        return storeRepository.findByIdOrNull(storeId) ?: throw NotFoundStoreException()
    }
}