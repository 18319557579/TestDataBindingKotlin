package com.hsf.testdatabindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.hsf.testdatabindingkotlin.databinding.CustomDataBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: CustomDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.user = User()
        binding.mCount = 0

        binding.btnAdd.setOnClickListener {
            binding.mCount++
        }
    }
}