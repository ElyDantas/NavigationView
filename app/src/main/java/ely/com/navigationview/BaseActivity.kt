package ely.com.navigationview

import android.os.Handler
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import ely.com.navigationview.R.id.drawer_layout
import ely.com.navigationview.R.id.nav_view
import org.jetbrains.anko.startActivity

open class BaseActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerToggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var toolbar: Toolbar
    private lateinit var activityType: String

    fun onCreateDrawer(activityType: String) {
        this.activityType = activityType

        // Init views
        drawerLayout = findViewById(drawer_layout)
        navigationView = findViewById(nav_view)
        toolbar = findViewById(R.id.toolbar)
        drawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        // Init Listeners
        drawerLayout.addDrawerListener(drawerToggle)
        navigationView.setNavigationItemSelectedListener(this)
        drawerToggle.syncState()

    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)
        when (item.itemId) {
            R.id.nav_main -> {
                Handler().postDelayed({
                    Runnable {

                        if (activityType != "NavigationActivity") {
                            startActivity<NavigationActivity>()
                            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                            finish()
                        }

                    }.run()
                }, 300)
            }
            R.id.nav_activity_1 -> {
                Handler().postDelayed({
                    Runnable {

                        if (activityType != "Activity1") {
                            startActivity<NavigationActivity>()
                            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                            finish()
                        }

                    }.run()
                }, 300)
            }
        }
        return false
    }
}