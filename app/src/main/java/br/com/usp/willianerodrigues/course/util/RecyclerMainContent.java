package br.com.usp.willianerodrigues.course.util;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import br.com.usp.willianerodrigues.course.CourseApplication;
import br.com.usp.willianerodrigues.course.R;
import br.com.usp.willianerodrigues.course.activities.ExerciceActivity;
import br.com.usp.willianerodrigues.course.model.ItemMenuMain;


public class RecyclerMainContent extends RecyclerView.Adapter<RecyclerMainContent.MainContentViewHolder> {

    private List<ItemMenuMain> menuMains;
    private LayoutInflater layoutInflater;
    private Context context;
    private CourseApplication application;

    public RecyclerMainContent(Context context) {
        this.context = context;
        application = (CourseApplication) context.getApplicationContext();
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        menuMains = application.getItemMenuMain();
    }

    @Override
    public MainContentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_main_content, parent, false);
        return new MainContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainContentViewHolder holder, int position) {
        ItemMenuMain menuMain = menuMains.get(position);

        holder.mTextView.setText(menuMain.getNome());
        holder.mTextView.setTextColor(context.getResources().getColor(R.color.md_blue_grey_500));
        holder.mViewClick.setBackgroundResource(menuMain.getDrawable_disable());
        holder.mImageView.setImageResource(menuMain.getDrawable_disable());
        if (menuMain.isLevel_open()) {
            holder.mTextView.setTextColor(context.getResources().getColor(R.color.md_purple_500));
            holder.mViewClick.setBackgroundResource(menuMain.getDrawable_enable());
            holder.mImageView.setImageResource(menuMain.getDrawable_enable());
        }
    }

    @Override
    public int getItemCount() {
        return menuMains.size();
    }

    class MainContentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private LinearLayout mViewClick;
        private ImageView mImageView;
        private TextView mTextView;

        MainContentViewHolder(View itemView) {
            super(itemView);

            mViewClick = (LinearLayout) itemView.findViewById(R.id.iten_content_main);
            mViewClick.setOnClickListener(this);

            mImageView = (ImageView) itemView.findViewById(R.id.ico_item_main);
            mTextView = (TextView) itemView.findViewById(R.id.item_name_main);
        }

        @Override
        public void onClick(View v) {
            if (getPosition() == 0) {
                Intent intent = new Intent(context, ExerciceActivity.class);
                context.startActivity(intent);
            }
        }
    }
}
