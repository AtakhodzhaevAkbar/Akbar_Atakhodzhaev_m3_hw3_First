package com.example.akbar_atakhodzhaev_m3_hw3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvContact;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tvContact = itemView.findViewById(R.id.tv_contact);
    }
    public void onBind(String contact){
        tvContact.setText(contact);
    }
}
