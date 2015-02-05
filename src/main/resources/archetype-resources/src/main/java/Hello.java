#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/simple")
public class Hello {
	@GET
	public String hello() {
		return "Hello World";
	}
}
