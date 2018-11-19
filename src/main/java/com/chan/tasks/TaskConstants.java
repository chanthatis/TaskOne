package com.chan.tasks;

public interface TaskConstants {

    String BASE_API_URL = "https://dog.ceo/api";
    String RETRIEVE_ALL = "/breeds/list/all";
    String RETRIEVE_SUB_BREEDS = "/breed/XXXX/list";
    String RETRIEVE_RANDOM_SUB_BREED_IMG = "/breed/XXXX/YYYY/images/random";

    String STANDARD_TEST_FAIL_JSON = "{STATUS : FAILED, MESSAGE : UNKNOWN INTERNAL ERROR}";
}
