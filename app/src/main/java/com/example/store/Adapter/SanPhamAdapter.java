package com.example.store.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.store.Activity.DailyFragment;
import com.example.store.R;
import com.example.store.model.SanPham;

public class SanPhamAdapter extends ArrayAdapter<SanPham> {
    Context context;
    int resource;

    public SanPhamAdapter(Context context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }


    public View getView(int position, @Nullable View  convertView,@NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View customView = layoutInflater.inflate(this.resource, null);
        ImageView ivHinh=customView.findViewById(R.id.ivHinh);
        TextView txtTensp=customView.findViewById(R.id.txtTenSP);
        TextView txtSoLuong=customView.findViewById(R.id.SoLuong);
        TextView txtDonGia=customView.findViewById(R.id.txtDonGia);
        SanPham sp=getItem(position);
        ivHinh.setImageResource(sp.getHinh());
        txtTensp.setText(sp.getTensp());
        txtSoLuong.setText(sp.getSoluong()+"");
        txtDonGia.setText(sp.getDonggia()+"");
        return customView;
    }
}
