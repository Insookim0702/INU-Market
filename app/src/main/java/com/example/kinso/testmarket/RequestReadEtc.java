package com.example.kinso.testmarket;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kinso on 2019-01-24.
 */

public class RequestReadEtc extends StringRequest {
    //final static private String URL = "http://192.168.0.6:80/HTphp/etcread.php";
    final static private String URL = "http://13.209.3.191/readetc.php";
    //final static private String URL = "http://10.93.10.93:80/HTphp/etcread.php";
    //final static private String URL = "http://192.168.0.10:80/HTphp/etcread.php";
    //final static private String URL = "http://10.93.253.20:80/HTphp/etcread.php";
    private Map<String, String> parameters;
    public RequestReadEtc(String WriteNum, Response.Listener<String> listener){
        super(Method.POST, URL,listener,null);
        parameters =new HashMap<>();
        parameters.put("DataWriteNum",WriteNum);

    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError{
        return parameters;
    }
}