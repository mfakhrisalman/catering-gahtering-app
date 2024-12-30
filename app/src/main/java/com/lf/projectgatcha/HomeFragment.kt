package com.lf.projectgatcha
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.lf.projectgatcha.adapter.SliderAdapter
import com.lf.projectgatcha.model.ModelProduk
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_profiles.*
import kotlinx.android.synthetic.main.item_produk.*

class HomeFragment : Fragment() {
//    Activity context

    lateinit var vpSlider : ViewPager
    lateinit var rvMenu : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //<-- Slider -->
        vpSlider = view.findViewById(R.id.vp_slider)

        val arraySlider = ArrayList<Int>()

        arraySlider.add(R.drawable.carousel1)
        arraySlider.add(R.drawable.carousel2)

        val sliderAdapter = SliderAdapter(arraySlider, activity)
        vpSlider.adapter = sliderAdapter

        //<-- RecyclerView Apparel -->
        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.HORIZONTAL
        rvMenu = view.findViewById(R.id.rv_baju)

        val adapterBaju = ProdukAdapter(ArrayBaju,activity)
        rvMenu.setHasFixedSize(true)
        rvMenu.layoutManager = lm
        rvMenu.adapter = adapterBaju

        return view
    }

    val ArrayBaju : ArrayList<ModelProduk>get(){

        val array= ArrayList<ModelProduk>()

        //1
        val produk1 = ModelProduk()
        produk1.namaProduk = "SIOMAY"
        produk1.hargaProduk = "Rp. 99.000"
        produk1.gambarProduk = R.drawable.r1

        //2
        val produk2 = ModelProduk()
        produk2.namaProduk = "ES COKLAT"
        produk2.hargaProduk = "Rp. 15.000"
        produk2.gambarProduk = R.drawable.r2

        //3
        val produk3 = ModelProduk()
        produk3.namaProduk = "RED VELVET"
        produk3.hargaProduk = "Rp. 20.000"
        produk3.gambarProduk = R.drawable.r3

        //4
        val produk4 = ModelProduk()
        produk4.namaProduk = "BATAGOR"
        produk4.hargaProduk = "Rp. 20.000"
        produk4.gambarProduk = R.drawable.r4

        //5
        val produk5 = ModelProduk()
        produk5.namaProduk = "NASI TUMPENG"
        produk5.hargaProduk = "Rp. 500.000"
        produk5.gambarProduk = R.drawable.r5

        //6
        val produk6 = ModelProduk()
        produk6.namaProduk = "BLACK FOREST"
        produk6.hargaProduk = "Rp. 149.000"
        produk6.gambarProduk = R.drawable.r6

        //7
        val produk7 = ModelProduk()
        produk7.namaProduk = "BUAH SEGAR"
        produk7.hargaProduk = "Rp. 49.000"
        produk7.gambarProduk = R.drawable.r7

        //8
        val produk8 = ModelProduk()
        produk8.namaProduk = "NASI BENTO"
        produk8.hargaProduk = "Rp. 59.000"
        produk8.gambarProduk = R.drawable.r8

        //9
        val produk9 = ModelProduk()
        produk9.namaProduk = "SALAD"
        produk9.hargaProduk = "Rp. 59.000"
        produk9.gambarProduk = R.drawable.r9

        //10
        val produk10 = ModelProduk()
        produk10.namaProduk = "SUP SAYUR"
        produk10.hargaProduk = "Rp. 39.000"
        produk10.gambarProduk = R.drawable.r10

        //11
        val produk11 = ModelProduk()
        produk11.namaProduk = "AMERICANO"
        produk11.hargaProduk = "Rp. 19.000"
        produk11.gambarProduk = R.drawable.r11

        //12
        val produk12 = ModelProduk()
        produk12.namaProduk = "SALAD"
        produk12.hargaProduk = "Rp. 39.000"
        produk12.gambarProduk = R.drawable.r12


        array.add(produk1)
        array.add(produk2)
        array.add(produk3)
        array.add(produk4)
        array.add(produk5)
        array.add(produk6)
        array.add(produk7)
        array.add(produk8)
        array.add(produk9)
        array.add(produk10)
        array.add(produk11)
        array.add(produk12)

        return array
    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        img_produk.setOnClickListener {
//            val intent = Intent(context, LoginActivity::class.java)
//            startActivity(intent)
//        }
//    }
override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    prasmanan.setOnClickListener {
        val intent = Intent(context, RecyclerActivity::class.java)
        startActivity(intent)
    }
}

}