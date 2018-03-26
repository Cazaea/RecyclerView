package com.cazaea.recycler.sample.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.cazaea.recycler.CommonViewHolder;
import com.cazaea.recycler.RecyclerViewCommonAdapter;
import com.cazaea.recycler.sample.R;
import com.cazaea.recycler.sample.data.HotMoviesBean;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;



/**
 * Created  on 16-6-6.
 * <p/>
 * 正在上映电影 - 数据适配器
 */
public class HotMoviesAdapter extends RecyclerViewCommonAdapter<HotMoviesBean.SubjectsBean> {

    public HotMoviesAdapter(List<HotMoviesBean.SubjectsBean> list, Context context) {
        super(context, list, R.layout.item_hot_movies);
    }

    public void update(List<HotMoviesBean.SubjectsBean> list) {
        addList((ArrayList<HotMoviesBean.SubjectsBean>) list);
    }

    @Override
    public void onListBindViewHolder(CommonViewHolder holder, int position) {
        final HotMoviesBean.SubjectsBean entity = mList.get(position);

        Picasso.with(mContext)
                .load(mList.get(position).getImages().getLarge())
                .placeholder(android.R.color.white)
                .into((ImageView) holder.getView(R.id.photo));

        holder.setText(R.id.tv_movie_name, entity.getTitle());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mContext.startActivity(PlayerActivity.getCallingIntent(mContext, entity.getId()));
//            }
//        });

    }

}
