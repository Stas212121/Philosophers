package com.example.Philosophers.Philosophers;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;


public class Fragmet_Add_Records extends Fragment {

    EditText name;
    ImageButton saveBtn, imageButtonHigh;
    Intent intent;

    EditText editTextNewCitata;
    TextView countletters;


    boolean opened;
    LinearLayout linearLayoutvieww, linearLayouttextarray;

    //DBHelper dbHelper;

////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_add_records, container, false);

//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////Стирает текст при нажатии для ввода////////
        editTextNewCitata = (EditText) view.findViewById(R.id.editTextNewCitata);
        countletters = (TextView) view.findViewById(R.id.countletters);

//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
        AssetManager am = getContext().getAssets();
        int tabTypefaceStyle = Typeface.BOLD;
        editTextNewCitata.setTypeface(Typeface.createFromAsset(
                am, "18341.ttf"), tabTypefaceStyle);
        editTextNewCitata.setTextSize(18); //значение присваивается в sp (px лучше не использовать)

        String uslovietext = getResources().getString(R.string.uslovietext);

        editTextNewCitata.setTextColor(Color.parseColor(uslovietext));

        countletters.setText("   0   символов");

//////////////////////////////////////////////////////////////////////////////////////////////////////
        editTextNewCitata.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                editTextNewCitata.setText("");
                editTextNewCitata.setTextColor(Color.parseColor("#e2e1e0"));
                editTextNewCitata.setTextSize(30);
            }
        });


        editTextNewCitata.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // Прописываем то, что надо выполнить после изменения текста
                if (editTextNewCitata.getText().length() > 34 && editTextNewCitata.getText().length() < 39) {
                    editTextNewCitata.setTextSize(25);
                }
                if (editTextNewCitata.getText().length() > 38 && editTextNewCitata.getText().length() < 45) {
                    editTextNewCitata.setTextSize(20);


                }
                countletters.setText("    " + editTextNewCitata.getText().length() + "  символов");

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
        });


///////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////
//        BottomNavigationView bottomNav_bottom = null;
//        bottomNav_bottom.setSelectedItemId(R.id.navigation_bottom_item_two);

        TextView textshowRecords = view.findViewById(R.id.textshowRecords);
        ShowAnimation.doAnimScale(textshowRecords, getContext(), R.anim.scale);

//////////////////////////////////////////////////////////////////////////////////////////////////////
        LinearLayout linearLayout;
        linearLayout = view.findViewById(R.id.LinearLayoutADDcitat);
        //int color = Integer.parseInt(String.valueOf(R.color.colorPrimaryone), 16)+0xFF000000;

        int myColor_one = ContextCompat.getColor(getContext(), R.color.colorPrimaryone);
        int myColor_two = ContextCompat.getColor(getContext(), R.color.colorPrimarytwo);


        ShowAnimation.ShowAnimColor(linearLayout, myColor_one, myColor_two, "backgroundColor", 0, 2000);


/////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButtonHigh = view.findViewById(R.id.imageButtonHigh);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textViewonetext;
        textViewonetext = view.findViewById(R.id.onetext);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textViewtwotext;
        textViewtwotext = view.findViewById(R.id.twotext);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textViewthreetext;
        textViewthreetext = view.findViewById(R.id.threetext);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textViewfourtext;
        textViewfourtext = view.findViewById(R.id.fourtext);
/////////////////////////////////////////////////////////////////////////////////////////////////////


        /////////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView textqq;
        textqq = view.findViewById(R.id.textqq);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        final EditText txtName;
        txtName = view.findViewById(R.id.editTextNewCitata);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        final ImageButton btnSave;
        btnSave = view.findViewById(R.id.btnSave);
/////////////////////////////////////////////////////////////////////////////////////////////////////


        linearLayouttextarray = view.findViewById(R.id.textarray);
/////////////////////////////////////////////////////////////////////////////////////////////////////

        linearLayoutvieww = view.findViewById(R.id.vieww);
        linearLayoutvieww.setVisibility(View.INVISIBLE);
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        view.findViewById(R.id.imageButtonHigh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!opened) {
                    linearLayoutvieww.setVisibility(View.VISIBLE);
                    TranslateAnimation animate = new TranslateAnimation(
                            0,
                            0,
                            linearLayoutvieww.getHeight(),
                            0);
                    animate.setDuration(500);
                    animate.setFillAfter(true);
                    linearLayoutvieww.startAnimation(animate);
                    imageButtonHigh.setImageResource(R.drawable.ic_close_black_24dp);
                    /////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////
                    textViewonetext.setVisibility(View.VISIBLE);
                    textViewtwotext.setVisibility(View.VISIBLE);
                    textViewthreetext.setVisibility(View.VISIBLE);
                    textViewfourtext.setVisibility(View.VISIBLE);

                    textqq.setVisibility(View.VISIBLE);
                    txtName.setVisibility(View.VISIBLE);
                    btnSave.setVisibility(View.VISIBLE);

/////////////////////////////////////////////////////////////////////////////////////////////////////
                    linearLayouttextarray.setVisibility(View.VISIBLE);
                    /////////////////////////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////////////////////////////////
                    ShowAnimation.doAnimScale(textViewonetext, getContext(), R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////////////////////////////////


                    ShowAnimation.doAnimScale(textViewtwotext, getContext(), R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////////////////////////////////


                    ShowAnimation.doAnimScale(textViewthreetext, getContext(), R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////////////////////////////////


                    ShowAnimation.doAnimScale(textViewfourtext, getContext(), R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
// ///////////////////////////////////////////////////////////////////////////////////////////////////
//                    ///////////////////////////////////////////////////BUTTON/////////////////////////////////////////////
                    ///////////////////////////////////////////////////BUTTON/////////////////////////////////////////////
                    imageButtonHigh.setVisibility(View.INVISIBLE);
                } else {

///////////////////////////////////////////////////////////////////////////////////////////////////////
//                    textViewonetext.setVisibility(View.INVISIBLE);
//                    textViewtwotext.setVisibility(View.INVISIBLE);
//                    textViewthreetext.setVisibility(View.INVISIBLE);
//                    textViewfourtext.setVisibility(View.INVISIBLE);
//
//                    textqq.setVisibility(View.INVISIBLE);
//                    txtName.setVisibility(View.INVISIBLE);
//                    btnSave.setVisibility(View.INVISIBLE);
///////////////////////////////////////////////////////////////////////////////////////////////////////
//                    linearLayouttextarray.setVisibility(View.INVISIBLE);
/////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////
//                    linearLayoutvieww.setVisibility(View.INVISIBLE);

//                    ShowAnimation.doAnimScale(textViewonetext,getContext(),R.anim.scale_info_double );
//
///////////////////////////////////////////////////////////////////////////////////////////////////////
//                    /////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//                    ShowAnimation.doAnimScale(textViewtwotext,getContext(),R.anim.scale_info_double );
///////////////////////////////////////////////////////////////////////////////////////////////////////
//                    /////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//                    ShowAnimation.doAnimScale(textViewthreetext,getContext(),R.anim.scale_info_double );
///////////////////////////////////////////////////////////////////////////////////////////////////////
//                    /////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//                    ShowAnimation.doAnimScale(textViewfourtext,getContext(),R.anim.scale_info_double );
///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//                    linearLayouttextarray.setVisibility(View.VISIBLE);
//
//
//
//
//                    TranslateAnimation animate = new TranslateAnimation(
//                            0,
//                            0,
//                            0,
//                            linearLayoutvieww.getHeight());
//                    animate.setDuration(500);
//                    animate.setFillAfter(true);
//                    linearLayoutvieww.startAnimation(animate);
//                    imageButtonHigh.setImageResource(R.drawable.ic_playlist_add_check_black_24dp);


                }
                opened = !opened;
            }
        });
//
//        btnAdd = (Button) view.findViewById(R.id.btnAddt);
//        btnAdd.setOnClickListener(this);
//
//        btnRead = (Button) view.findViewById(R.id.btnRead);
//        btnRead.setOnClickListener(this);
//
//
//
//        etCitaty = (EditText) view.findViewById(R.id.etCitaty);
//
//
//        textViewt = (TextView) view.findViewById(R.id.textViewt);
//
//
//        // создаем объект для создания и управления версиями БД
//        dbHelper = new DBHelper(getContext());


        name = (EditText) view.findViewById(R.id.editTextNewCitata);
        saveBtn = (ImageButton) view.findViewById(R.id.btnSave);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {


                String uslovie = getResources().getString(R.string.uslovie);


                if (name.getText().toString().compareTo(uslovie) != 0 && name.getText().toString().length() != 0) {
                    String username = name.getText().toString() + "\n";

                    DbHandler dbHandler = new DbHandler(getContext());

                    dbHandler.insertUserDetails(username);

                    intent = new Intent(getContext(), Details_Show_Records_Activity.class);

                    startActivity(intent);
                    /////////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////////////////
                    Toast toast = Toast.makeText(getContext(), String.format(" Сохранена цитата : %s ", username), Toast.LENGTH_SHORT);

                    TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);


//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////
                    toastMessage.setTextColor(Color.WHITE);
                    toastMessage.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18.f);


//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////
                    int padding = (int) TypedValue.applyDimension(
                            TypedValue.COMPLEX_UNIT_DIP, 5, getResources().getDisplayMetrics());

                    toastMessage.setPadding(padding, padding, padding, padding);
                    toastMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);

                    int tabTypefaceStyle = Typeface.BOLD;

//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////
                    AssetManager am = getContext().getAssets();
//////////////////////////////////Переводим ресурс в строку///////////////////////////////////////////////////
                    String toast_font = getResources().getString(R.string.toast_font);

                    toastMessage.setTypeface(Typeface.createFromAsset(
                            am, toast_font), tabTypefaceStyle);
//////////////////////////////////Подключение шрифтов///////////////////////////////////////////////////
//////////////////////////////////Подключение шрифтов из папки Project/app/src/main/Assets //////
                    View view = toast.getView();


                    view.setBackgroundResource(R.drawable.bg_alert_toast_style);
                    toast.show();
                    /////////////////////////////////////////////////////////////////////////////////////

                }

                if (name.getText().toString().compareTo(uslovie) == 0 || name.getText().toString().length() == 0) {
                    DataInfo.AlertDialogShow(getContext(), "<font color='#E74848'>.</font>",
                            "<font color='#FFFFFF'>Введите цитату в поле ввода!</font>",
                            "ОК ");

                }
            }
        });

        return view;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

//    @Override
//    public void onClick(View v) {
//
//
//
//
//        // создаем объект для данных
//        ContentValues cv = new ContentValues();
//
//        // получаем данные из полей ввода
//        String citaty = etCitaty.getText().toString();
//
//
//        // подключаемся к БД
//        SQLiteDatabase db = dbHelper.getWritableDatabase();
//
//
//        switch (v.getId()) {
//            case R.id.btnAddt:
//
//                cv.put("citaty", citaty);
//
//                // вставляем запись и получаем ее ID
//                long rowID = db.insert("mytable", null, cv);
//
//
//
//
//                break;
//            case R.id.btnRead:
//
//                // делаем запрос всех данных из таблицы mytable, получаем Cursor
//                Cursor c = db.query("mytable", null, null, null, null, null, null);
//
//                // ставим позицию курсора на первую строку выборки
//                // если в выборке нет строк, вернется false
//                if (c.moveToFirst()) {
//
//                    // определяем номера столбцов по имени в выборке
//                    int idColIndex = c.getColumnIndex("id");
//                    int citatyColIndex = c.getColumnIndex("citaty");
//
//
//                    do {
//                        // получаем значения по номерам столбцов и пишем все в лог
//
//                        textViewt.setText( "ID = " + c.getInt(idColIndex) +
//                                ", citaty = " + c.getString(citatyColIndex)  );
//
//
//                        // переход на следующую строку
//                        // а если следующей нет (текущая - последняя), то false - выходим из цикла
//                    } while (c.moveToNext());
//                } else
//
//                c.close();
//                break;
////            case R.id.btnCleart:
////                Log.d(LOG_TAG, "--- Clear mytable: ---");
////                // удаляем все записи
////                int clearCount = db.delete("mytable", null, null);
////                Log.d(LOG_TAG, "deleted rows count = " + clearCount);
////                break;
//        }
//        // закрываем подключение к БД
//        dbHelper.close();
//    }
//
//    class DBHelper extends SQLiteOpenHelper {
//
//        public DBHelper(Context context) {
//            // конструктор суперкласса
//
//
//            super(context, "myDBBBB", null, 1);
//        }
//
//        @Override
//        public void onCreate(SQLiteDatabase db) {
//
//            // создаем таблицу с полями
//            db.execSQL("create table mytable ("
//                    + "id integer primary key autoincrement,"
//                    + "citaty text" + ");");
//        }
//
//        @Override
//        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//        }
//    }


}