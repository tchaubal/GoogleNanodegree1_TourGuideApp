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
 * {@link GardensFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GardensFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GardensFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GardensFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GardensFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GardensFragment newInstance(String param1, String param2) {
        GardensFragment fragment = new GardensFragment();
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
        String bundGardenName = getResources().getString(R.string.garden_bundgarden);
        String bundGardenLocation = getResources().getString(R.string.garden_bundgardenLocation);
        String bundGardenDescription = getResources().getString(R.string.garden_bundgardenDescription);
        String peshweParkName = getResources().getString(R.string.garden_peshwepark);
        String peshweParkLocation = getResources().getString(R.string.garden_peshweparkLocation);
        String peshweParkDescription = getResources().getString(R.string.garden_peshweparkDescription);
        String empressGardenName = getResources().getString(R.string.garden_empressgarden);
        String empressGardenLocation = getResources().getString(R.string.garden_empressgardenLocation);
        String empressGardenDescription = getResources().getString(R.string.garden_empressgardenDescription);
        String pulaGardenName = getResources().getString(R.string.garden_pulagarden);
        String pulaGardenLocation = getResources().getString(R.string.garden_pulaLocation);
        String pulaGardenDescription = getResources().getString(R.string.garden_pulaDescription);
        String sambhajiParkName = getResources().getString(R.string.garden_sambhajipark);
        String sambhajiParkLocation = getResources().getString(R.string.garden_sambhajiparkLocation);
        String sambhajiParkDescription = getResources().getString(R.string.garden_sambhajiparkDescription);
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_gardens, container, false);

        final ArrayList<PuneInfo> gardenInfo = new ArrayList<>();
        gardenInfo.add(new PuneInfo(bundGardenName, bundGardenLocation,  bundGardenDescription, R.drawable.bundgarden));
        gardenInfo.add(new PuneInfo(peshweParkName, peshweParkLocation, peshweParkDescription, R.drawable.peshwepark));
        gardenInfo.add(new PuneInfo(empressGardenName, empressGardenLocation, empressGardenDescription, R.drawable.empressgarden));
        gardenInfo.add(new PuneInfo(pulaGardenName, pulaGardenLocation, pulaGardenDescription, R.drawable.puladeshpandegarden));
        gardenInfo.add(new PuneInfo(sambhajiParkName, sambhajiParkLocation, sambhajiParkDescription, R.drawable.sambhajipark));

        PuneInfoAdapter adapter = new PuneInfoAdapter(getActivity(), gardenInfo, R.color.gardens);

        ListView listView = rootView.findViewById(R.id.parks_ListView);

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
