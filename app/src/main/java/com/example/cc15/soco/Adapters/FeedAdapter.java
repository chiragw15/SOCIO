package com.example.cc15.soco.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cc15.soco.DataModels.Post;
import com.example.cc15.soco.R;

import java.util.List;

/**
 * Created by chota_bheem on 1/10/16.
 */
public class FeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public FeedAdapter(List<Object> items) {
        this.items = items;
    }

    private static OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(View itemView, int position, int post_type);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public static class ViewHolderText extends RecyclerView.ViewHolder {


        private TextView label1, label2;

        public ViewHolderText(final View itemView) {
            super(itemView);
            this.label1 = (TextView) itemView.findViewById(R.id.text1);
            this.label2 = (TextView) itemView.findViewById(R.id.text2);
            // Setup the click listener
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Triggers click upwards to the adapter on click
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (listener != null && position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(itemView, position,1); // 1 means text post
                        }
                    }
                }
            });

        }

        public TextView getLabel1() {
            return label1;
        }

        public void setLabel1(TextView label1) {
            this.label1 = label1;
        }

        public TextView getLabel2() {
            return label2;
        }

        public void setLabel2(TextView label2) {
            this.label2 = label2;
        }
    }

    public static class ViewHolderImage extends RecyclerView.ViewHolder {

        private ImageView ivExample;

        public ViewHolderImage(final View itemView) {
            super(itemView);
            ivExample = (ImageView) itemView.findViewById(R.id.ivExample1);

            // Setup the click listener
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Triggers click upwards to the adapter on click
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (listener != null && position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(itemView, position, 0); // 0 means image post
                        }
                    }
                }
            });
        }

        public ImageView getImageView() {
            return ivExample;
        }

        public void setImageView(ImageView ivExample) {
            this.ivExample = ivExample;
        }
    }

    // The items to display in your RecyclerView
    private List<Object> items;
    private final int POST_TEXT = 0, POST_IMAGE = 1;

    //Passing the click - listener to the constructor





    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public int getItemViewType(int position) {
        //More to come
        if (items.get(position) instanceof Post) {
            return POST_TEXT;
        } else if (items.get(position) instanceof String) {
            return POST_IMAGE;
        }
        return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        //More to come
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case POST_TEXT:
                View v1 = inflater.inflate(R.layout.view_holder_text, viewGroup, false);
                viewHolder = new ViewHolderText(v1);
                break;
            case POST_IMAGE:
                View v2 = inflater.inflate(R.layout.view_holder_img, viewGroup, false);
                viewHolder = new ViewHolderImage(v2);
                break;
            default:
                View v = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
                viewHolder = new ViewHolderText(v);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case POST_IMAGE:
                ViewHolderImage vh2 = (ViewHolderImage) viewHolder;
                configureViewHolder2(vh2);
                break;
            case POST_TEXT:
                ViewHolderText vh1 = (ViewHolderText) viewHolder;
                configureViewHolder1(vh1, position);
                break;
        }
    }

//    private void configureDefaultViewHolder(ViewHolderText vh, int position) {
//        vh.getLabel().setText((CharSequence) items.get(position));
//    }

    private void configureViewHolder1(ViewHolderText vh1, int position) {
        Post post = (Post) items.get(position);
        if (post != null) {
            vh1.getLabel1().setText("Name: " + post.getName());
//            vh1.getLabel2().setText("Hometown: " + user.hometown);
        }
    }

    private void configureViewHolder2(ViewHolderImage vh2) {
        vh2.getImageView().setImageResource(R.drawable.binder3);
    }



}