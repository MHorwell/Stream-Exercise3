package streamExerciseThree;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExerciseThree {

	public static void main(String[] args) {

		List<String> daleIntro = Arrays.asList("Hello", "It's", "Dale");
		Optional<String> daleIntroConcatenated = daleIntro.stream().reduce((stringOne, stringTwo) -> stringOne + " " + stringTwo);
		daleIntroConcatenated.ifPresent(System.out::println);

	}

}
