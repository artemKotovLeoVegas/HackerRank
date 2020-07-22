public class CountingValleys {
    // https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    static int countingValleys(int n, String s) {
        int valleysCount = 0;
        int stepsUpAtSeaLevel = 0;
        int stepsDownAtSeaLevel = 0;
        boolean isValleyStarted = false;
        for (String step: s.split("(?!^)")) {
            if (step.equalsIgnoreCase("u")) {
                stepsUpAtSeaLevel++;
            } else {
                stepsDownAtSeaLevel++;
            }
            if (stepsDownAtSeaLevel == 1 && stepsUpAtSeaLevel == 0 && !isValleyStarted) {
                valleysCount++;
                isValleyStarted = true;
            }
            if (stepsUpAtSeaLevel == stepsDownAtSeaLevel) {
                stepsUpAtSeaLevel = 0; stepsDownAtSeaLevel = 0;
                isValleyStarted = false;
            }
        }
        return valleysCount;
    }

    public static void main(String[] args) {
        System.out.println("Expected 1: " + countingValleys(8, "UDDDUDUU"));
        System.out.println("Expected 2: " + countingValleys(12, "DDUUDDUDUUUD"));
    }
}
