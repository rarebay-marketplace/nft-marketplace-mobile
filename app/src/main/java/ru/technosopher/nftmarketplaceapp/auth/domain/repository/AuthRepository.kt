package ru.technosopher.nftmarketplaceapp.auth.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.technosopher.nftmarketplaceapp.auth.domain.entities.AuthErrorEntity
import ru.technosopher.nftmarketplaceapp.auth.domain.entities.AuthLinkEntity
import ru.technosopher.nftmarketplaceapp.auth.domain.entities.AuthRejectedEntity
import ru.technosopher.nftmarketplaceapp.auth.domain.entities.AuthSuccessEntity

interface AuthRepository {
    suspend fun observeAuthLink(): Flow<AuthLinkEntity>
    suspend fun observeAuthSuccess(): Flow<AuthSuccessEntity>
    suspend fun observeAuthReject(): Flow<AuthRejectedEntity>
    suspend fun observeAuthError(): Flow<AuthErrorEntity>
    suspend fun connectToWebSocket()
}