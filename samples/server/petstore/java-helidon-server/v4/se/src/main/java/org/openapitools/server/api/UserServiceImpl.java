package org.openapitools.server.api;

import java.util.stream.Collectors;
import org.openapitools.server.model.GenericTypes;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.OffsetDateTime;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.User;
import jakarta.validation.Valid;
import java.util.logging.Logger;import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class UserServiceImpl implements UserService {

    private static final int HTTP_CODE_NOT_IMPLEMENTED = 501;
    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void createUser(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator(LOGGER);


        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

    @Override
    public void createUsersWithArrayInput(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator(LOGGER);


        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

    @Override
    public void createUsersWithListInput(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator(LOGGER);


        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

    @Override
    public void deleteUser(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator(LOGGER);


        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

    @Override
    public void getUserByName(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator(LOGGER);


        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

    @Override
    public void loginUser(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator(LOGGER);


        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

    @Override
    public void logoutUser(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator(LOGGER);


        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

    @Override
    public void updateUser(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator(LOGGER);


        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service UserService is down. Goodbye!");
    }

}
