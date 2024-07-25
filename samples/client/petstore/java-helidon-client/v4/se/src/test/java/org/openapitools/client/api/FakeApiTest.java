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

import java.math.BigDecimal;
import org.openapitools.client.model.ChildWithNullable;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.EnumClass;
import org.openapitools.client.model.FakeBigDecimalMap200Response;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import org.openapitools.client.model.ModelApiResponse;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterObjectWithEnumProperty;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.client.model.User;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.helidon.webclient.api.HttpClientResponse;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * 
 * OpenAPI Petstore Test
 *
 * 
 * API tests for FakeApi
 */
public class FakeApiTest {

    private static ApiClient apiClient;
    private static FakeApi api;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() {
        apiClient = ApiClient.builder().build();
        api = FakeApiImpl.create(apiClient);
    }

   /**
    * 
    * for Java apache and Java native, test toUrlQueryString for maps with BegDecimal keys
    */
    @Test
    public void fakeBigDecimalMapTest() {

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<FakeBigDecimalMap200Response> response = api.fakeBigDecimalMap();
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Health check endpoint
    */
    @Test
    public void fakeHealthGetTest() {

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<HealthCheckResult> response = api.fakeHealthGet();
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * test http signature authentication
    */
    @Test
    public void fakeHttpSignatureTestTest() {
        // TODO - assign values to the input arguments.
        Pet pet = null;
        // TODO - assign values to the input arguments.
        String query1 = null;
        // TODO - assign values to the input arguments.
        String header1 = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.fakeHttpSignatureTest(pet, query1, header1);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    * Test serialization of outer boolean types
    */
    @Test
    public void fakeOuterBooleanSerializeTest() {
        // TODO - assign values to the input arguments.
        Boolean body = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Boolean> response = api.fakeOuterBooleanSerialize(body);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    * Test serialization of object with outer number type
    */
    @Test
    public void fakeOuterCompositeSerializeTest() {
        // TODO - assign values to the input arguments.
        OuterComposite outerComposite = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<OuterComposite> response = api.fakeOuterCompositeSerialize(outerComposite);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    * Test serialization of outer number types
    */
    @Test
    public void fakeOuterNumberSerializeTest() {
        // TODO - assign values to the input arguments.
        BigDecimal body = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<BigDecimal> response = api.fakeOuterNumberSerialize(body);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    * Test serialization of outer string types
    */
    @Test
    public void fakeOuterStringSerializeTest() {
        // TODO - assign values to the input arguments.
        String body = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<String> response = api.fakeOuterStringSerialize(body);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    * Test serialization of enum (int) properties with examples
    */
    @Test
    public void fakePropertyEnumIntegerSerializeTest() {
        // TODO - assign values to the input arguments.
        OuterObjectWithEnumProperty outerObjectWithEnumProperty = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<OuterObjectWithEnumProperty> response = api.fakePropertyEnumIntegerSerialize(outerObjectWithEnumProperty);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * test referenced additionalProperties
    * 
    */
    @Test
    public void testAdditionalPropertiesReferenceTest() {
        // TODO - assign values to the input arguments.
        Map<String, Object> requestBody = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testAdditionalPropertiesReference(requestBody);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    * For this test, the body has to be a binary file.
    */
    @Test
    public void testBodyWithBinaryTest() {
        // TODO - assign values to the input arguments.
        File body = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testBodyWithBinary(body);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    * For this test, the body for this request must reference a schema named &#x60;File&#x60;.
    */
    @Test
    public void testBodyWithFileSchemaTest() {
        // TODO - assign values to the input arguments.
        FileSchemaTestClass fileSchemaTestClass = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testBodyWithFileSchema(fileSchemaTestClass);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    */
    @Test
    public void testBodyWithQueryParamsTest() {
        // TODO - assign values to the input arguments.
        String query = null;
        // TODO - assign values to the input arguments.
        User user = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testBodyWithQueryParams(query, user);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * To test \&quot;client\&quot; model
    * To test \&quot;client\&quot; model
    */
    @Test
    public void testClientModelTest() {
        // TODO - assign values to the input arguments.
        Client client = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Client> response = api.testClientModel(client);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    */
    @Test
    public void testEndpointParametersTest() {
        // TODO - assign values to the input arguments.
        BigDecimal number = null;
        // TODO - assign values to the input arguments.
        Double _double = null;
        // TODO - assign values to the input arguments.
        String patternWithoutDelimiter = null;
        // TODO - assign values to the input arguments.
        byte[] _byte = null;
        // TODO - assign values to the input arguments.
        Integer integer = null;
        // TODO - assign values to the input arguments.
        Integer int32 = null;
        // TODO - assign values to the input arguments.
        Long int64 = null;
        // TODO - assign values to the input arguments.
        Float _float = null;
        // TODO - assign values to the input arguments.
        String string = null;
        // TODO - assign values to the input arguments.
        File binary = null;
        // TODO - assign values to the input arguments.
        LocalDate date = null;
        // TODO - assign values to the input arguments.
        OffsetDateTime dateTime = null;
        // TODO - assign values to the input arguments.
        String password = null;
        // TODO - assign values to the input arguments.
        String paramCallback = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * To test enum parameters
    * To test enum parameters
    */
    @Test
    public void testEnumParametersTest() {
        // TODO - assign values to the input arguments.
        List<String> enumHeaderStringArray = null;
        // TODO - assign values to the input arguments.
        String enumHeaderString = null;
        // TODO - assign values to the input arguments.
        List<String> enumQueryStringArray = null;
        // TODO - assign values to the input arguments.
        String enumQueryString = null;
        // TODO - assign values to the input arguments.
        Integer enumQueryInteger = null;
        // TODO - assign values to the input arguments.
        Double enumQueryDouble = null;
        // TODO - assign values to the input arguments.
        List<EnumClass> enumQueryModelArray = null;
        // TODO - assign values to the input arguments.
        List<String> enumFormStringArray = null;
        // TODO - assign values to the input arguments.
        String enumFormString = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumQueryModelArray, enumFormStringArray, enumFormString);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Fake endpoint to test group parameters (optional)
    * Fake endpoint to test group parameters (optional)
    */
    @Test
    public void testGroupParametersTest() {
        // TODO - assign values to the input arguments.
        Integer requiredStringGroup = null;
        // TODO - assign values to the input arguments.
        Boolean requiredBooleanGroup = null;
        // TODO - assign values to the input arguments.
        Long requiredInt64Group = null;
        // TODO - assign values to the input arguments.
        Integer stringGroup = null;
        // TODO - assign values to the input arguments.
        Boolean booleanGroup = null;
        // TODO - assign values to the input arguments.
        Long int64Group = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * test inline additionalProperties
    * 
    */
    @Test
    public void testInlineAdditionalPropertiesTest() {
        // TODO - assign values to the input arguments.
        Map<String, String> requestBody = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testInlineAdditionalProperties(requestBody);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * test inline free-form additionalProperties
    * 
    */
    @Test
    public void testInlineFreeformAdditionalPropertiesTest() {
        // TODO - assign values to the input arguments.
        TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testInlineFreeformAdditionalProperties(testInlineFreeformAdditionalPropertiesRequest);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * test json serialization of form data
    * 
    */
    @Test
    public void testJsonFormDataTest() {
        // TODO - assign values to the input arguments.
        String param = null;
        // TODO - assign values to the input arguments.
        String param2 = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testJsonFormData(param, param2);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * test nullable parent property
    * 
    */
    @Test
    public void testNullableTest() {
        // TODO - assign values to the input arguments.
        ChildWithNullable childWithNullable = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testNullable(childWithNullable);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * 
    * To test the collection format in query parameters
    */
    @Test
    public void testQueryParameterCollectionFormatTest() {
        // TODO - assign values to the input arguments.
        List<String> pipe = null;
        // TODO - assign values to the input arguments.
        List<String> ioutil = null;
        // TODO - assign values to the input arguments.
        List<String> http = null;
        // TODO - assign values to the input arguments.
        List<String> url = null;
        // TODO - assign values to the input arguments.
        List<String> context = null;
        // TODO - assign values to the input arguments.
        String allowEmpty = null;
        // TODO - assign values to the input arguments.
        Map<String, String> language = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testQueryParameterCollectionFormat(pipe, ioutil, http, url, context, allowEmpty, language);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * test referenced string map
    * 
    */
    @Test
    public void testStringMapReferenceTest() {
        // TODO - assign values to the input arguments.
        Map<String, String> requestBody = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.testStringMapReference(requestBody);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * uploads an image (required)
    * 
    */
    @Test
    public void uploadFileWithRequiredFileTest() {
        // TODO - assign values to the input arguments.
        Long petId = null;
        // TODO - assign values to the input arguments.
        File requiredFile = null;
        // TODO - assign values to the input arguments.
        String additionalMetadata = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<ModelApiResponse> response = api.uploadFileWithRequiredFile(petId, requiredFile, additionalMetadata);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

}
