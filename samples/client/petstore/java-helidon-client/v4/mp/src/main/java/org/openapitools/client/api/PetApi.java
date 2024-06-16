/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.io.File;
import org.openapitools.client.model.ModelApiResponse;
import java.util.Optional;
import org.openapitools.client.model.Pet;
import java.util.Set;

/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("")
public interface PetApi  {

    /**
     * Add a new pet to the store
     * 
     */
    @POST
    @Path("/pet")
    @Consumes({ "application/json", "application/xml" })
    void addPet(Pet pet) throws ApiException, ProcessingException;

    /**
     * Deletes a pet
     * 
     */
    @DELETE
    @Path("/pet/{petId}")
    void deletePet(@PathParam("petId") Long petId, @HeaderParam("api_key") String apiKey) throws ApiException, ProcessingException;

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     */
    @GET
    @Path("/pet/findByStatus")
    @Produces({ "application/xml", "application/json" })
    List<Pet> findPetsByStatus(@QueryParam("status") List<String> status) throws ApiException, ProcessingException;

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @deprecated
     */
    @Deprecated
    @GET
    @Path("/pet/findByTags")
    @Produces({ "application/xml", "application/json" })
    Set<Pet> findPetsByTags(@QueryParam("tags") Set<String> tags) throws ApiException, ProcessingException;

    /**
     * Find pet by ID
     * Returns a single pet
     */
    @GET
    @Path("/pet/{petId}")
    @Produces({ "application/xml", "application/json" })
    Pet getPetById(@PathParam("petId") Long petId) throws ApiException, ProcessingException;

    /**
     * Update an existing pet
     * 
     */
    @PUT
    @Path("/pet")
    @Consumes({ "application/json", "application/xml" })
    void updatePet(Pet pet) throws ApiException, ProcessingException;

    /**
     * Updates a pet in the store with form data
     * 
     */
    @POST
    @Path("/pet/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    void updatePetWithForm(@PathParam("petId") Long petId, @FormParam("name") String name, @FormParam("status") String status) throws ApiException, ProcessingException;

    /**
     * uploads an image
     * 
     */
    @POST
    @Path("/pet/{petId}/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    ModelApiResponse uploadFile(@PathParam("petId") Long petId, @FormParam("additionalMetadata") String additionalMetadata, @FormParam("file") File _file) throws ApiException, ProcessingException;

    /**
     * uploads an image (required)
     * 
     */
    @POST
    @Path("/fake/{petId}/uploadImageWithRequiredFile")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    ModelApiResponse uploadFileWithRequiredFile(@PathParam("petId") Long petId, @FormParam("requiredFile") File requiredFile, @FormParam("additionalMetadata") String additionalMetadata) throws ApiException, ProcessingException;
}
