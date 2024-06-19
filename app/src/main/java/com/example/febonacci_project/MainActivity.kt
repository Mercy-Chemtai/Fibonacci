package com.example.febonacci_project

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.febonacci_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val list = fibonacciSequence(100)
        binding.rvNumbers.layoutManager = GridLayoutManager(this,1)
        val FibonacciProject= FibonacciProject(list)
        binding.rvNumbers.adapter = FibonacciProject

}
fun fibonacciSequence(num:Int):List<Int>{
    val list = mutableListOf(0,1)
    while (list.size < num){
        list.add(list[list.lastIndex] + list[list.lastIndex - 1])
    }
    return  list
}
}
