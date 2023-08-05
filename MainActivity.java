package com.android.agecalculate;

import android.app.DatePickerDialog: import android.graphics.Color;

import android, graphics.drawable.ColorDrawable; import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.DatePicker;

import android.widget.TextView; import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.joda.time.Period;

import org.joda.time.PeriodType;

import java.text.ParseException;

import java.text.SimpleDateFormat; import java.util.Calendar;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

Button btn_birth, btn_today, btn_calculate; TextViewtvResult;

DatePickerDialog.OnDateSetListener dateSetListener1, dateSetListener2

@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);

btn_birth = findViewById(R.id.bt birth); btn_today = findViewById(R.id.bt_today);

btn_calculate findViewById(R.id.btn_calculate);

tvResult = findViewById(R.id.tv_result);

Calendar calendar- Calendar.getInstance();

int year = calendar.get(Calendar. YEAR);

int month = calendar.get(Calendar.MONTH);

int day-calendar.get(Calendar DAY OF MONTH);

SimpleDateFormats impleDateFormat = new

SimpleDateFormat("dd/MM/yyyy");

String date = simpleDateFormat.format(Calendar.getInstance().getTime()); btn_today.setText(date);

btn_birth.setOnClickListener(new View.OnClickListener() { @Override

public void onClick(View view) {

DatePickerDialogdatePickerDialog = new DatePickerDialog(MainActivity.this, android.R.style. Theme_Holo_Light_Dialog MinWidth, dateSetListener 1, year, month, day

):

datePickerDialog.getWindow().setBackgroundDrawable(new

ColorDrawable(Color.TRANSPARENT));

datePickerDialog.show();

dateSetListener1 = new DatePickerDialog.OnDateSetListener() {

@Override public void onDateSet(DatePicker view, int year, int month, int day) { month month + 1;

String date day+"/"+month+"/"+ year.

btn_birth.setText(date);

btn_today.setOnClickListener(new View.OnClickListener() {

@Override

public void onClick(View view) {

Date PickerDialogdatePickerDialog = new DatePickerDialog(MainActivity this, android R. style Theme Holo Light Dialog MinWidth, dateSetListener?, year,month,day);
datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

datePickerDialog.show();

dateSetListener2 new DatePickerDialog OnDateSetListener() { @Override public void onDateSet(DatePicker view, int year, int month, int

month month + 1;

String date = day +"/"+month+"/"+ year,

btn_today.setText(date

);

btn_ calculate setOnClickListener(new View.OnClickListener() {

@Override public void onClick(View view) {

Strings Date = btn_birth.getText().toString();

String eDate= btn_today.getText().toString(), SimpleDateFormat simpleDateFormat = new

SimpleDateFormat("dd/MM/yyyy");

try {

Date datel-simpleDateFormat1.parse(sDate);

Date date2 = simpleDateFormat.parse(eDate);

long startdate date1.getTime();

long endDate date2.getTime();

if (startdate endDate)

org.joda.time Period period- new Period(startdate, endDate,

Period Type year MouthDay()); int years period, get Years();

int months period getMonths(); int days period getDays();

tvResult.setText(years + " Years |" + months+ "Months "+days+ "Days");

} else {

Toast.makeText(MainActivity.this, "BirthDate should not be larger than today's date!", Toast.LENGTH_SHORT).show():
}
} catch (ParseException e) {

e.printStackTrace();

build.gradle

plugins {

id 'com.android.application'

}

android {

compileSdk 32

defaultConfig {

applicationId "com.android.agecalculate"

minSdk 22

targetSdk 32

versionCode 1 versionName "1.0"

testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"

buildTypes {

release { minify Enabled false

proguardFilesgetDefaultProguardFile('proguard-android-optimize.txt').

'proguard-rules.pro'

}
}
compileOptions {

sourceCompatibility JavaVersion. VERSION_1_8 targetCompatibility JavaVersion. VERSION_1_8
}
buildFeatures {
viewBinding true
}
}
dependencies {

implementation 'androidx.appcompat:appcompat:1.5.0" implementation 'com.google.android.material:material: 1.6.1' implementation 'androidx.constraintlayout:constraintlayout: 2.1.4' implementation 'androidx.navigation:navigation-fragment:2.3.5' implementation 'androidx.navigation:navigation-ui:2.3.5' testImplementation 'junit:junit:4.13.2'

android TestImplementation 'androidx.test.ext:junit:1.1.3' android TestImplementation 'androidx.test.espresso:espresso-core: 3.4.0" implementation 'joda-time:joda-time:2.9.1'
 }
