# Trello API Test Project

This project includes a test case that performs basic Trello operations using the Trello API.

## About the Project

This project was created to test the Trello API using the `RestAssured` library. It includes basic Trello operations (create board, create list, create cards, update card name, delete cards, delete board).

After all operations, it checks the ResponseBodies and if successful, it prints the necessary logs both to the console and to mylog.log under the log folder.

## How to Use

1. **API Key and Token Acquisition:**
   The project requires a valid API key and token to use the Trello API. You can get this information from [Trello Developer](https://developer.atlassian.com/cloud/trello/rest/).

2. **Installing Maven Dependencies:**
   To install project dependencies, enter the following command in the terminal or command prompt:


```bash
mvn clean install
```

3. **Running the TrelloTest Class:**
You can start the test case by running the TrelloTest class located in the project main directory.

```bash
mvn test
```

## Project Structure
- **tests/TrelloBoard:** Class that performs Trello related operations.
- **tests/TrelloTest:** JUnit test class written to test the TrelloBoard class.
- **utils/LoggerUtil:** Helper class that handles logging operations.

### Test Scenario Stages
1. **Board Creation:**
The TrelloBoard class creates a Trello board with a specified name.

2. **List Creation:**
Creates a Trello list with a specified name on the created board.

3. **Board Creation:**
Creates two Trello cards with two specified names on the created list.

4. **Update Card Name:**
Updates the name of a random card.

5. **Delete Cards:**
Deletes the created cards.

6. **Deleting Board:**
Deletes the created board.

### Notes
- This project was created to test a simple scenario by interacting with the Trello API.
- You must obtain a valid `Trello API key` and `token` before running the project.
