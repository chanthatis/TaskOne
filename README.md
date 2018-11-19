# TaskOne

This has been implemented as per following instructions:


## Task 1 - Public API - https://dog.ceo/dog-api/

Using the above mentioned API perform the following calls.

 1. Perform an API request to produce a list of all dog breeds.
 2. Using code, verify “retriever” breed is within the list.
 3. Perform an API request to produce a list of sub-breeds for "retriever". 
 4. Perform an API request to produce a random image / link for the sub-breed "golden".

## Source Explanation

 - **testParams.properties** : This file has test parameters. You can update breed & sub-breed and test.
 - **TaskConstants.java**: This interface has API paths. These paths doesn't need update until something changes in the public API.
 - **TaskOne.java**: This Java class has core implementation of the tasks. Above mentioned 4 calls have been separated as sub-tasks and called from main.
