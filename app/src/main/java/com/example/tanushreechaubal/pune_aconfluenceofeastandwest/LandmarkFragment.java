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
 * {@link LandmarkFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LandmarkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LandmarkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public LandmarkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LandmarkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LandmarkFragment newInstance(String param1, String param2) {
        LandmarkFragment fragment = new LandmarkFragment();
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
        String imagicaName = getResources().getString(R.string.landmark_imagica);
        String imagicaLocation = getResources().getString(R.string.landmark_imagica_loc);
        String imagicaDescription = getResources().getString(R.string.landmark_imagica_description);
        String pataleshwarName = getResources().getString(R.string.landmark_pataleshwar);
        String pataleshwarLocation = getResources().getString(R.string.landmark_pataleshwar_loc);
        String pataleshwarDescription = getResources().getString(R.string.landmark_pataleshwar_description);
        String dagdushethName = getResources().getString(R.string.landmark_dagdusheth);
        String dagdushethLocation = getResources().getString(R.string.landmark_dagdusheth_loc);
        String dagdushethDescription = getResources().getString(R.string.landmark_dagdusheth_description);
        String khadakwaslaName = getResources().getString(R.string.landmark_khadakwasla);
        String khadakwaslaLocation = getResources().getString(R.string.landmark_khadakwasla_loc);
        String khadakwaslaDescription = getResources().getString(R.string.landmark_khadakwasla_description);
        String ndaName = getResources().getString(R.string.landmark_nda_name);
        String ndaLocation = getResources().getString(R.string.landmark_nda_loc);
        String ndaDescription = getResources().getString(R.string.landmark_nda_description);

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_landmark, container, false);
        final ArrayList<PuneInfo> landmarkInfo = new ArrayList<>();
        landmarkInfo.add(new PuneInfo(imagicaName, imagicaLocation,  imagicaDescription, R.drawable.imagica));
        landmarkInfo.add(new PuneInfo(pataleshwarName, pataleshwarLocation, pataleshwarDescription, R.drawable.pataleshwar));
        landmarkInfo.add(new PuneInfo(dagdushethName, dagdushethLocation, dagdushethDescription, R.drawable.dagdushethtemple));
        landmarkInfo.add(new PuneInfo(khadakwaslaName, khadakwaslaLocation, khadakwaslaDescription, R.drawable.khadakwasla));
        landmarkInfo.add(new PuneInfo(ndaName, ndaLocation, ndaDescription, R.drawable.nda));

        PuneInfoAdapter adapter = new PuneInfoAdapter(getActivity(), landmarkInfo, R.color.landmarks);

        ListView listView = rootView.findViewById(R.id.landmarks_ListView);

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
