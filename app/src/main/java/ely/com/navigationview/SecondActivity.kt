package ely.com.navigationview

import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        onCreateDrawer("SecondActivity")

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Second Activity", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
