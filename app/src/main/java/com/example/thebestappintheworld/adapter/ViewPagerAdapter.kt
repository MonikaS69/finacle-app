import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.thebestappintheworld.fragment.*

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> DashBoardFragment()
            1 -> RecordFragment()
            2 -> StatisticFragment()
            3 -> SettingFragment()
            else -> throw IllegalArgumentException("Invalid position $position")
        }
    }
}
