package ely.com.navigationview

import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        super.onCreateDrawer("FirstActivity")

        fab.setOnClickListener { view ->
            Snackbar.make(view, "First Activity", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
