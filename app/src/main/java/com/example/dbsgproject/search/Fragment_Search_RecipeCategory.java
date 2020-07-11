package com.example.dbsgproject.search;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dbsgproject.R;

public class Fragment_Search_RecipeCategory extends Fragment implements View.OnClickListener {



    //검색액티비티에 값전달용 인터페이스
    public interface Search_Value_Listener {

        void search_Value_Set(String search_Value_tag);

    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof Search_Value_Listener){
            search_Value_Listener = (Search_Value_Listener) context;
        }else{
            throw new RuntimeException(context.toString());
        }
    }
    @Override
    public void onDetach(){
        super.onDetach();
        search_Value_Listener = null;
    }
    private Search_Value_Listener search_Value_Listener;



    //태그값을 받으면 태그값을 검색액티비티로 넘기면서 리스트 프래그먼트로 화면전환 메소드
    public void tag_call(String tag){
        SearchActivity searchActivity = (SearchActivity)getActivity();
        search_Value_Listener.search_Value_Set(tag);
        searchActivity.changeFragment(1);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup containar,
                             @Nullable Bundle savedInstanceStanceState) {



        View rootview = inflater.inflate(R.layout.fragment_seaech_recipe_category, containar, false);


        Button oevn = (Button) rootview.findViewById(R.id.btn1);
        Button airfryer = (Button) rootview.findViewById(R.id.btn2);
        Button fire = (Button) rootview.findViewById(R.id.btn3);
        Button microwave = (Button) rootview.findViewById(R.id.btn4);
        Button spring_like = (Button) rootview.findViewById(R.id.btn5);
        Button summer = (Button) rootview.findViewById(R.id.btn6);
        Button autumn = (Button) rootview.findViewById(R.id.btn7);
        Button winter = (Button) rootview.findViewById(R.id.btn8);
        Button our_baby = (Button) rootview.findViewById(R.id.btn9);
        Button mom = (Button) rootview.findViewById(R.id.btn10);
        Button Korea = (Button) rootview.findViewById(R.id.btn11);
        Button Chinese = (Button) rootview.findViewById(R.id.btn12);
        Button Japanese = (Button) rootview.findViewById(R.id.btn13);
        Button western = (Button) rootview.findViewById(R.id.btn14);
        Button asian = (Button) rootview.findViewById(R.id.btn15);
        Button Diet = (Button) rootview.findViewById(R.id.btn16);
        Button skin = (Button) rootview.findViewById(R.id.btn17);
        Button toxins = (Button) rootview.findViewById(R.id.btn18);
        Button meals_to_prevent_muscle_loss = (Button) rootview.findViewById(R.id.btn19);
        Button Nutritious_tonic = (Button) rootview.findViewById(R.id.btn20);

        Button rice = (Button) rootview.findViewById(R.id.btn21);
        Button scoop = (Button) rootview.findViewById(R.id.btn22);
        Button stir_fry = (Button) rootview.findViewById(R.id.btn23);
        Button dessert = (Button) rootview.findViewById(R.id.btn24);
        Button Drink = (Button) rootview.findViewById(R.id.btn25);
        Button sauce = (Button) rootview.findViewById(R.id.btn26);
        Button Rice_together = (Button) rootview.findViewById(R.id.btn27);
        Button raw_it = (Button) rootview.findViewById(R.id.btn28);
        Button seasoning = (Button) rootview.findViewById(R.id.btn29);
        Button Seasoning_dishes = (Button) rootview.findViewById(R.id.btn30);
        Button Drunk_Friends = (Button) rootview.findViewById(R.id.btn31);
        Button welcome = (Button) rootview.findViewById(R.id.btn32);
        Button hand_packed = (Button) rootview.findViewById(R.id.btn33);
        Button Loosening = (Button) rootview.findViewById(R.id.btn34);
        Button trace = (Button) rootview.findViewById(R.id.btn35);
        Button holiday = (Button) rootview.findViewById(R.id.btn36);
        Button My_3_meals = (Button) rootview.findViewById(R.id.btn37);
        Button Long_Hammock = (Button) rootview.findViewById(R.id.btn38);
        Button fast_eating = (Button) rootview.findViewById(R.id.btn39);
        Button pickle_eat = (Button) rootview.findViewById(R.id.btn40);
        Button Unknown = (Button) rootview.findViewById(R.id.btn41);
        Button snack_bar = (Button) rootview.findViewById(R.id.btn42);



        oevn.setOnClickListener(this);
        airfryer.setOnClickListener(this);
        fire.setOnClickListener(this);
        microwave.setOnClickListener(this);
        spring_like.setOnClickListener(this);
        summer.setOnClickListener(this);
        autumn.setOnClickListener(this);
        winter.setOnClickListener(this);
        our_baby.setOnClickListener(this);
        mom.setOnClickListener(this);
        Korea.setOnClickListener(this);
        Chinese.setOnClickListener(this);
        Japanese.setOnClickListener(this);
        western.setOnClickListener(this);
        asian.setOnClickListener(this);
        Diet.setOnClickListener(this);
        skin.setOnClickListener(this);
        toxins.setOnClickListener(this);
        meals_to_prevent_muscle_loss.setOnClickListener(this);
        Nutritious_tonic.setOnClickListener(this);
        rice.setOnClickListener(this);
        scoop.setOnClickListener(this);
        stir_fry.setOnClickListener(this);
        dessert.setOnClickListener(this);
        Drink.setOnClickListener(this);
        sauce.setOnClickListener(this);
        Rice_together.setOnClickListener(this);
        raw_it.setOnClickListener(this);
        seasoning.setOnClickListener(this);
        Seasoning_dishes.setOnClickListener(this);
        Drunk_Friends.setOnClickListener(this);
        welcome.setOnClickListener(this);
        hand_packed.setOnClickListener(this);
        Loosening.setOnClickListener(this);
        trace.setOnClickListener(this);
        holiday.setOnClickListener(this);
        My_3_meals.setOnClickListener(this);
        Long_Hammock.setOnClickListener(this);
        fast_eating.setOnClickListener(this);
        pickle_eat.setOnClickListener(this);
        Unknown.setOnClickListener(this);
        snack_bar.setOnClickListener(this);

        return rootview;


    }



//클릭시 태그 정보값 전달
    public void onClick(View v) {
        String tag;
        String Search_Value;

        switch (v.getId()) {
            case R.id.btn1:
                tag = "1";
                tag_call(tag);

                break;
            case R.id.btn2:
                tag = "2";
                tag_call(tag);
                break;
            case R.id.btn3:
                tag = "3";
                tag_call(tag);

                break;
            case R.id.btn4:
                tag = "4";
                tag_call(tag);

                break;
            case R.id.btn5:
                tag = "5";
                tag_call(tag);

                break;
            case R.id.btn6:
                tag = "6";
                tag_call(tag);

                break;
            case R.id.btn7:
                tag = "7";
                tag_call(tag);

                break;
            case R.id.btn8:
                tag = "8";
                tag_call(tag);

                break;
            case R.id.btn9:
                tag = "9";
                tag_call(tag);

                break;
            case R.id.btn10:
                tag = "10";
                tag_call(tag);

                break;
            case R.id.btn11:
                tag = "11";
                tag_call(tag);

                break;
            case R.id.btn12:
                tag = "12";
                tag_call(tag);

                break;
            case R.id.btn13:
                tag = "13";
                tag_call(tag);

                break;
            case R.id.btn14:
                tag = "14";
                tag_call(tag);

                break;
            case R.id.btn15:
                tag = "15";
                tag_call(tag);

                break;
            case R.id.btn16:
                tag = "16";
                tag_call(tag);

                break;
            case R.id.btn17:
                tag = "17";
                tag_call(tag);

                break;
            case R.id.btn18:
                tag = "18";
                tag_call(tag);

                break;
            case R.id.btn19:
                tag = "19";
                tag_call(tag);

                break;
            case R.id.btn20:
                tag = "20";
                tag_call(tag);

                break;
            case R.id.btn21:
                tag = "21";
                tag_call(tag);

                break;
            case R.id.btn22:
                tag = "22";
                tag_call(tag);

                break;
            case R.id.btn23:
                tag = "23";
                tag_call(tag);

                break;
            case R.id.btn24:
                tag = "24";
                tag_call(tag);

                break;
            case R.id.btn25:
                tag = "25";
                tag_call(tag);

                break;
            case R.id.btn26:
                tag = "26";
                tag_call(tag);

                break;
            case R.id.btn27:
                tag = "27";
                tag_call(tag);

                break;
            case R.id.btn28:
                tag = "28";
                tag_call(tag);

                break;
            case R.id.btn29:
                tag = "29";
                tag_call(tag);

                break;
            case R.id.btn30:
                tag = "30";
                tag_call(tag);

                break;
            case R.id.btn31:
                tag = "31";
                tag_call(tag);

                break;
            case R.id.btn32:
                tag = "32";
                tag_call(tag);

                break;
            case R.id.btn33:
                tag = "33";
                tag_call(tag);

                break;
            case R.id.btn34:
                tag = "34";
                tag_call(tag);

                break;
            case R.id.btn35:
                tag = "35";
                tag_call(tag);

                break;
            case R.id.btn36:
                tag = "36";
                tag_call(tag);

                break;
            case R.id.btn37:
                tag = "37";
                tag_call(tag);

                break;
            case R.id.btn38:
                tag = "38";
                tag_call(tag);

                break;
            case R.id.btn39:
                tag = "39";
                tag_call(tag);

                break;
            case R.id.btn40:
                tag = "40";
                tag_call(tag);

                break;
            case R.id.btn41:
                tag = "41";
                tag_call(tag);

                break;
            case R.id.btn42:
                tag = "42";
                tag_call(tag);
                break;

        }
    }


}
