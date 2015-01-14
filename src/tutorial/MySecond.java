package tutorial;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RequestScoped
@Path("/second")
public class MySecond {
	@GET
	@Path("/{id}")
	public String greet(@PathParam(value = "id") String id) {
		return "Hi visitor! You sent " + id;
	}
}
