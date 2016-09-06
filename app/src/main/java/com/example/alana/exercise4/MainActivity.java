package com.example.alana.exercise4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String STUDENT = "student";
    private final static String CLASS = "class";
    private final static String ID = "id";
    private final static String SEX = "sex";
    private final static String TEL = "tel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] student = {"学生1","学生2","学生3"};
        String[] sClass = {"class1","class2","class3"};
        String[] sId = {"001","002","003"};
        String[] sSex = {"男","女","男"};
        String[] sTel = {"123123123","456456456","789789789"};

        List<Map<String,Object>> items = new ArrayList<Map<String, Object>>();

        for(int i=0;i<student.length;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put(STUDENT,student[i]);
            item.put(CLASS,sClass[i]);
            item.put(ID,sId[i]);
            item.put(SEX,sSex[i]);
            item.put(TEL,sTel[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,items,R.layout.item,new
        String[]{STUDENT,CLASS,ID,SEX,TEL},new int[]{R.id.txtStudent,R.id.txtClass,
        R.id.txtId,R.id.txtSex,R.id.txtTel});
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
