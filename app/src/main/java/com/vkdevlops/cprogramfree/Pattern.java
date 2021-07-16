package com.vkdevlops.cprogramfree;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vkdevlops.cprogramfree.adapter.PatternAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Pattern#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Pattern extends Fragment {

    String[] s1;
    int[] images = {R.drawable.pattern_1,R.drawable.pattern_2,R.drawable.pattern_3,R.drawable.pattern_4, R.drawable.pattern_5,
            R.drawable.pattern_6,R.drawable.pattern_7,R.drawable.pattern_8,R.drawable.pattern_9, R.drawable.pattern_10,R.drawable.pattern_11,
            R.drawable.pattern_12,R.drawable.pattern_13,R.drawable.pattern_14, R.drawable.pattern_15,R.drawable.pattern_16,R.drawable.pattern_17,
            R.drawable.pattern_18,R.drawable.pattern_19,R.drawable.pattern_20,R.drawable.pattern_21,R.drawable.pattern_22,R.drawable.pattern_23,R.drawable.pattern_24,R.drawable.pattern_25,R.drawable.pattern_26,R.drawable.pattern_27
            ,R.drawable.pattern_28,R.drawable.pattern_29,R.drawable.pattern_30,R.drawable.pattern_31,R.drawable.pattern_32,R.drawable.pattern_33,R.drawable.pattern_34,R.drawable.pattern_35,R.drawable.pattern_36,R.drawable.pattern_37,R.drawable.pattern_38,R.drawable.pattern_39,R.drawable.pattern_40
            ,R.drawable.pattern_41,R.drawable.pattern_42,R.drawable.pattern_43,R.drawable.pattern_44,R.drawable.pattern_45,R.drawable.pattern_46,R.drawable.pattern_47,R.drawable.pattern_48,R.drawable.pattern_49,R.drawable.pattern_50};

    RecyclerView recyclerView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Pattern() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Pattern.
     */
    // TODO: Rename and change types and number of parameters
    public static Pattern newInstance(String param1, String param2) {
        Pattern fragment = new Pattern();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_pattern, container, false);
        s1 = getResources().getStringArray(R.array.pattern_programs);
        recyclerView = view.findViewById(R.id.pattern_recycler);

        PatternAdapter patternAdapter = new PatternAdapter(getContext(),s1,images);
        recyclerView.setAdapter(patternAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}