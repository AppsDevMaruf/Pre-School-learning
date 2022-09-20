package com.marufalam.preschoollearning.fragments.alphabet;

import com.marufalam.preschoollearning.R;
import com.marufalam.preschoollearning.fragments.week.WeekModel;

import java.util.ArrayList;
import java.util.List;

public class AlphabetModel {
    int alphL,alphW,alphObject,alphSponudL,AlphSponudW;

    public AlphabetModel() {
    }

    public AlphabetModel(int alphL, int alphW, int alphObject, int alphSponudL, int alphSponudW) {
        this.alphL = alphL;
        this.alphW = alphW;
        this.alphObject = alphObject;
        this.alphSponudL = alphSponudL;
        AlphSponudW = alphSponudW;
    }

    public int getAlphL() {
        return alphL;
    }

    public void setAlphL(int alphL) {
        this.alphL = alphL;
    }

    public int getAlphW() {
        return alphW;
    }

    public void setAlphW(int alphW) {
        this.alphW = alphW;
    }

    public int getAlphObject() {
        return alphObject;
    }

    public void setAlphObject(int alphObject) {
        this.alphObject = alphObject;
    }

    public int getAlphSponudL() {
        return alphSponudL;
    }

    public void setAlphSponudL(int alphSponudL) {
        this.alphSponudL = alphSponudL;
    }

    public int getAlphSponudW() {
        return AlphSponudW;
    }

    public void setAlphSponudW(int alphSponudW) {
        AlphSponudW = alphSponudW;
    }
    public static List<AlphabetModel> getAlphabetItems(){
        final ArrayList<AlphabetModel> items = new ArrayList<>();
        items.add(new AlphabetModel(R.drawable.a,R.drawable.apple_t,R.drawable.apple,R.raw.a,R.raw.a_apple));
        items.add(new AlphabetModel(R.drawable.b,R.drawable.boy_t,R.drawable.boy,R.raw.b,R.raw.b_boy));
        items.add(new AlphabetModel(R.drawable.c,R.drawable.cat_t,R.drawable.cat,R.raw.c,R.raw.c_cat));
        items.add(new AlphabetModel(R.drawable.d,R.drawable.duck_t,R.drawable.duck,R.raw.d,R.raw.d_duck));
        items.add(new AlphabetModel(R.drawable.e,R.drawable.egg_t,R.drawable.egg,R.raw.e,R.raw.e_egg));
        items.add(new AlphabetModel(R.drawable.f,R.drawable.fish_t,R.drawable.fish,R.raw.f,R.raw.f_fish));
        items.add(new AlphabetModel(R.drawable.g,R.drawable.girl_t,R.drawable.girl,R.raw.g,R.raw.g_girl));
        items.add(new AlphabetModel(R.drawable.h,R.drawable.hat_t,R.drawable.hat,R.raw.h,R.raw.h_hat));
        items.add(new AlphabetModel(R.drawable.i,R.drawable.iguana_t,R.drawable.iguana,R.raw.i,R.raw.i_iguana));
        items.add(new AlphabetModel(R.drawable.j,R.drawable.jam_t,R.drawable.jam,R.raw.j,R.raw.j_jam));
        items.add(new AlphabetModel(R.drawable.k,R.drawable.kite_t,R.drawable.kite,R.raw.k,R.raw.k_kite));
        items.add(new AlphabetModel(R.drawable.l,R.drawable.lion_t,R.drawable.lion,R.raw.l,R.raw.l_lion));
        items.add(new AlphabetModel(R.drawable.m,R.drawable.moon_t,R.drawable.moon,R.raw.m,R.raw.m_moon));
        items.add(new AlphabetModel(R.drawable.n,R.drawable.net_t,R.drawable.net,R.raw.n,R.raw.n_net));
        items.add(new AlphabetModel(R.drawable.o,R.drawable.octopus_t,R.drawable.octopus,R.raw.o,R.raw.o_octopus));
        items.add(new AlphabetModel(R.drawable.p,R.drawable.pizza_t,R.drawable.pizza,R.raw.p,R.raw.p_pizza));
        items.add(new AlphabetModel(R.drawable.q,R.drawable.queen_t,R.drawable.queen,R.raw.q,R.raw.q_queen));
        items.add(new AlphabetModel(R.drawable.r,R.drawable.rabbit_t,R.drawable.rabbit,R.raw.r,R.raw.r_rabbit));
        items.add(new AlphabetModel(R.drawable.s,R.drawable.sun_t,R.drawable.sun,R.raw.s,R.raw.s_sun));
        items.add(new AlphabetModel(R.drawable.t,R.drawable.table_t,R.drawable.table,R.raw.t,R.raw.t_table));
        items.add(new AlphabetModel(R.drawable.u,R.drawable.umbrella_t,R.drawable.umbrella,R.raw.u,R.raw.u_umbrella));
        items.add(new AlphabetModel(R.drawable.v,R.drawable.van_t,R.drawable.van,R.raw.v,R.raw.v_van));
        items.add(new AlphabetModel(R.drawable.w,R.drawable.window_t,R.drawable.window,R.raw.w,R.raw.w_window));
        items.add(new AlphabetModel(R.drawable.x,R.drawable.xylophone_t,R.drawable.xylophone,R.raw.x,R.raw.x_xylophone));
        items.add(new AlphabetModel(R.drawable.y,R.drawable.yogurt_t,R.drawable.yogurt,R.raw.y,R.raw.y_yogurt));
        items.add(new AlphabetModel(R.drawable.z,R.drawable.zebra_t,R.drawable.zebra,R.raw.z,R.raw.z_zebra));

        return items;
    }
}
