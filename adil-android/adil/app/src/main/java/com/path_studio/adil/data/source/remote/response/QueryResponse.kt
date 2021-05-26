package com.path_studio.adil.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.google.gson.annotations.SerializedName

@Parcelize
data class QueryResponse(

	@field:SerializedName("_shards")
	val shards: Shards,

	@field:SerializedName("hits")
	val hits: Hits,

	@field:SerializedName("took")
	val took: Int,

	@field:SerializedName("timed_out")
	val timedOut: Boolean
) : Parcelable

@Parcelize
data class Hits(

	@field:SerializedName("hits")
	val hits: List<QueryHitItem>? = null,

	@field:SerializedName("total")
	val total: Total
) : Parcelable

@Parcelize
data class Shards(

	@field:SerializedName("total")
	val total: Int,

	@field:SerializedName("failed")
	val failed: Int,

	@field:SerializedName("successful")
	val successful: Int,

	@field:SerializedName("skipped")
	val skipped: Int
) : Parcelable

@Parcelize
data class Total(

	@field:SerializedName("value")
	val value: Int,

	@field:SerializedName("relation")
	val relation: String
) : Parcelable
