package com.example.adamoates.reportcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by adamoates on 7/16/17.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(MainActivity context, List<ReportCard> grades) {
        super(context, 0, grades);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ReportCard grades = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_grades, parent, false);
        }

        TextView studentNameTextview = (TextView) convertView.findViewById(R.id.text_student_name);
        studentNameTextview.setText(grades.getStudentName());

        TextView html5Textview = (TextView) convertView.findViewById(R.id.textView_html5);
        html5Textview.setText(grades.getHTML5());

        TextView css3Textview = (TextView) convertView.findViewById(R.id.textView_css3);
        css3Textview.setText(grades.getCSS3());

        TextView javascriptTextview = (TextView) convertView.findViewById(R.id.textView_javascript);
        javascriptTextview.setText(grades.getJavascript());

        return convertView;
    }
}
