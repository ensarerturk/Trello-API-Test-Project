package tests;

import io.restassured.RestAssured;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrelloTest {

    private static final String API_KEY = "db1f4d294bee59e6eb14e87ef25a82a8";
    private static final String TOKEN = "ATTAbf51af6b0ce5e0a55f381e4c565fb5af4f4d9cee7e2f7c25de861254ee7861b54D623555";
    private static TrelloBoard trelloBoard;

    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://api.trello.com/1";
        trelloBoard = new TrelloBoard(API_KEY, TOKEN);
    }

    @Test
    public void testTrelloWorkflow() {
        trelloBoard.createBoard("New_Pano");

        trelloBoard.createList("New_List1");
        trelloBoard.createList("New_List2");

        trelloBoard.createCard("New_Card1");
        trelloBoard.createCard("New_Card2");

        trelloBoard.updateCardName("Updated_Card");

        trelloBoard.deleteAllCards();

        trelloBoard.deleteBoard();
    }

    @AfterClass
    public static void tearDown() {
        RestAssured.reset();
    }
}