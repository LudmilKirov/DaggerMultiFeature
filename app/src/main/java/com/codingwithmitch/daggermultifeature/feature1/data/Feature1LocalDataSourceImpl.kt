package com.codingwithmitch.daggermultifeature.feature1.data

import com.codingwithmitch.daggermultifeature.feature1.di.Feature1Scope
import javax.inject.Inject

@Feature1Scope
class Feature1LocalDataSourceImpl
@Inject
constructor(): Feature1LocalDataSource{

    override suspend fun getFeature1MainString(): String {
        return "Feature1MainFragment"
    }

    override suspend fun getFeature1NextString(): String {
        return "Feature1NextFragment"
    }


}