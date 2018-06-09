package com.example.tanushreechaubal.pune_aconfluenceofeastandwest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TechParkFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TechParkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TechParkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TechParkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TechParkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TechParkFragment newInstance(String param1, String param2) {
        TechParkFragment fragment = new TechParkFragment();
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
        String magarpattaName = getResources().getString(R.string.techPark_magarpatta);
        String magarpattaLocation = getResources().getString(R.string.techPark_magarpatta_location);
        String magarpattaDescription = getResources().getString(R.string.techPark_magarpatta_description);
        String hinjewadiName = getResources().getString(R.string.techPark_hinjewadi);
        String hinjewadiLocation = getResources().getString(R.string.techPark_hinjewadi_location);
        String hinjewadiDescription = getResources().getString(R.string.techPark_hinjewadi_description);
        String techParkOneName = getResources().getString(R.string.techPark_One);
        String techParkOneLocation = getResources().getString(R.string.techPark_One_location);
        String techParkOneDescription = getResources().getString(R.string.techPark_One_description);
        String eonName = getResources().getString(R.string.techPark_eon);
        String eonLocation = getResources().getString(R.string.techPark_eon_location);
        String eonDescription = getResources().getString(R.string.techPark_eon_description);
        String nanospaceName = getResources().getString(R.string.techPark_nanospace);
        String nanospaceLocation = getResources().getString(R.string.techPark_nanospace_location);
        String nanospaceDescription = getResources().getString(R.string.techPark_nanospace_description);

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tech_park, container, false);
        final ArrayList<PuneInfo> techParkInfo = new ArrayList<>();
        techParkInfo.add(new PuneInfo(magarpattaName, magarpattaLocation, magarpattaDescription, R.drawable.magarpatta));
        techParkInfo.add(new PuneInfo(hinjewadiName, hinjewadiLocation, hinjewadiDescription, R.drawable.hinjawadi));
        techParkInfo.add(new PuneInfo(techParkOneName, techParkOneLocation, techParkOneDescription, R.drawable.techparkone));
        techParkInfo.add(new PuneInfo(eonName, eonLocation, eonDescription, R.drawable.eon));
        techParkInfo.add(new PuneInfo(nanospaceName, nanospaceLocation, nanospaceDescription, R.drawable.businessbay));

        PuneInfoAdapter adapter = new PuneInfoAdapter(getActivity(), techParkInfo, R.color.techParks);

        ListView listView = rootView.findViewById(R.id.techParks_ListView);

        listView.setAdapter(adapter);
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
