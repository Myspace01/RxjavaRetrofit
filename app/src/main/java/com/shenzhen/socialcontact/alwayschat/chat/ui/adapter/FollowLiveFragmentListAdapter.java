package com.shenzhen.socialcontact.alwayschat.chat.ui.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

import com.shenzhen.socialcontact.alwayschat.R;
import com.shenzhen.socialcontact.alwayschat.chat.bean.PlayBean;
import com.shenzhen.socialcontact.alwayschat.chat.ui.glide.GlideCircleTransform;
import com.shenzhen.socialcontact.alwayschat.chat.ui.glide.GlideRoundTransform;

import java.util.List;

/**
 * Created by Lizhuo on 2017/4/28.
 */

public class FollowLiveFragmentListAdapter extends RecyclerView.Adapter<FollowLiveFragmentListAdapter.MyViewHolder>
{
    private LayoutInflater layoutInflater;
    private List<PlayBean> playBeanList;
    private Context context;

    boolean isFirstOnly=true;
    private int mLastPosition=-1;

    public FollowLiveFragmentListAdapter(Context context)
    {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    public void setData(List<PlayBean> playBeanList)
    {
        this.playBeanList = playBeanList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = layoutInflater.inflate(R.layout.listitem_live, null);
        MyViewHolder viewHolder = new MyViewHolder(context,view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        PlayBean playBean=playBeanList.get(position);
        holder.setImageUrl(R.id.thumnails,playBean.getThumb(),new GlideRoundTransform(context,5));
        holder.setText(R.id.title,playBean.getTitle());
        holder.setText(R.id.tv_viewnum,playBean.getView());
        holder.setText(R.id.nickName,playBean.getNick());
        holder.setImageUrl(R.id.ic_head,playBean.getAvatar(),new GlideCircleTransform(context));
        holder.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                

            }
        });
        int adapterPosition = holder.getAdapterPosition();
        if (!isFirstOnly || adapterPosition > mLastPosition) {
            initAnim(holder.itemView);
            mLastPosition = adapterPosition;
        } else {
            reset(holder.itemView);
        }

    }

    @Override
    public int getItemCount()
    {
        return playBeanList.size();
    }

    class MyViewHolder extends ViewHolder
    {

        public MyViewHolder(Context context, View itemView)
        {
            super(context, itemView);
        }
    }


    private void initAnim(View itemView) {
        ObjectAnimator alphaAnim=ObjectAnimator.ofFloat(itemView,"alpha",0f,1f);
        alphaAnim.setInterpolator(new LinearInterpolator());
        alphaAnim.setDuration(450);
        alphaAnim.start();

        ObjectAnimator scaleXAnim=ObjectAnimator.ofFloat(itemView,"scaleX",0.1f, 1f);
        scaleXAnim.setInterpolator(new LinearInterpolator());
        scaleXAnim.setDuration(450);
        scaleXAnim.start();

        ObjectAnimator scaleYAnim=ObjectAnimator.ofFloat(itemView,"scaleY",0.1f,1.0f);
        scaleYAnim.setInterpolator(new LinearInterpolator());
        scaleYAnim.setDuration(450);
        scaleYAnim.start();

        ObjectAnimator translationYAnim=ObjectAnimator.ofFloat(itemView,"translationY",itemView.getMeasuredHeight(), 0);
        translationYAnim.setInterpolator(new LinearInterpolator());
        translationYAnim.setDuration(450);
        translationYAnim.start();

    }
    
    private void reset(View v){
        ViewCompat.setAlpha(v, 1);
        ViewCompat.setScaleY(v, 1);
        ViewCompat.setScaleX(v, 1);
        ViewCompat.setTranslationY(v, 0);
        ViewCompat.setTranslationX(v, 0);
        ViewCompat.setRotation(v, 0);
        ViewCompat.setRotationY(v, 0);
        ViewCompat.setRotationX(v, 0);
        ViewCompat.setPivotY(v, v.getMeasuredHeight() / 2);
        ViewCompat.setPivotX(v, v.getMeasuredWidth() / 2);
        ViewCompat.animate(v).setInterpolator(null).setStartDelay(0);
    }
    
}
