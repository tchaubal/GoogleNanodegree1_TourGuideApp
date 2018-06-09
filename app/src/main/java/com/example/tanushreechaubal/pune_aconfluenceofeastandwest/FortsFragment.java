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
 * {@link FortsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FortsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FortsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FortsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FortsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FortsFragment newInstance(String param1, String param2) {
        FortsFragment fragment = new FortsFragment();
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
        String shaniwarwadaName = getResources().getString(R.string.fort_shaniwarwada);
        String shaniwarwadaLocation = getResources().getString(R.string.fort_shaniwarwada_location);
        String shaniwarwadaDescription = getResources().getString(R.string.fort_shaniwarwada_description);
        String tornaName = getResources().getString(R.string.fort_torna);
        String tornaLocation = getResources().getString(R.string.fort_torna_location);
        String tornaDescription = getResources().getString(R.string.fort_torna_description);
        String sinhagadName = getResources().getString(R.string.fort_sinhagad);
        String sinhagadLocation = getResources().getString(R.string.fort_sinhagad_location);
        String sinhagadDescription = getResources().getString(R.string.fort_sinhagad_description);
        String shivneriName = getResources().getString(R.string.fort_shivneri);
        String shivneriLocation = getResources().getString(R.string.fort_shivneri_location);
        String shivneriDescription = getResources().getString(R.string.fort_shivneri_description);
        String visapurName = getResources().getString(R.string.fort_visapur);
        String visapurLocation = getResources().getString(R.string.fort_visapur_location);
        String visapurDescription = getResources().getString(R.string.fort_visapur_description);

        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_forts, container, false);
        final ArrayList<PuneInfo> fortInfo = new ArrayList<>();
        fortInfo.add(new PuneInfo(shaniwarwadaName, shaniwarwadaLocation, shaniwarwadaDescription, R.drawable.shaniwarwada));
        fortInfo.add(new PuneInfo(tornaName, tornaLocation, tornaDescription, R.drawable.torna));
        fortInfo.add(new PuneInfo(sinhagadName, sinhagadLocation, sinhagadDescription, R.drawable.sinhagad));
        fortInfo.add(new PuneInfo(shivneriName, shivneriLocation, shivneriDescription, R.drawable.shivneri));
        fortInfo.add(new PuneInfo(visapurName, visapurLocation, visapurDescription, R.drawable.visapur));

        PuneInfoAdapter adapter = new PuneInfoAdapter(getActivity(), fortInfo, R.color.forts);

        ListView listView = rootView.findViewById(R.id.forts_ListView);

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
