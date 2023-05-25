package com.example.Philosophers.Philosophers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.Philosophers.R;
import com.example.Philosophers.Begin.ShowAnimation;

import java.util.ArrayList;



public class Fragmet_Home extends Fragment {

    ArrayList<Displayy> Arraycitats = new ArrayList();
    ListView citattList;
    private DataInfo dataInfo = new DataInfo();
    private Object View;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
//
//        Intent intent = new Intent(getContext(),MainActivityTodo.class);
//        getContext().startActivity(intent);

//        Button button;
//        int height = RelativeLayout.LayoutParams.MATCH_PARENT;
//        int width = 122;
//        RelativeLayout.LayoutParams layoutParams= new RelativeLayout.LayoutParams(width,height);
//        button = container.findViewById(R.id.bbbb);
//        button.setLayoutParams(layoutParams);

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        citattList = (ListView) view.findViewById(R.id.productList);

        Animation animm;
        animm = AnimationUtils.loadAnimation(getContext(), R.anim.scale_basic);
        citattList.startAnimation(animm);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////       /  `  /////////////////////////////////////////////////////////////////////////////////////
        ///////     / /     /////////////////////////////////////////////////////////////////////////////////////
        ///////   /   /     /////////////////////////////////////////////////////////////////////////////////////
        ///////       /     /////////////////////////////////////////////////////////////////////////////////////
        ///////       /     /////////////////////////////////////////////////////////////////////////////////////
        ///////   ///////// /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////Загружаем изображения в массив///////////////////////

        if (Arraycitats.size() == 0) {
            for (int count = 0; count < dataInfo.iconsIDs.length; count++) {
                Arraycitats.add(new Displayy(dataInfo.iconsIDs[count], dataInfo.nameOfPhilosofs[count], dataInfo.Description[count], dataInfo.years[count]));
            }
        }


        DisplayAdapter adapter = new DisplayAdapter(getContext(), R.layout.maket_fragment_home, Arraycitats);
        citattList.setAdapter(adapter);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////       /  `  /////////////////////////////////////////////////////////////////////////////////////
        ///////     / /     /////////////////////////////////////////////////////////////////////////////////////
        ///////   /   /     /////////////////////////////////////////////////////////////////////////////////////
        ///////       /     /////////////////////////////////////////////////////////////////////////////////////
        ///////       /     /////////////////////////////////////////////////////////////////////////////////////
        ///////   ///////// /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////


        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////                 /////////////////////////////////////////////////////////////////////////////////
        ///////  ////////////   /////////////////////////////////////////////////////////////////////////////////
        ///////         ///     /////////////////////////////////////////////////////////////////////////////////
        ///////       ///       /////////////////////////////////////////////////////////////////////////////////
        ///////     ///         /////////////////////////////////////////////////////////////////////////////////
        ///////   ///           /////////////////////////////////////////////////////////////////////////////////
        /////// /////////////   /////////////////////////////////////////////////////////////////////////////////
        ///////                 /////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        ImageView image_parmenid = (ImageView) view.findViewById(R.id.image_parmenid);
        image_parmenid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 0);
                getContext().startActivity(intent);
            }
        });

        ImageView image_aristotelone = (ImageView) view.findViewById(R.id.image_aristotelone);
        image_aristotelone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 1);
                getContext().startActivity(intent);
            }
        });

        ImageView image_avreliy = (ImageView) view.findViewById(R.id.image_avreliy);
        image_avreliy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 2);
                getContext().startActivity(intent);
            }
        });

        ImageView image_anselm = (ImageView) view.findViewById(R.id.image_anselm);
        image_anselm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 3);
                getContext().startActivity(intent);
            }
        });

        ImageView image_spinoza = (ImageView) view.findViewById(R.id.image_spinoza);
        image_spinoza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 4);
                getContext().startActivity(intent);
            }
        });


        ImageView image_shopengauer = (ImageView) view.findViewById(R.id.image_shopengauer);
        image_shopengauer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 5);
                getContext().startActivity(intent);
            }
        });

        ImageView image_nicshe = (ImageView) view.findViewById(R.id.image_nicshe);
        image_nicshe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 6);
                getContext().startActivity(intent);
            }
        });

        ImageView image_sarts = (ImageView) view.findViewById(R.id.image_sarts);
        image_sarts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 7);
                getContext().startActivity(intent);
            }
        });


        ImageView image_ponti = (ImageView) view.findViewById(R.id.image_ponti);
        image_ponti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 8);
                getContext().startActivity(intent);
            }
        });


        ImageView image_aristoteltwo = (ImageView) view.findViewById(R.id.image_aristoteltwo);
        image_aristoteltwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 9);
                getContext().startActivity(intent);
            }
        });


        ImageView image_kant = (ImageView) view.findViewById(R.id.image_kant);
        image_kant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 10);
                getContext().startActivity(intent);
            }
        });


        ImageView image_platon = (ImageView) view.findViewById(R.id.image_platon);
        image_platon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 11);
                getContext().startActivity(intent);
            }
        });


        ImageView image_konfuciy = (ImageView) view.findViewById(R.id.image_konfuciy);
        image_konfuciy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 12);
                getContext().startActivity(intent);
            }
        });


        ImageView image_um = (ImageView) view.findViewById(R.id.image_um);
        image_um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 13);
                getContext().startActivity(intent);
            }
        });


        ImageView image_dekart = (ImageView) view.findViewById(R.id.image_dekart);
        image_dekart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 14);
                getContext().startActivity(intent);
            }
        });


        ImageView image_socrat = (ImageView) view.findViewById(R.id.image_socrat);
        image_socrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 15);
                getContext().startActivity(intent);
            }
        });


        ImageView image_makiavelli = (ImageView) view.findViewById(R.id.image_makiavelli);
        image_makiavelli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 16);
                getContext().startActivity(intent);
            }
        });


        ImageView image_lock = (ImageView) view.findViewById(R.id.image_lock);
        image_lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 17);
                getContext().startActivity(intent);
            }
        });


        ImageView image_diogen = (ImageView) view.findViewById(R.id.image_diogen);
        image_diogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 18);
                getContext().startActivity(intent);
            }
        });


        ImageView image_foma = (ImageView) view.findViewById(R.id.image_foma);
        image_foma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 19);
                getContext().startActivity(intent);
            }
        });


        ImageView image_czy = (ImageView) view.findViewById(R.id.image_czy);
        image_czy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 20);
                getContext().startActivity(intent);
            }
        });


        ImageView image_leibnic = (ImageView) view.findViewById(R.id.image_leibnic);
        image_leibnic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 21);
                getContext().startActivity(intent);
            }
        });


        ImageView image_spinozatwo = (ImageView) view.findViewById(R.id.image_spinozatwo);
        image_spinozatwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 22);
                getContext().startActivity(intent);
            }
        });


        ImageView image_volter = (ImageView) view.findViewById(R.id.image_volter);
        image_volter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 23);
                getContext().startActivity(intent);
            }
        });


        ImageView image_gobs = (ImageView) view.findViewById(R.id.image_gobs);
        image_gobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 24);
                getContext().startActivity(intent);
            }
        });


        ImageView image_avgustin = (ImageView) view.findViewById(R.id.image_avgustin);
        image_avgustin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 25);
                getContext().startActivity(intent);
            }
        });


        ImageView image_gazali = (ImageView) view.findViewById(R.id.image_gazali);
        image_gazali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 26);
                getContext().startActivity(intent);
            }
        });

        ImageView image_budda = (ImageView) view.findViewById(R.id.image_budda);
        image_budda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 27);
                getContext().startActivity(intent);
            }
        });

        ImageView image_monteskie = (ImageView) view.findViewById(R.id.image_monteskie);
        image_monteskie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 28);
                getContext().startActivity(intent);
            }
        });

        ImageView image_russo = (ImageView) view.findViewById(R.id.image_russo);
        image_russo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 29);
                getContext().startActivity(intent);
            }
        });


        ImageView image_berkly = (ImageView) view.findViewById(R.id.image_berkly);
        image_berkly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 30);
                getContext().startActivity(intent);
            }
        });


        ImageView image_rend = (ImageView) view.findViewById(R.id.image_rend);
        image_rend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 31);
                getContext().startActivity(intent);
            }
        });


        ImageView image_buvuar = (ImageView) view.findViewById(R.id.image_buvuar);
        image_buvuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getContext(), String.format(" jggh", "dgdgdg"), Toast.LENGTH_SHORT );
//                toast.show();
                Intent intent = new Intent(getContext(), ShowCitat.class);
                intent.putExtra("Pos", 32);
                getContext().startActivity(intent);
            }
        });

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////                 /////////////////////////////////////////////////////////////////////////////////
        ///////  ////////////   /////////////////////////////////////////////////////////////////////////////////
        ///////         ///     /////////////////////////////////////////////////////////////////////////////////
        ///////       ///       /////////////////////////////////////////////////////////////////////////////////
        ///////     ///         /////////////////////////////////////////////////////////////////////////////////
        ///////   ///           /////////////////////////////////////////////////////////////////////////////////
        /////// /////////////   /////////////////////////////////////////////////////////////////////////////////
        ///////                 /////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////


//        LinearLayout linearLayout2 = new LinearLayout(getContext());
//        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
//        linearLayout2.setOrientation(LinearLayout.VERTICAL);

/////////////////////////////////////////////////////////////////////////////////////////////////////

        int myColor_one = ContextCompat.getColor(getContext(), R.color.colorPrimaryone);
        int myColor_two = ContextCompat.getColor(getContext(), R.color.colorPrimarytwo);

        ShowAnimation.ShowAnimColor(citattList, myColor_one, myColor_two, "backgroundColor", 0, 2000);

/////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////

        return view;
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
    }


}
