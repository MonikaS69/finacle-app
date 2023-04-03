import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thebestappintheworld.R
import com.example.thebestappintheworld.adapter.RecordAdapter
import com.example.thebestappintheworld.model.RecordDayModel

class RecordDayAdapter(var ds:List<RecordDayModel>):
    RecyclerView.Adapter<RecordDayAdapter.RecordDayViewHolder>(){

    class RecordDayViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val recordDate: TextView = itemView.findViewById(R.id.recordDate)
        val recordBalance: TextView = itemView.findViewById(R.id.recordBalance)
        val recordTotalMoney: TextView = itemView.findViewById(R.id.recordTotalMoney)
        val recordList: RecyclerView = itemView.findViewById(R.id.recordRecycleView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordDayViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.record_day_item, parent, false)
        return RecordDayViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecordDayViewHolder, position: Int) {
        holder.recordDate.text = ds[position].recordDate
        holder.recordBalance.text = ds[position].recordBalance.toString()
        holder.recordTotalMoney.text = ds[position].recordTotalMoney.toString()
        holder.recordList.layoutManager = LinearLayoutManager(holder.itemView.context)
        holder.recordList.adapter = RecordAdapter(ds[position].recordList)
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}
