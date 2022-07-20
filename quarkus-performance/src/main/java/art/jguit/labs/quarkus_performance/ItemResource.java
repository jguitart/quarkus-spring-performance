package art.jguit.labs.quarkus_performance;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/item")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemResource {

    @Inject
    ItemService itemService;

    @GET
    public Response list() {
        List<Item> items = itemService.list();
        return Response.ok(items).build();
    }

    @POST
    public Response create() {
        itemService.create();
        return Response.ok().build();
    }
}