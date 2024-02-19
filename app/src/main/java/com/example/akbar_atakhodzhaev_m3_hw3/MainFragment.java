package com.example.akbar_atakhodzhaev_m3_hw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;


public class MainFragment extends Fragment {
    private RecyclerView rvContacts;
    private final ArrayList<String> contactList=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loaddata();
        ContactAdapter contactAdapter=new ContactAdapter(contactList);
        rvContacts.setAdapter(contactAdapter);
    }
    private void initView(){
        rvContacts=requireActivity().findViewById(R.id.rv_contacts);
    }
    private void loaddata(){
        contactList.add("Бека");
        contactList.add("Аза");
        contactList.add("Ади");
        contactList.add("Нурдан");
        contactList.add("Доставка");
        contactList.add("Работа");
        contactList.add("Курсы");
        contactList.add("Данияр");
        contactList.add("Даниэль");
        contactList.add("Мама");
        contactList.add("Папа");
        contactList.add("Айселя");
        contactList.add("Нурислам");
    }
}