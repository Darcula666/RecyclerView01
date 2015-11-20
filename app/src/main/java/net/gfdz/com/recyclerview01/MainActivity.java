package net.gfdz.com.recyclerview01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        rv=new RecyclerView(MainActivity.this);
        rv.setLayoutManager(new LinearLayoutManager(this));
       // setContentView(R.layout.activity_main);
        setContentView(rv);
        rv.setAdapter(new RecyclerView.Adapter() {
            class ViewHolder extends RecyclerView.ViewHolder{
              private TextView tv;
                public ViewHolder(View itemView) {
                    super(itemView);
                    tv= (TextView) itemView;
                }

                public TextView getTv() {
                    return tv;
                }
            }
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder(new TextView(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                ViewHolder vh= (ViewHolder) holder;
                vh.getTv().setText(data[position]);
            }

            @Override
            public int getItemCount() {
                return data.length;

            }
            private String[] data=new String[]{"Hello","jikexueyuan","ime"};
        });

    }


}
