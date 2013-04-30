TabsWithFragmentsTutorial
=========================

A tutorial on how to implement action bar tabs with fragments.

1) First create an Activity to which you want to attach the fragments. For the activity's layout just change the layout 
  to linear and then nest another linear layout within it. This inner layout will hold the fragments. DO NOT USE THE TAB
  HOST WIDETS THAT COME WITH ECLIPSE
  
2) In this Acvtivity's java file extend FragmentActivity instead of Activity. 
  
3) Next create your fragments. Create an normal android activity. Extend fragment instead of Activity. Delete the auto
  generated methods and replace them with public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle 
  savedInstanceState) method.
  
4) Build the UI for your fragment how you want it using the fragment's XML file.

5) Finally you need to build a MyTabsListener class, that will carry out the actual work of swapping your fragments 
  based on which tab has been selected. 


