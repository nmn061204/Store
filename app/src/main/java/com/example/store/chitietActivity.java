package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.store.model.SanPham;

public class chitietActivity extends AppCompatActivity {
    ImageView ivHinhCT;
    TextView txttenspCT, txtSoluongCT, txtdongiaCT, txtTT;
    Intent intent=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet);
        addControls();
    }

    private void addControls() {
        ivHinhCT=findViewById(R.id.ivHinhCT);
        txttenspCT=findViewById(R.id.txttenspCT);
        txtSoluongCT=findViewById(R.id.txtSoluongCT);
        txtdongiaCT=findViewById(R.id.txtdongiaCT);
        txtTT=findViewById(R.id.txtTTCT);
        intent=getIntent();
        SanPham sanPham= (SanPham) intent.getSerializableExtra("sp");
        ivHinhCT.setImageResource(sanPham.getHinh());
        txttenspCT.setText(sanPham.getTensp());
        txtSoluongCT.setText(sanPham.getSoluong()+"");
        txtdongiaCT.setText(sanPham.getDonggia()+"");
        int sl=sanPham.getSoluong();
        double dg=sanPham.getDonggia();
        double tt=sl*dg;
        txtTT.setText(tt+"VND");
    }
}