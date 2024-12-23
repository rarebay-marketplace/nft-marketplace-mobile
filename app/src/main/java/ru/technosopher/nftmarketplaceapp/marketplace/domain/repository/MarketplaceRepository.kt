package ru.technosopher.nftmarketplaceapp.marketplace.domain.repository

import arrow.core.Either
import ru.technosopher.nftmarketplaceapp.core.domain.entities.NetworkError
import ru.technosopher.nftmarketplaceapp.marketplace.domain.entities.NftCollectionEntity
import ru.technosopher.nftmarketplaceapp.marketplace.domain.entities.NftCollectionTopEntity
import ru.technosopher.nftmarketplaceapp.marketplace.domain.entities.NftEntity

interface MarketplaceRepository {
    suspend fun getNft(nftAddress : String): Either<NetworkError, NftEntity>
    @Deprecated("DEVELOPER METHOD")
    suspend fun getCollections(): Either<NetworkError, List<NftCollectionEntity>>
    suspend fun getCollection(address: String): Either<NetworkError, NftCollectionEntity>
    suspend fun getCollectionItems(address: String): Either<NetworkError, List<NftEntity>>
    suspend fun getMostHypeCollections(page: String, pageSize: String): Either<NetworkError, NftCollectionTopEntity>
}