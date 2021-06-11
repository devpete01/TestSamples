package com.toche.challenge;

import com.toche.challenge.model.Challenge;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ChallengeApplicationTests {

	@Test
	void contextLoads() {}

	@Test
	void isPassingTest() {
		Challenge challenge1 = new Challenge("Longest river in the world", "Mississippi", true);
		Challenge challenge2 = new Challenge("Capital of United State", "Washington DC", true);
		Challenge challenge3 = new Challenge("Smallest unit of information", "Bit", true);
		Challenge challenge4 = new Challenge("How many continents do we have", "7", true);
		Challenge challenge5 = new Challenge("Highest mountain", "Everest", true);
		Challenge challenge6 = new Challenge("Longest river in the world", "Mississippi", true);
		Challenge challenge7 = new Challenge("First letter of english alphabet", "A", true);
		Challenge challenge8 = new Challenge("Who is the father of Calculator", "Charles Babbage", false);
		Challenge challenge9 = new Challenge("What has mass and occupies space", "Matter", true);
		Challenge challenge10 = new Challenge("How many months do we have in a year", "12", true);

		Collection<Challenge> challenges  = Arrays.asList(challenge1, challenge2, challenge3, challenge4, challenge5, challenge6, challenge7, challenge8, challenge9, challenge10);

		assertThat(Challenge.isPassing(challenges)).isEqualTo(Boolean.TRUE);
	}

}
