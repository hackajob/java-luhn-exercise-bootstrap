package uk.co.argos.interview.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CardNumberValidationServiceTest {

    private static final String VALID_CARD_NUMBER = "4242424242426742";

    private static final String INVALID_CARD_NUMBER = "111111111111111";

    private static CardNumberValidationService cardNumberValidationService;

    @BeforeAll
    static void beforeAll() {
        cardNumberValidationService = new CardNumberValidationService();
    }

    // TODO: Unit test me :)

}
