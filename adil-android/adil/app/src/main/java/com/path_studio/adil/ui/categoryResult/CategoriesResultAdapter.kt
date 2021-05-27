package com.path_studio.adil.ui.categoryResult

import android.annotation.SuppressLint
import android.app.ActionBar
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.marginRight
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.R
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.databinding.ItemRowSearchResultBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.detailUU.information.InformationFragment
import com.path_studio.adil.utils.Utils
import java.util.ArrayList

class CategoriesResultAdapter (val activity: CategoryResultActivity) :
    RecyclerView.Adapter<CategoriesResultAdapter.ResultViewHolder>() {
    private var listLegislation = ArrayList<LegislationResponse>()

    fun setLegislation(legislation: List<LegislationResponse>?) {
        if (legislation == null) return
        this.listLegislation.clear()
        this.listLegislation.addAll(legislation)
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val itemsRowSearchResultBinding = ItemRowSearchResultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResultViewHolder(itemsRowSearchResultBinding)
    }

    @ExperimentalStdlibApi
    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        val category = listLegislation[position]
        holder.bind(category)
    }

    override fun getItemCount(): Int = listLegislation.size

    inner class ResultViewHolder(private val binding: ItemRowSearchResultBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
        @ExperimentalStdlibApi
        fun bind(legislation: LegislationResponse) {
            with(binding) {
                detailNomor.text = "${legislation.jenisPeraturan} ${legislation.nomorPeraturan} ${legislation.tahunPeraturan}"
                detailTentang.text = legislation.tentang
                detailDitetapkanBerlaku.text = "Ditetapkan: ${Utils.changeStringToDateFormat(legislation.tglDitetapkan.toString() )} " +
                        "| Diundangkan: ${Utils.changeStringToDateFormat(legislation.tglDiundangkan.toString() )}"

                legislationTags.addView(setButton(legislation.tahunPeraturan.toString()))
                for (category in legislation.category!!){
                    legislationTags.addView(setButton(category!!))
                }

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailUUActivity::class.java)
                    intent.putExtra(DetailUUActivity.EXTRA_LEGISLATION_ID, legislation.id)
                    itemView.context.startActivity(intent)
                }

            }
        }

        @SuppressLint("UseCompatLoadingForDrawables")
        private fun setButton(value: String): Button{
            //set the properties for button
            val btnTag = Button(activity)

            //set margin and create button
            val params: ActionBar.LayoutParams = ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(0, 0, 30, 0)

            btnTag.layoutParams = ActionBar.LayoutParams(params)
            btnTag.text = value
            btnTag.textSize = 12f
            btnTag.background = activity.getDrawable(R.drawable.secondary_rounded_button)

            //set padding
            btnTag.setPadding(5, 0, 5, 0)
            return btnTag
        }
    }
}