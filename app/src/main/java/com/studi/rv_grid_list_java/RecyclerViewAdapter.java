package com.studi.rv_grid_list_java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import com.bumptech.glide.Glide;
import com.studi.rv_grid_list_java.databinding.GridItemBinding;
import com.studi.rv_grid_list_java.databinding.RowItemBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{
    private final Context context;
    private boolean isGrid = false;
    private final List<Presiden> list; // penampung data dari class Presiden

    public RecyclerViewAdapter(Context context, List<Presiden> list) {
        this.context = context;
        this.list = list;
    }

    // status grid dari Activity
    public void setViewType(boolean isGrid) {
        this.isGrid = isGrid;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (isGrid) {
            // Inflate layout untuk Grid
            GridItemBinding gridBinding = GridItemBinding.inflate(
                    LayoutInflater.from(parent.getContext()), parent, false);
            return new RecyclerViewHolder(gridBinding);
        } else {
            // Inflate layout untuk Row/List
            RowItemBinding rowBinding = RowItemBinding.inflate(
                    LayoutInflater.from(parent.getContext()), parent, false);
            return new RecyclerViewHolder(rowBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecyclerViewHolder holder, int position) {
        Presiden presiden = list.get(position); // Simpan dalam variabel agar rapi

        // Gunakan variabel yang ada di holder, bukan .binding
        holder.tvName.setText(presiden.getName());
        holder.tvDesc.setText(presiden.getRemarks());

        Glide.with(context)
                .load(list.get(position).getPhoto())
                .into(holder.imgPhoto);

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(context, list.get(position).getName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;

        // Ubah parameter menjadi ViewBinding (induk dari semua class Binding) atau cukup View
        public RecyclerViewHolder(@NonNull ViewBinding binding) {
            super(binding.getRoot());

            // Kita perlu mencari ID secara manual jika class binding-nya berbeda
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
        }

        // Atau jika Anda ingin tetap menggunakan Binding secara spesifik:
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
        }
    }
}
