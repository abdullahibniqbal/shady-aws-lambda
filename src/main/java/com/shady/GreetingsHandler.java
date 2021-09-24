package com.shady;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GreetingsHandler implements RequestHandler<ShadyRequest, String> {

    @Override
    public String handleRequest(ShadyRequest shadyRequest, Context context) {
        return shadyRequest.getName();
    }
}
