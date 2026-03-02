import java.util.*;
public class UC4 {
    public static void main(String[] args) {

        // String array storing all 7 lines of the OOPS banner
        String[] bannerLines = {

            String.join("   ",
                    " *****   ", " *****   ", " *****   ", " *****   "),

            String.join("   ",
                    "**   **  ", "**   **  ", "**   **  ", "**       "),

            String.join("   ",
                    "**   **  ", "**   **  ", "**   **  ", "**       "),

            String.join("   ",
                    "**   **  ", "**   **  ", " *****   ", " *****   "),

            String.join("   ",
                    "**   **  ", "**   **  ", "**        ", "      **"),

            String.join("   ",
                    "**   **  ", "**   **  ", "**        ", "      **"),

            String.join("   ",
                    " *****   ", " *****   ", "**        ", " *****   ")
        };

        // for-each loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}