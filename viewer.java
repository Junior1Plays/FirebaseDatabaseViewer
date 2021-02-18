	private RequestNetwork rn;
	private RequestNetwork.RequestListener _rn_request_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		initialize(_savedInstanceState);
		initializeLogic();
	}

private void initializeLogic() {
		rn.startRequestNetwork(RequestNetworkController.GET, "https://jsfilmes-83bea-default-rtdb.firebaseio.com/.json", "json", _rn_request_listener);
	}

	_rn_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				console.log(_response);
			}
