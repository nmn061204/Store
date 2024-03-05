package com.example.store.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.store.Adapter.SanPhamAdapter;
import com.example.store.R;
import com.example.store.chitietActivity;
import com.example.store.model.SanPham;

public class DailyFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DailyFragment() {
        // Required empty public constructor
    }

    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }
    ListView lvSanPham;
    SanPhamAdapter sanPhamAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        addControls(view);
        loadData();
        addEvents();
        return view;
    }

    private void addEvents() {
        lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SanPham sp=sanPhamAdapter.getItem(position);
                Intent intent = new Intent(requireContext(), chitietActivity.class);
                intent.putExtra("sp",sp);
                startActivity(intent);
            }
        });
    }

    private void loadData() {
        sanPhamAdapter.add(new SanPham(R.drawable.anh1,"dangosister",10,300.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh2,"Another TWEE",20,520.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh3,"Wonderwonder",30,530.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh4,"Couple",40,900.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh5,"byclothes",50,102.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh6,"girtbiuty",20,450.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh7,"ccomeng",80,100.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh8,"thegirl",80,200.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh9,"Hey lady",80,700.000));
    }

    private void addControls(View view) {
        lvSanPham = view.findViewById(R.id.lvSanPham);
        sanPhamAdapter=new SanPhamAdapter(getActivity(), R.layout.items);
        lvSanPham.setAdapter(sanPhamAdapter);
    }
}