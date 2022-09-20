package com.marufalam.preschoollearning.fragments.alphabet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.SoundInterface;

import java.util.List;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.AlphabetViewHolder> {
    private final List<AlphabetModel> alphabetModels;

    public AlphabetAdapter(List<AlphabetModel> alphabetModels) {
        this.alphabetModels = alphabetModels;
    }

    @NonNull
    @Override
    public AlphabetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.alphabet_item,parent,false);
        return new AlphabetViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AlphabetViewHolder holder, int position) {
        holder.alphLitterImg.setImageResource(alphabetModels.get(position).getAlphL());
        holder.alphWordImg.setImageResource(alphabetModels.get(position).getAlphW());
        holder.alphObjectImg.setImageResource(alphabetModels.get(position).getAlphObject());

        holder.alphLitterImg.setOnClickListener(view -> {
            SoundInterface.playSound(alphabetModels.get(position).getAlphSponudL(), view.getContext());
        });
        holder.alphWordImg.setOnClickListener(view -> {
            SoundInterface.playSound(alphabetModels.get(position).getAlphSponudW(), view.getContext());
        });
        holder.alphObjectImg.setOnClickListener(view -> {
            SoundInterface.playSound(alphabetModels.get(position).getAlphSponudW(), view.getContext());
        });

    }

    @Override
    public int getItemCount() {
        return alphabetModels.size();
    }

    class AlphabetViewHolder extends RecyclerView.ViewHolder {
        ImageView alphLitterImg,alphWordImg,alphObjectImg;
        public AlphabetViewHolder(@NonNull View itemView) {
            super(itemView);
            alphLitterImg = itemView.findViewById(R.id.alphabet);
            alphWordImg = itemView.findViewById(R.id.objectName);
            alphObjectImg = itemView.findViewById(R.id.objectImg);
        }

    }
}
