package family.com.familylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    int[] family_pics={R.drawable.daddy,R.drawable.mommy,R.drawable.me,R.drawable.ku2};
            String member_names[];
            String Relations[];
    familyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView)findViewById(R.id.list_view);
        member_names=getResources().getStringArray(R.array.member_names);
        Relations=getResources().getStringArray(R.array.Relations);
              int i=0;
        adapter=new familyAdapter(getApplicationContext(),R.layout.row_layout);
        listview.setAdapter(adapter);
                for(String members:member_names)
                {

                    FamilyData familyData=new FamilyData(family_pics[i],member_names[i],Relations[i]);
adapter.add(familyData);

                    i++;


                }
    }
}