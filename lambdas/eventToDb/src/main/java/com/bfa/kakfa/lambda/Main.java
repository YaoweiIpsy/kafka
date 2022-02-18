package com.bfa.kakfa.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main implements RequestStreamHandler {

  @Override
  public void handleRequest(InputStream input, OutputStream output, Context context)
      throws IOException {

  }
}
