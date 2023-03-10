package health.medunited.pwdchanger.resource;

import health.medunited.pwdchanger.service.PasswordChangerService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/")
public class PasswordChangerResource {

    @Inject
    PasswordChangerService passwordChangerService;


    @POST
    @Path("/changePIN")
    @Produces(MediaType.TEXT_PLAIN)
    public String setPin() {
        System.out.println(" ");
        System.out.println("Inside Resource File");
        return passwordChangerService.changePin();
    }

    @GET
    @Path("/getCard")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPinInfo() {
        System.out.println(" ");
        System.out.println("Inside Resource File");
        return passwordChangerService.getCard();
    }

    @GET
    @Path("/getStatus")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPINStatus() {
        System.out.println(" ");
        System.out.println("Inside Resource File");
        return passwordChangerService.getCardDetails();
    }

}
