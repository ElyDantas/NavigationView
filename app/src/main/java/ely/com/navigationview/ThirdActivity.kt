package ely.com.navigationview

import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        onCreateDrawer("ThirdActivity")

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Third Activity", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
