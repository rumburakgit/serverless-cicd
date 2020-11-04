package serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorld implements RequestHandler<HelloWorldInput, HelloWorldOutput> {

	public HelloWorldOutput handleRequest(HelloWorldInput input, Context context) {
      HelloWorldOutput output = new HelloWorldOutput();
      output.setMessage("Witam " + input.getName() + ", w swiecie Serverless!!!");
      return output;
	}

}
