package com.example.starlibrary.ui.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.starlibrary.R;
import com.example.starlibrary.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    private FragmentDashboardBinding binding;
    View v;
    //책 종류
    private final int Fragment_0=0;
    private final int Fragment_1=1;
    private final int Fragment_2=2;
    private final int Fragment_3=3;
    private final int Fragment_4=4;
    private final int Fragment_5=5;
    private final int Fragment_6=6;
    private final int Fragment_7=7;
    private final int Fragment_8=8;
    //대출 버튼
    private final int Borrow = 100;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //DashboardViewModel dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);


        //binding = FragmentDashboardBinding.inflate(inflater, container, false);
        //View root = binding.getRoot();

        //final TextView textView = binding.textDashboard;
        //dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        //장르 버튼 클릭시 fragment inflate
        v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        v.findViewById(R.id.g1).setOnClickListener(this);
        v.findViewById(R.id.g2).setOnClickListener(this);
        v.findViewById(R.id.g3).setOnClickListener(this);
        v.findViewById(R.id.g4).setOnClickListener(this);
        v.findViewById(R.id.g5).setOnClickListener(this);
        v.findViewById(R.id.g6).setOnClickListener(this);        v.findViewById(R.id.g6).setOnClickListener(this);
        v.findViewById(R.id.g7).setOnClickListener(this);
        v.findViewById(R.id.g8).setOnClickListener(this);




        FragmentView(Fragment_0);
        return v;
    }
    public void onClick(View v) {
        switch(v.getId())
        {
            //소설 클릭시
            case R.id.g1:
            {
                Log.v("click", "click");
                FragmentView(Fragment_1);

                break;
            }

            case R.id.g2:
            {
                Log.v("click", "click");
                FragmentView(Fragment_2);

                break;
            }

            case R.id.g3:
            {
                Log.v("click", "click");
                FragmentView(Fragment_3);

                break;
            }

            case R.id.g4:
            {
                Log.v("click", "click");
                FragmentView(Fragment_4);

                break;
            }

            case R.id.g5:
            {
                Log.v("click", "click");
                FragmentView(Fragment_5);

                break;
            }

            case R.id.g6:
            {
                Log.v("click", "click");
                FragmentView(Fragment_6);

                break;
            }

            case R.id.g7:
            {
                Log.v("click", "click");
                FragmentView(Fragment_7);

                break;
            }

            case R.id.g8:
            {
                Log.v("click", "click");
                FragmentView(Fragment_8);

                break;
            }


        }
    }
    private void FragmentView(int fragment){

        //프래그먼트를 사용
        Log.v("test", "test");
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
               // .replace(R.id.fragment_container, new D1());

        switch (fragment){
            case 0:
                //기본 화면
                D0 fragment0 = new D0();
                transaction.replace(R.id.fragment_container, fragment0);
                transaction.commit();

                break;
            case 1:
                // 첫번째 프래그먼트 호출
                D1 fragment1 = new D1();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.commit();

                break;

            case 2:
                // 두번째 프래그먼트 호출
                D2 fragment2 = new D2();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.commit();
                break;
            case 3:
                D3 fragment3 = new D3();
                transaction.replace(R.id.fragment_container, fragment3);
                transaction.commit();
                break;
            case 4:
                D4 fragment4 = new D4();
                transaction.replace(R.id.fragment_container, fragment4);
                transaction.commit();
                break;
            case 5:
                D5 fragment5 = new D5();
                transaction.replace(R.id.fragment_container, fragment5);
                transaction.commit();
                break;
            case 6:
                D6 fragment6 = new D6();
                transaction.replace(R.id.fragment_container, fragment6);
                transaction.commit();
                break;
            case 7:
                D7 fragment7 = new D7();
                transaction.replace(R.id.fragment_container, fragment7);
                transaction.commit();
                break;
            case 8:
                D8 fragment8 = new D8();
                transaction.replace(R.id.fragment_container, fragment8);
                transaction.commit();
                break;


        }

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }




}