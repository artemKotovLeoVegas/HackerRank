package com.project;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SherlockAndValidStringTest {

    private final SherlockAndValidString sherlockAndValidString = new SherlockAndValidString();

    @ParameterizedTest(name = "Validating string {0}.")
    @MethodSource("testData")
    public void sherlockAndValidStringTest(String str, String expectedResult) {
        assertNotNull(str);
        assertEquals(expectedResult, sherlockAndValidString.isValid(str));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments("aabbcd", "NO"),
                arguments("aabbccddeefghi", "NO"),
                arguments("abcdefghhgfedecba", "YES"),
                arguments("aabbc", "YES"),
                arguments("abbac", "YES"),
                arguments("aabbcc", "YES"),
                arguments("aaaabbcc", "NO"),
                arguments("aaaaabc", "NO"),
                arguments("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbi" +
                        "baeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadee" +
                        "aheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeib" +
                        "gaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahg" +
                        "ihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaic" +
                        "cededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbac" +
                        "gffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifd" +
                        "cbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbb" +
                        "fcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfii" +
                        "fdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihd" +
                        "heefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfba" +
                        "ggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaaded" +
                        "fageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgch" +
                        "hiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd", "YES"),
                arguments("aaaaabc", "NO")
        );
    }
}
