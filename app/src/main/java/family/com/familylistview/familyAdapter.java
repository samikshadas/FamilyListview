package family.com.familylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apple on 12/02/16.
 */
public class familyAdapter extends ArrayAdapter {
    List list = new ArrayList();

    public familyAdapter(Context context, int resource) {
        super(context, resource);
    }
    static class dataHandler
    {
        ImageView pics;
    TextView members;
    TextView relations;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();

    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        dataHandler handler;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout, parent, false);
            handler = new dataHandler();
            handler.pics = (ImageView) row.findViewById(R.id.imageView);
            handler.members = (TextView) row.findViewById(R.id.textView);
            handler.relations = (TextView) row.findViewById(R.id.textView2);
            row.setTag(handler);
        }
        else {
            handler = (dataHandler) row.getTag();
        }
        FamilyData data;
        data=(FamilyData)this.getItem(position);
        handler.pics.setImageResource(data.getFamily_pics());
        handler.members.setText(data.getMember_names());
        handler.relations.setText(data.getRelations());
            return super.getView(position, convertView, parent);
        }
    }
