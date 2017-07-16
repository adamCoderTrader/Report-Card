package com.example.adamoates.reportcard;

/**
 * Created by adamoates on 6/27/17.
 */

public class ReportCard {

    private String studentName;
    private String HTML5;
    private String CSS3;
    private String javascript;

    private int sum;
    private double percentage;

    public ReportCard(String studentName, String HTML5, String CSS3, String javaScript) {
        this.studentName = studentName;
        this.HTML5 = HTML5;
        this.CSS3 = CSS3;
        this.javascript = javaScript;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getHTML5() {
        return HTML5;
    }

    public void setHTML5(String HTML5) {
        this.HTML5 = HTML5;
    }

    public String getCSS3() {
        return CSS3;
    }

    public void setCSS3(String CSS3) {
        this.CSS3 = CSS3;
    }

    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
        this.javascript = javascript;
    }

    private String getGrade(int HTML5, int CSS3, int JavaScript, int TOTAL) {
        String grade;
        sum = HTML5 + CSS3 + JavaScript;
        percentage = sum / TOTAL;

        if (percentage >= 90.0) {
            grade = "A";
        } else if (percentage < 90.0 && percentage >= 80.0) {
            grade = "B";
        } else if (percentage < 80.0 && percentage >= 70.0) {
            grade = "C";
        } else if (percentage < 70.0 && percentage >= 60.0) {
            grade = "D";
        } else if (percentage < 60.0) {
            grade = "Fail";
        } else {
            grade = "error";
        }

        return grade;
    }

}
