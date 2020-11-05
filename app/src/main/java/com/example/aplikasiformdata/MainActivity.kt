package com.example.aplikasiformdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun simpan(view: View) {
        // Validasi untuk form tidak kosong
        if (et_nama.text.toString() == ""
            || et_nik.text.toString() == ""
            || et_usia.text.toString() == ""
            || et_alamat.text.toString() == ""
            || et_email.text.toString() == ""
            || et_sekolah.text.toString() == ""
            || et_kompetensi.text.toString() == ""
        ){
            // Tampilkan pesan jika ada form blm diisi
            var myToast = Toast.makeText(this, "Form masih ada yang kosong, Harap periksa kembali!", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.show()
        } else {
            // inisialisasi semua form
            var nama  : String
            var nik : Int
            var usia : Int
            var jk : String = ""
            var alamat : String
            var email : String
            var sekolah : String
            var kompetensi : String

            //mengambil data dari form
            nama = et_nama.text.toString()
            nik = et_nik.text.toString().toInt()
            usia = et_usia.text.toString().toInt()

            if (et_jk_l.isChecked) {
                jk = "Laki-laki"
            }
            if (et_jk_p.isChecked){
                jk = "Perempuan"
            }

            alamat = et_alamat.text.toString()
            email = et_email.text.toString()
            sekolah = et_sekolah.text.toString()
            kompetensi = et_kompetensi.text.toString()



            // ubah tampilan
            form_data.visibility = View.INVISIBLE
            tampil_data.visibility = View.VISIBLE

            // menampilkan data ke text view
            tv_data_nama2.text = nama
            tv_data_nik2.text = nik.toString()
            tv_data_usia2.text = usia.toString()
            tv_data_jk2.text = jk
            tv_data_alamat2.text = alamat
            tv_data_email2.text = email
            tv_data_sekolah2.text = sekolah
            tv_data_kompetensi2.text = kompetensi
        }
    }

    fun kembali(view: View){
        // Ubah tampilan
        tampil_data.visibility = View.INVISIBLE
        form_data.visibility = View.VISIBLE

        // menghapus value dari form sebelumnya
        et_nama.text.clear()
        et_nik.text.clear()
        et_usia.text.clear()
        et_alamat.text.clear()
        et_email.text.clear()
        et_sekolah.text.clear()
        et_kompetensi.text.clear()
    }
}