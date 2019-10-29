package edu.washington.simplefragmentsdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

enum class FragmentType { RED, GREEN }

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun updateFragments(v: View) {
        when (radio_frag_actions.checkedRadioButtonId) {
            R.id.radiobtn_add -> addRandomFragment(selectedPosition())
            R.id.radiobtn_remove -> removeFragment(selectedPosition())
            R.id.radiobtn_replace_green -> replaceFragment(selectedPosition(), FragmentType.GREEN)
            R.id.radiobtn_replace_red -> replaceFragment(selectedPosition(), FragmentType.RED)
        }
    }

    private fun selectedPosition(): Int {
        when (radio_frag_position.checkedRadioButtonId) {
            R.id.radiobtn_top -> return R.id.frm_top_fragment_holder
            R.id.radiobtn_bottom -> return R.id.frm_bottom_fragment_holder
        }

        return -1
    }

    private fun addRandomFragment(id: Int) {
        val fragmentOption = FragmentType.values()[(0..1).random()]

        // TODO: Add a fragment that corresponds to fragmentOption at position "id"
    }

    private fun removeFragment(id: Int) {
        // TODO: Remove the fragment at position "id." This will require adding
        //  a tag to the fragment or keeping a reference to it
    }

    private fun replaceFragment(id: Int, fragType: FragmentType) {
        // TODO: Replace what is at position "id" with the appropriate fragment type
    }
}
