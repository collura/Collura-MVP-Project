package example.collura.colluramvp.mvp.mainactivity;



interface MainActivity {
        void callSecondActivity();
        void getPreferencesData();
        void getNetworkData();
        void preferencesDatacallback( String data );
        void networkDataCallback( String data );
}
