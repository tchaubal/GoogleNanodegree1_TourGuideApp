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
 * {@link PlaceToEatFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PlaceToEatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlaceToEatFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public PlaceToEatFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PlaceToEatFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PlaceToEatFragment newInstance(String param1, String param2) {
        PlaceToEatFragment fragment = new PlaceToEatFragment();
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
        String vaishaliName = getResources().getString(R.string.restaurant_vaishali);
        String vaishaliLocation = getResources().getString(R.string.restaurant_vaishali_location);
        String vaishaliDescription = getResources().getString(R.string.restaurant_vaishali_description);
        String bedekarName = getResources().getString(R.string.restaurant_bedekar);
        String bedekarLocation = getResources().getString(R.string.restaurant_bedekar_location);
        String bedekarDescription = getResources().getString(R.string.restaurant_bedekar_description);
        String thePlaceName = getResources().getString(R.string.restaurant_thePlace);
        String thePlaceLocation = getResources().getString(R.string.restaurant_thePlace_location);
        String thePlaceDescription = getResources().getString(R.string.restaurant_thePlace_description);
        String nisargaName = getResources().getString(R.string.restaurant_nisarga);
        String nisargaLocation = getResources().getString(R.string.restaurant_nisarga_location);
        String nisargaDescription = getResources().getString(R.string.restaurant_nisarga_description);
        String lePlasirName = getResources().getString(R.string.restaurant_lePlasir);
        String lePlasirLocation = getResources().getString(R.string.restaurant_lePlasir_location);
        String lePlasirDescription = getResources().getString(R.string.restaurant_lePlasir_description);

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_place_to_eat, container, false);
        final ArrayList<PuneInfo> foodPlacesInfo = new ArrayList<>();
        foodPlacesInfo.add(new PuneInfo(vaishaliName, vaishaliLocation, vaishaliDescription, R.drawable.vaishali));
        foodPlacesInfo.add(new PuneInfo(bedekarName, bedekarLocation, bedekarDescription, R.drawable.bedekar));
        foodPlacesInfo.add(new PuneInfo(thePlaceName, thePlaceLocation, thePlaceDescription, R.drawable.theplace));
        foodPlacesInfo.add(new PuneInfo(nisargaName, nisargaLocation, nisargaDescription, R.drawable.nisarg));
        foodPlacesInfo.add(new PuneInfo(lePlasirName, lePlasirLocation, lePlasirDescription, R.drawable.leplasir));

        PuneInfoAdapter adapter = new PuneInfoAdapter(getActivity(), foodPlacesInfo, R.color.placesToEat);

        ListView listView = rootView.findViewById(R.id.placeToEat_ListView);

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
