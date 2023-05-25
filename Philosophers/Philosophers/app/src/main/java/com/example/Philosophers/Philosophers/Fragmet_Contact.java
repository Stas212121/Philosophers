package com.example.Philosophers.Philosophers;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;


public class Fragmet_Contact extends Fragment {


    Button button_more_info, button_send, button_send_mail;
    boolean opened;
    LinearLayout linearLayoutmove;
    private EditText mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;
    private Object Fragmet_Add_Records;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        LinearLayout linearLayout;
        linearLayout = view.findViewById(R.id.layout_info);


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

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        ShowAnimation.doAnimScale(textViewonetext, getContext(), R.anim.scale_standart_two);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////


        ShowAnimation.doAnimScale(textViewtwotext, getContext(), R.anim.scale_standart_two);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////


        ShowAnimation.doAnimScale(textViewthreetext, getContext(), R.anim.scale_standart_two);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
        TextView textshowRecords = view.findViewById(R.id.continfotitle);
        ShowAnimation.doAnimScale(textshowRecords, getContext(), R.anim.scale);
        //int color = Integer.parseInt(String.valueOf(R.color.colorPrimaryone), 16)+0xFF000000;
/////////////////////////////////////////////////////////////////////////////////////////////////////
        int myColor_one = ContextCompat.getColor(getContext(), R.color.colorPrimaryone);
        int myColor_two = ContextCompat.getColor(getContext(), R.color.colorPrimarytwo);


        ShowAnimation.ShowAnimColor(linearLayout, myColor_one, myColor_two, "backgroundColor", 0, 2000);

///////////////////////////////////////////////////BUTTON/////////////////////////////////////////////
        Button button_send_mail_from_info = view.findViewById(R.id.button_send_mail_from_info);

        ShowAnimation.doAnimScale(button_send_mail_from_info, getContext(), R.anim.scale);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        TextView textView;
        textView = view.findViewById(R.id.infoTextView);

        ShowAnimation.doAnimScale(textView, getContext(), R.anim.scale_standart);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        TextView textViewone;
        textViewone = view.findViewById(R.id.infoTextViewone);

        ShowAnimation.doAnimScale(textViewone, getContext(), R.anim.scale_two);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        TextView textViewtwo;
        textViewtwo = view.findViewById(R.id.infoTextViewtwo);

        ShowAnimation.doAnimScale(textViewtwo, getContext(), R.anim.scale_two);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        TextView textViewthree;
        textViewthree = view.findViewById(R.id.infoTextViewthree);

        ShowAnimation.doAnimScale(textViewthree, getContext(), R.anim.scale_two);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////BUTTON/////////////////////////////////////////////
        Button _more_info = view.findViewById(R.id.button_more_info);

        ShowAnimation.doAnimScale(_more_info, getContext(), R.anim.scale_button_more_info);
/////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////
        RelativeLayout RelativeLayout_relativeLayoutLineWithButtons;
        RelativeLayout_relativeLayoutLineWithButtons = view.findViewById(R.id.relativeLayoutLineWithButtons);
        //int color = Integer.parseInt(String.valueOf(R.color.colorPrimaryone), 16)+0xFF000000;

        int myColor_one1 = ContextCompat.getColor(getContext(), R.color.colorPrimarytwo);
        int myColor_two2 = ContextCompat.getColor(getContext(), R.color.white);


        ShowAnimation.ShowAnimColor(RelativeLayout_relativeLayoutLineWithButtons, myColor_one1, myColor_two2, "backgroundColor", 0, 4000);


//        TextView tv = new TextView(getContext());
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(180, 100);
//        tv.setLayoutParams(layoutParams);
//        tv.setText("testing 1 2 3");
//        tv.setTextColor(Color.BLACK);
//        tv.setBackgroundColor(Color.BLACK);
//        getActivity().setContentView(tv);

        button_more_info = (Button) view.findViewById(R.id.button_more_info);

        button_more_info.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {





                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                //String toast_font = getResources().getString(R.string.atention_ru);

                builder.setTitle(Html.fromHtml("<font color='#E74848'></font>"))
                        .setMessage(Html.fromHtml("<font color='#FFFFFF'>Для большей информаци свяжитесь с разработчиком</font>"))
                        .setIcon(R.drawable.ic_warning_black_24dp)

                        .setCancelable(false)
                        .setNegativeButton("ОК,Написать письмо",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {

                                        final Dialog dialogg = new Dialog(getContext());

                                        dialogg.setContentView(R.layout.activity_send_mail);

                                        //////////////////////////////////
                                        dialogg.show();
                                        button_send_mail = (Button) dialogg.findViewById(R.id.button_send);


                                        button_send_mail.setOnClickListener(new View.OnClickListener() {
                                            @Override

                                            public void onClick(View v) {

                                                mEditTextSubject = (EditText) dialogg.findViewById(R.id.edit_text_subject);
                                                mEditTextMessage = (EditText) dialogg.findViewById(R.id.edit_text_message);

                                                String recipientList = "developer.stanislavkononenko@gmail.com";
                                                String subject = mEditTextSubject.getText().toString();
                                                String message = mEditTextMessage.getText().toString();

                                                Intent intent = new Intent(Intent.ACTION_SEND);
                                                intent.putExtra(Intent.EXTRA_EMAIL, recipientList);
                                                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                                                intent.putExtra(Intent.EXTRA_TEXT, message);

                                                intent.setType("message/rfc822");
                                                startActivity(Intent.createChooser(intent, "Choose an email client"));


                                            }
                                        });

                                    }
                                });
                AlertDialog alert = builder.create();
                Window vieww = ((AlertDialog) alert).getWindow();
                vieww.setBackgroundDrawableResource(R.drawable.bg_alert_toast_style);
                alert.show();

            }
        });

        button_send = (Button) view.findViewById(R.id.button_send_mail_from_info);

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                final Dialog dialog = new Dialog(getContext());

                dialog.setContentView(R.layout.activity_send_mail);
                //////////////////////////////////
                dialog.show();
                button_send_mail = (Button) dialog.findViewById(R.id.button_send);


                button_send_mail.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View v) {

                        mEditTextSubject = (EditText) dialog.findViewById(R.id.edit_text_subject);
                        mEditTextMessage = (EditText) dialog.findViewById(R.id.edit_text_message);

                        String recipientList = "developer.stanislavkononenko@gmail.com";
                        String subject = mEditTextSubject.getText().toString();
                        String message = mEditTextMessage.getText().toString();

                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, recipientList);
                        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                        intent.putExtra(Intent.EXTRA_TEXT, message);

                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "Choose an email client"));

                    }
                });

            }
        });

        return view;
    }

    private void sendMail() {
        //String recipientList = mEditTextTo.getText().toString();
//        String recipientList = "developer.stanislavkononenko@gmail.com";
//        String subject = mEditTextSubject.getText().toString();
//        String message = mEditTextMessage.getText().toString();
//
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.putExtra(Intent.EXTRA_EMAIL, recipientList);
//        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
//        intent.putExtra(Intent.EXTRA_TEXT, message);
//
//        intent.setType("message/rfc822");
//        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }
}
